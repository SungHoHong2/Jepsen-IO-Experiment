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

    elif [ "$2" = "hello_world" ]
    then
        cp clojure/hello_world/project.clj /tutorial/project.clj
        cp clojure/hello_world/core.clj /tutorial/src/tutorial/core.clj
        cd /tutorial
        lein run

    elif [ "$2" = "statement" ]
    then
        cp clojure/statement/project.clj /tutorial/project.clj
        cp clojure/statement/core.clj /tutorial/src/tutorial/core.clj
        cd /tutorial
        lein run

    fi

else
  echo "no argument"

fi
