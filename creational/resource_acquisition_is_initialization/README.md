# Resource acquisition is initialization (RAII)

This is a design pattern used to manage acquisition and release of resources.

Resources need to be acquired and released properly to avoid memory leaks. The usual approach to that is to manually allocate and release. However, we can forget to release or release it multiple times.

RAII encapsulates the resource as an object and uses the object constructor and destructor. This way, the resource management is tied to the object's lifetime.

This design pattern is often used in C++ and not in Java, that uses garbage collection to manage memory.