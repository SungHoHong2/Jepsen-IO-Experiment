# Jepsen-IO-Experiment

- assuming that we are following the docker-compose tutorial 

```
>> install docker compose
sudo curl -L "https://github.com/docker/compose/releases/download/1.26.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
sudo ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose

>> install Jepsen
git clone https://github.com/jepsen-io/jepsen.git

>> removed in up.sh
set -- "${POSITIONAL[@]}" # restore positional parameters

>> set up docker containers to run Jepsen
sudo ./up.sh

>> login
sudo docker exec -it jepsen-control bash

```