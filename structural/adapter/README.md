# Adapter

This design pattern allows objects with incomptible interfaces to work together.
The usual approach would be to modify the interface to reach compatibiliy. However, this may require changes in other affected codes and, also, the adapter pattern turn things more flexible and modular and allows for code reuse and allows objects to have different interfaces.

In this design pattern, there are three components: the client, the adaptee and the adapter.

### Example
Suppose we have an existing Rectangle class that has a draw() method that takes two parameters, the X and Y coordinates of the top-left corner of the rectangle and its width and height. Now suppose we want to use this Rectangle class in a new GraphicsEditor class that has a drawShape() method that takes a Shape object as its parameter.

However, the Shape interface has a different method signature than the Rectangle class, so we cannot pass the Rectangle object directly to the drawShape() method. In this case, we can use the Adapter pattern to create a new RectangleAdapter class that implements the Shape interface and uses the Rectangle object to draw a rectangle.