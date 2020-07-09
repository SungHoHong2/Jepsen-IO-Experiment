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

    if [ "$1" = "create project" ]
    then
        lein new tutorial
        echo "project created"
    fi

else
  echo "no argument"

fi
