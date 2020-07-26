# Elle Experiments 

### Workload Scope 

1. Integration of `Ramcloud` with `Jepsen` 
    - `Preconfigured Ramcloud` repository Jepsen can install the RamCloud
        - Jepsen uses Linux command API to install the database 
        - Allowing the Jepsen to run make is suffice
    - `Predefined with a fixed choices of Ramcloud requests` can easily implement Jepsen Client 
        - `Etcd` client contains `426 lines` of code
            - Jepsen client converts Java code to http requests
        -  `Redis` and `Yugabyte` client contains `1692 ~ 2581 lines` of code
            - The complexity of the client-side is due to the number of configurable arguments of the database requests 
                - For example, consistency level, locks, synchronous, asynchronous
     
2. Understanding the results from Elle
    - `Redis` provides a simple but primitive example  
    - `Yugabyte` provides a complex consistency check with half-baked code 

### Conclusion 
- Integrating the Ramcloud with Jepsen I/O is not a big deal 
- Understanding how to **properly run the Elle is important**


### Reference 
- [Etcd client](https://github.com/aphyr/verschlimmbesserung)
- [Redis client](https://github.com/ptaoussanis/carmine)
- [Yugabyte client](https://github.com/yugabyte/cassaforte)

