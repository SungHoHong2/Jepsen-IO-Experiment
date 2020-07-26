### Redis Test  

- `Jepsen` distributed systems testing library
- uses `Elle` to find transactional anomalies up to strict serializability

```
git clone https://github.com/jepsen-io/redis.git
lein run test-all
```

### YugaByte Test

```
cd jepsen/yugabyte 
lein run test -o debian --version 1.2.10.0 --url https://downloads.yugabyte.com/yugabyte-ce-1.2.10.0-linux.tar.gz --workload ycql/counter --nemesis partition

``` 

