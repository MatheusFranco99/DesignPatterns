import java.util.ArrayList;
import java.util.List;

public class composite {
    public static void main(String[] args) {
        SimpleProduct p1 = new SimpleProduct(10.0);
        SimpleProduct p2 = new SimpleProduct(5.0);
        
        BoxedItem box1 = new BoxedItem();
        box1.addItem(p1);
        box1.addItem(p2);
        
        SimpleProduct p3 = new SimpleProduct(3.0);
        
        BoxedItem box2 = new BoxedItem();
        box2.addItem(box1);
        box2.addItem(p3);
        
        System.out.println("Total price: " + box2.getPrice());
    }
}

interface OrderItem {
    double getPrice();
}

class SimpleProduct implements OrderItem {
    private double price;
    
    public SimpleProduct(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
}

class BoxedItem implements OrderItem {
    private List<OrderItem> items = new ArrayList<>();
    
    public void addItem(OrderItem item) {
        items.add(item);
    }
    
    public double getPrice() {
        double totalPrice = 0;
        for (OrderItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}