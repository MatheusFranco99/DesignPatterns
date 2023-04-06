package singleton;

public class singleton {
    public static void main(String[] args) {
        SingletonObj s1 = SingletonObj.getInstance();
        SingletonObj s2 = SingletonObj.getInstance();
        System.out.println(s1 == s2); // true

        System.out.println(s1.getMessage()); // "Hello, world!"
    }
}


class SingletonObj {
    private static SingletonObj instance;
    private String message;

    private SingletonObj() {
        message = "Hello, world!";
    }

    public static synchronized SingletonObj getInstance() {
        if (instance == null) {
            instance = new SingletonObj();
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }
}