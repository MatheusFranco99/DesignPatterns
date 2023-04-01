# Builder Pattern

The builder pattern is useful for building complex objects step by step.

Suppose you have a "House" class with many possible parameters. However, there are many different types of houses that you may want to create and you decide to create as many subclasses as needed. A problem is that, when a feature is added or removed, all subclasses would need to be changed.

Another solution that may appear is implementation a complex constructor on the base class that allows for all different types of houses. The problem is that the code for creating houses would become ugly. Also, the addition or removal or features would imply changing each code.

A better solution for this is to create a secondary class, HouseBuilder, which has many methods as necessary for buiding a house. It would have methods like: setWalls(), setDoors(), setRood(), ..., and, finally, build().