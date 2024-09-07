import java.io.Serializable;

public class Product implements Serializable {
    String productID;
    String name;
    int quantity;
    double price;

    public Product(String productID, String name, int quantity, double price) {
        this.productID = productID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public boolean checkAvailability(Product p, int req) {
        if(req<=p.quantity) {
            System.out.println("Stock available");
            p.quantity-=req;
            System.out.println(req + " " + p.name + " are sold");
            return true;
        }
        else {
            System.out.println("Sorry Out of Stock!!!");
            return false;
        }
    }
}
