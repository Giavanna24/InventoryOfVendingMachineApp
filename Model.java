
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

}
