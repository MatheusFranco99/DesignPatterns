# Singleton

Sometimes we want to create only one instance of a class. For example, when the class manages a shared resource.

A common approach is to create a class with a private constructor and a static method that returns a single instance of the class.
The method checks if it has already been created and, if not, calls the private constructor.

Note that this implementation isn't thread safe.

A better implementation is to use a static variable that holds the instance, alongside with the private constructor. It can be combined with a mutex or other synchronization mechanism.