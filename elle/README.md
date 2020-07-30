# Elle Experiments 


### Consistency Level 

Name | Description | 
------------ | ------------ | 
Read uncommitted | a consistency model which prohibits dirty writes, where two transactions modify the same object concurrently before committing. | 
Read committed | a consistency model which strengthens read uncommitted by preventing dirty reads. | 
Repeatable read | a consistency model closely related to serializability, but unlike serializable, it allows phantoms. |
Snapshot Isolation | Each transaction appears to operate on an independent, consistent snapshot of the database. Its changes are visible only to that transaction until commit time, when all changes become visible atomically. | 
Serializability | a serializability means that transactions appear to have occurred in some total order. serializability does not require a per-process order between transactions. A process can observe a write, then fail to observe that same write in a subsequent transaction. |
Strict Serializability | Operations appear to have occurred in some order, consistent with the real-time ordering of those operations. | 

### Reference 
- [Etcd client](https://github.com/aphyr/verschlimmbesserung)
- [Redis client](https://github.com/ptaoussanis/carmine)
- [Yugabyte client](https://github.com/yugabyte/cassaforte)

