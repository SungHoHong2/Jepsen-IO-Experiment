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

    if [ "$2" = "elle" ]
    then
        cd /Jepsen-IO-Experiment/
        cp elle/project.clj /jepsen.etcdemo/project.clj
        cp elle/src/core.clj /jepsen.etcdemo/src/jepsen/elle/core.clj
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



else
  echo "no argument"

fi
