# Object Pool

This design pattern manages a pool of reusable objects, which can be checked out from the pool and then returned.

The main goal is to reduce the overhead of creating multiple instances of an object and destroying them during the execution time. Normally, an application creates an object, use it and then discards. This can be inefficient if the creation or destruction is expensive and if this occur many times in the execution.

The pattern solves this problem by managing a pool of objects. At initialization, it creates a fixed number of elements and mantain them. When the application needs, it requests an object and them return to the pool, when done. 

Note that this approach may have to handle thread safety with there are multiple threads. Like a lock for object, for instance.