import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class Main{
    public static void main(String[] args) throws Exception {
        String productName1,productName2,productName3;
        int quantity1,quantity2,quantity3;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fos = new FileOutputStream("product.txt",true);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        Product p1 = new Product("ABC123","car",10,10000.0);
        oos.writeObject(p1);
        Product p2 = new Product("ABC125","bike",5,30000.0);
        oos.writeObject(p2);
        Product p3 = new Product("ABC126","icecream",6,90000.0);
        oos.writeObject(p3);

        FileOutputStream fos1 = new FileOutputStream("sales.txt",true);
        ObjectOutputStream oos1 = new ObjectOutputStream(fos1);

        System.out.print("Enter the name of the product which you want : ");
        productName1 = reader.readLine();
        System.out.print("Required quantity : ");
        quantity1 = Integer.parseInt(reader.readLine());
        Customer c1 = new Customer(productName1,"XYZ1",quantity1);
        if(p1.checkAvailability(p2, c1.quantity))  oos1.writeObject(c1);

        System.out.print("Enter the name of the product which you want : ");
        productName2 = reader.readLine();
        System.out.print("Required quantity : ");
        quantity2 = Integer.parseInt(reader.readLine());
        Customer c2 = new Customer(productName2,"XYZ2",quantity2);
        if(p1.checkAvailability(p3, c2.quantity)) oos1.writeObject(c1);

        System.out.print("Enter the name of the product which you want : ");
        productName3 = reader.readLine();
        System.out.print("Required quantity : ");
        quantity3 = Integer.parseInt(reader.readLine());
        Customer c3 = new Customer(productName3,"XYZ3",quantity3);
        if(p1.checkAvailability(p1, c3.quantity)) oos1.writeObject(c1);

        fos.write(new byte[0]);
        oos. writeObject(p1);
        oos. writeObject(p2);
        oos. writeObject(p3);
    }
}