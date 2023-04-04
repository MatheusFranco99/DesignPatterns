package factory_method;

public class factory_method {
    public static void main(String[] args) {
        CharacterFactory factory = new WarriorFactory();
        Character character = factory.createCharacter();
        character.move(); // Output: Warrior is moving.
        character.attack(); // Output: Warrior is attacking with a sword.
    }
}

abstract class Character {
    public abstract void move();
    public abstract void attack();
}

class Warrior extends Character {
    public void move() {
        System.out.println("Warrior is moving.");
    }

    public void attack() {
        System.out.println("Warrior is attacking with a sword.");
    }
}

class Mage extends Character {
    public void move() {
        System.out.println("Mage is moving.");
    }

    public void attack() {
        System.out.println("Mage is casting a spell.");
    }
}

abstract class CharacterFactory {
    public abstract Character createCharacter();
}

class WarriorFactory extends CharacterFactory {
    public Character createCharacter() {
        return new Warrior();
    }
}

class MageFactory extends CharacterFactory {
    public Character createCharacter() {
        return new Mage();
    }
}


