import java.io.*;

public class Customer implements Serializable{
    static String id = "C001";
    String product;
    String productID;
    String name;
    Product p;
    int quantity;

    public Customer(String product, String name, int quantity) {
        this.product = product;
        this.name = name;
        this.quantity = quantity;
        productID = id;
        id = id.charAt(0) + Integer.toString(Integer.parseInt(id.substring(1)) + 1);
    }
}