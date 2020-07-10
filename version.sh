git config credential.helper store
git pull origin master
HOSTS="$(cat /etc/hostname)"
LOCATION="$(pwd)"
VERSION=3

if [ "$1" = "commit" ]
then
  git add .
  git commit -m "$2"
  git push origin master

elif [ "$1" = "clojure" ]
then
    if [ "$2" = "create_project" ]
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

elif [ "$1" = "jepsen" ]
then

    if [ -z "$2" ]
    then
        echo "no program to run"
        exit
    fi

    if [ "$2" = "scaffolding" ]
    then
        cd /
        rm -rf jepsen.etcdemo
        lein new jepsen.etcdemo
        cp scaffolding/project.clj /jepsen.etcdemo
        cp scaffolding/etcdemo.clj /jepsen.etcdemo/src/jepsen/etcdemo.clj

    else # database, client
        cp $2/etcdemo.clj /jepsen.etcdemo/src/jepsen/etcdemo.clj
    fi

    cd /jepsen.etcdemo
    lein run test

else
  echo "no argument"

fi
