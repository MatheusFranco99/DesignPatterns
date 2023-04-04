package simple_factory;

public class simple_factory {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizza cheesePizza = factory.createPizza("cheese");
        Pizza pepperoniPizza = factory.createPizza("pepperoni");

        System.out.println(cheesePizza);
        System.out.println(pepperoniPizza);
    }
}


abstract class Pizza {
}

class Cheesepizza extends Pizza {
    public String toString() {
        return "Chesse pizza";
    }

}
class PepperoniPizza extends Pizza {
    public String toString() {
        return "Pepperoni pizza";
    }
}

class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new Cheesepizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza type.");
        }
    }
}