import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        addAndWritetoSP("Product.txt", manager.getList());
        List<Product> List = ReadProduct("Product.txt");
        for (Product product :
                List) {
            System.out.println(product);

        }

    }

    public static void addAndWritetoSP(String path, List<Product> list) {
        try {
            Product product1 = new Product("c02", "Xe máy", "Honda", 50000000);
            Product product2 = new Product("c06", "ô tô", "Meserdest", 250000000);
            list.add(product1);
            list.add(product2);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
            out.writeObject(product1);
            out.writeObject(product2);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> ReadProduct(String path) {
        List<Product> list = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            list = (List<Product>) ois.readObject();
            ois.close();
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (Exception e) {

        }
        return list;
    }
}
