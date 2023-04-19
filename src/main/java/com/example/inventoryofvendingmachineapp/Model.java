package com.example.inventoryofvendingmachineapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Model implements Serializable {

    public static ArrayList<Model> allSnacks = new ArrayList<>();
    public String Item;
    public int Stock;
    public float Price;


    public Model(String Item, int Stock,  float Price) {
        this.Item = Item;
        this.Stock = Stock;
        this.Price = Price;
        allSnacks.add(this);
    }

    public Model(String Item, float Price) {
        this.Item = Item;
        this.Price = Price;
    }


    public static ArrayList<Model> getAllSnacks() {return allSnacks;}

    public static void setAllSnacks(ArrayList<Model> allSnacks) {Model.allSnacks = allSnacks;}

    public String getItem() {return Item;}

    public void setItem(String item) {Item = item;}

    public float getPrice() {return Price;}

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
                String Item = lineScanner.next();
                int Stock = lineScanner.nextInt();
                float Price = lineScanner.nextFloat();
                new Model (Item, Stock, Price);

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

    public String toString() {
        String description = Item + " ";
        description = description + Stock + " ";
        description = description + Price;
        return description;
    }
}
