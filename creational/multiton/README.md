# Multiton

This design pattern is a variation of the singleton pattern. However, instead of creating only once instance, it creates multiple instances and assigns each to a key.

The class, then, controls the instances, returning the created ones upon a key, or creating new ones.

This is useful when we want a persistent (between functions) instance of a class but that may have different configurations.
