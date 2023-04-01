# Abstract Factory Pattern

Sometimes, based on some input, you may instance many different classes that belongs to a family. For example, it's common code like:

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

In this situation, when new types of pizza need to be added or removed, the code needs to be replaced on any section in which there are pizza creation.

The abstract factory defines an interface for creating different classes that belongs to a family.
