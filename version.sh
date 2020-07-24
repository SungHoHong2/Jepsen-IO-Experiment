git config credential.helper store
git pull origin master
HOSTS="$(cat /etc/hostname)"
LOCATION="$(pwd)"
VERSION=3
TIMESTAMP=`date "+%Y%m%d-%H%M%S"`


if [ "$1" = "commit" ]
then
  git add .
  git commit -m "$2"
  git push origin master

elif [ "$1" = "clojure" ]
then
    if [ "$2" = "init" ]
    then
        cd /
        rm -rf tutorial
        lein new tutorial
        echo "project created"
    else
        if [ -z "$2" ]
        then
            echo "no program to run"
            exit
        fi

        if [ "$2" = "file" ]
        then
            cp clojure/file/example.txt /tutorial/
        fi

        cp clojure/$2/project.clj /tutorial/project.clj
        cp clojure/$2/core.clj /tutorial/src/tutorial/core.clj
        cd /tutorial
        lein run
    fi

# ./version jepsen ( scaffolding, database, client, checker(+ time-limit), elle)
elif [ "$1" = "jepsen" ]
then

    if [ -z "$2" ]
    then
        echo "no program to run"
        exit
    fi

    # copy the dependencies
    if [ "$2" = "scaffolding" ]
    then
        cd /
        rm -rf jepsen.etcdemo
        lein new jepsen.etcdemo

        cd /Jepsen-IO-Experiment/
        cp scaffolding/project.clj /jepsen.etcdemo/project.clj
    fi

    # copy the main function
    cp $2/etcdemo.clj /jepsen.etcdemo/src/jepsen/etcdemo.clj

    # invoke the main function
    cd /jepsen.etcdemo
    lein run test
    echo "completed $2 test case"

    # migrate the invalid results
    if test -f "/jepsen.etcdemo/store/latest/linear.svg"; then
        echo "invalid result detected copying the result to repo ... "
        cd /Jepsen-IO-Experiment/
        cp /jepsen.etcdemo/store/latest/linear.svg debug/linear-$TIMESTAMP.svg
        cp /jepsen.etcdemo/store/latest/history.txt debug/history-$TIMESTAMP.txt
        git add .
        git commit -m "updated debugged SVG"
        git push origin master
    fi

elif [ "$1" = "elle" ]
then
    if [ "$2" = "outside_docker" ]
    then
        echo "outside the container"
        echo "git clone https://github.com/jepsen-io/jepsen"
        echo "commit 556d30549c469d5a39a0186d7e5e2af4a014d8b5, branch master, Date: Mon Jun 29 12:07:08 2020 -0400"
        echo "[Update]: Modified installation of git inside every node"
        cp elle/update/docker/Dockerfile /home/users/sungho/jepsen/docker/node/Dockerfile

    elif [ "$2" = "inside_docker" ]
    then
        echo "git clone https://github.com/jepsen-io/redis.git"
        echo "commit 6c857fb16f7977cff21756acc99eb302cfdd11bd, branch: master, Date: Tue Jun 23 10:17:12 2020 -0400"
        echo "[Update]: modify to a valid link to the git repo"
        cp elle/update/jepsen/db.clj /jepsen/redis/src/jepsen/redis/

    elif [ "$2" = "run" ]
    then
        cd /redis
        # updates the changes for all the nodes
        lein install
        # run the test
        lein run test-all

    elif [ "$2" = "debug" ]
    then

        if [ -z "$3" ]
        then
            echo "no directory to run"
            exit
        fi

        # ./version.sh elle redis
        cp elle/$3/append.clj /jepsen/redis/src/jepsen/redis/
        cp elle/$3/client.clj /jepsen/redis/src/jepsen/redis/
        cp elle/$3/core.clj /jepsen/redis/src/jepsen/redis/
        cp elle/$3/db.clj /jepsen/redis/src/jepsen/redis/
        cp elle/$3/nemesis.clj /jepsen/redis/src/jepsen/redis/

        cd /redis
        lein install
        lein run test-all

    fi

else
  echo "no argument"

fi
