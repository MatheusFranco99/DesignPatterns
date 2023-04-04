package lazy_initialization;

public class LazyInitilization {
    private ExpensiveObject expensiveObject;

    public ExpensiveObject getExpensiveObject() {
        if (expensiveObject == null) {
            expensiveObject = new ExpensiveObject();
        }
        return expensiveObject;
    }

    public static void main(String[] args) {
        LazyInitilization example = new LazyInitilization();
        System.out.println("Creating expensive object");
        long startTime = System.currentTimeMillis();
        ExpensiveObject object1 = example.getExpensiveObject();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to create object1: " + (endTime - startTime) + "ms");

        System.out.println("Getting expensive object again...");
        startTime = System.currentTimeMillis();
        ExpensiveObject object2 = example.getExpensiveObject();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to get object2: " + (endTime - startTime) + "ms");

        System.out.println("Checking if object1 and object2 are the same...");
        System.out.println("object1 == object2: " + (object1 == object2));

    }
}

class ExpensiveObject {
    public ExpensiveObject() {
        try {
            Thread.sleep(1000); // simulate a long and expensive initialization process
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Expensive object created!");
    }
}
