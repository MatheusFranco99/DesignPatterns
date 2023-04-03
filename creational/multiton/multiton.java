package creational.multiton;

import java.util.HashMap;
import java.util.Map;

class Multiton {
    private static final Map<String, Multiton> instances = new HashMap<>();
    private String key;
    private Multiton(String key) {
        this.key = key;
    }

    public static synchronized Multiton getInstance(String key) {
        if (!instances.containsKey(key)) {
            instances.put(key, new Multiton(key));
        }
        return instances.get(key);
    }

    public String getKey() {
        return key;
    }

    public static void main(String[] args) {
        Multiton instance1 = Multiton.getInstance("Key1");
        Multiton instance2 = Multiton.getInstance("Key2");
        Multiton instance3 = Multiton.getInstance("Key1");

        System.out.println("Instance 1 key: " + instance1.getKey());
        System.out.println("Instance 2 key: " + instance2.getKey());
        System.out.println("Instance 3 key: " + instance3.getKey());

        System.out.println("Instance 1 == Instance 2: " + (instance1 == instance2));
        System.out.println("Instance 1 == Instance 3: " + (instance1 == instance3));
        System.out.println("Instance 2 == Instance 3: " + (instance2 == instance3));
    }

}