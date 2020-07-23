### Redis Jepsen Test  

- `Jepsen` distributed systems testing library
- uses `Elle` to find transactional anomalies up to strict serializability

```
cd jepsen/docker 
sudo apt install graphviz 
git clone https://github.com/jepsen-io/redis.git
lein run test-all
```

 
```
sudo -S -u root bash -c "cd /tmp/jepsen/build; git clone git@github.com:antirez/redis.git redis

```