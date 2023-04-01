# Simple Factory

The main difference between Simple Factory and Factory Method/Abstract Factory is the level os abstraction / responsability they take on.

The simple factory pattern provides a single factory class that create object of multiple types based on some inputs. For example, if you have the following code:

````java
void orderPizza(String type) {
    Pizza pizza;
    if type.equals("Cheese") {
        pizza = new CheesePizza();
    } else if type.equals("Pomodoro") {
        pizza = new PomodoroPizza();
    }
    // etc

    // ...
}
````

It's advisable to apply the simple factory pattern and create a factory class.


The Factory Method pattern, on the other hand, provides an interface for creating objects in a superclass, but allows subclasses to alter the type of object that will be created.

The Abstract Factory pattern is similar to the Factory Method but it provides an interface for creating family of related or dependent objects.