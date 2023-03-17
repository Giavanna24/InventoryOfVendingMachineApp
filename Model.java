
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Model {

    public String Item;
    public int Price;
    public int Stock;

    public Inventory(String Item, int price, int Stock) {
        this.Item = Item;
        this.Price = Price;
        this.Stock = Stock;
    }

    public String getItem() {return Item;}

    public void setItem(String item) {Item = item;}

    public int getPrice() {return Price;}

    public void setPrice(int price) {Price = price;}

    public int getStock() {return Stock;}

    public void setStock(int stock) {Stock = stock;}

    static void readAllData() {
        Scanner sc = null;
        try{
            File file = new File("Vending Machine Data");
            sc = new Scanner(file);
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                System.out.println(line);
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("\t");
                String name = lineScanner.next();
                String Item = lineScanner.next();
                int Stock = lineScanner.nextInt();
                int Price = lineScanner.nextInt();
                new VendingMachineItem (Item, Stock, Price);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            if (sc != null) sc.close();
        }
    }

}
