Spring @Transactional mistakes everyone did https://medium.com/javarevisited/spring-transactional-mistakes-everyone-did-31418e5a6d6b

# Intro
A transaction is a sequence of database operations that must be atomic (all succeed or none succeed). The four key properties of a transaction (ACID) are:

1.	Atomicity – All operations complete successfully or none of them are applied.
2.	Consistency – The database remains in a valid state before and after the transaction.
3.	Isolation – Concurrent transactions do not interfere with each other.
4.	Durability – Committed transactions are permanently saved.


# Propagation Types

Spring allows controlling how transactions interact using propagation behaviors.

    Propagation Type	Behavior
    REQUIRED (Default)	Uses the existing transaction or creates a new one.
    REQUIRES_NEW	Always creates a new transaction, suspends existing one.
    NESTED	Creates a nested transaction inside an existing one.
    MANDATORY	Requires an existing transaction; throws an exception if none exists.
    NEVER	Ensures no transaction exists; throws an exception if called within a transaction.
    SUPPORTS	Runs with or without a transaction (does not create one).
    NOT_SUPPORTED	Runs without a transaction, suspending any existing transaction.

5. Isolation Levels

Isolation levels define how transaction concurrency is handled.

    Isolation Level	Prevents
    DEFAULT	                Uses database default isolation level.
    READ_UNCOMMITTED	No protection against dirty reads, non-repeatable reads, or phantom reads.
    READ_COMMITTED	        Prevents dirty reads, allows non-repeatable reads and phantom reads.
    REPEATABLE_READ	        Prevents dirty and non-repeatable reads, but allows phantom reads.
    SERIALIZABLE	        Fully isolates transactions, highest consistency but worst performance.


