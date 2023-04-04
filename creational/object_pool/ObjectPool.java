package object_pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class ObjectPool<T> {
    private BlockingQueue<T> pool;

    public ObjectPool(int size, ObjectFactory<T> factory) {
        pool = new ArrayBlockingQueue<>(size);
        for (int i = 0; i < size; i++) {
            pool.add(factory.createObject());
        }
    }

    public T borrowObject() {
        try {
            return pool.take();
        } catch (InterruptedException e) {
            System.err.println("Error borrowing object from pool: " + e.getMessage());
            return null;
        }
    }

    public void returnObject(T obj) {
        pool.offer(obj);
    }

    public static void main(String[] args) {
        ObjectFactory<MyObject> factory = new MyObjectFactory();
        ObjectPool<MyObject> pool = new ObjectPool<>(10, factory);

        MyObject obj1 = pool.borrowObject();
        MyObject obj2 = pool.borrowObject();
        MyObject obj3 = pool.borrowObject();

        obj1.printText();
        obj2.printText();
        obj3.printText();

        // use objects here

        pool.returnObject(obj1);
        pool.returnObject(obj2);
        pool.returnObject(obj3);
    }
}

interface ObjectFactory<T> {
    T createObject();
}

class MyObject {
    // class implementation here

    public void printText() {
        System.out.println("Inside my object.");
    }

}

class MyObjectFactory implements ObjectFactory<MyObject> {
    public MyObject createObject() {
        return new MyObject();
    }
}
