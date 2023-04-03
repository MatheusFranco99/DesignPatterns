# Lazy initialization

This design pattern defer the creation of an object until it's needed. Usually, everything that will be used is loaded on the start of the program. Nevertheless, this can be inefficient if a resource won't be loaded in the beginning.

This design pattern delays the initilization until the object is requested, and then return the created object always when requested.

This is useful in systems in which resources are limited.