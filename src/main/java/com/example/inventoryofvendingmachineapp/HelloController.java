package com.example.inventoryofvendingmachineapp;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.*;
import java.util.ArrayList;

public class HelloController {
    public  ArrayList<Model> customerSelectedItems  = new ArrayList<>();
    @FXML
    private Label welcomeText;
    public Button Doritos;
    public Button FruitSnacks;
    public Button NatureValley;
    public Button Takis;
    public Button RiceKrispies;
    public Button Popcorners;
    public Button Pistachios;
    public Button ChocolateChippers;
    public Button Goldfish;
    public Button Funyuns;
    public Button DoritosFlaminHot;
    public Button WhiteCheddarPopcorn;
    public GridPane MachineGrid;
    public Pane MachinePane;
    public Label TitleLabel;
    public Label InsertLabel;
    public Label TotalLabel;
    public Label ItemLabel;
    public Label StockLabel;
    public Label PriceLabel;
    public TextField TotalField;
    public TextField InsertField;
    public Button CheckButton;
    float CurrentTotal = 0;

    public void initialize() throws FileNotFoundException {
    restoreOrReadData();
        System.out.println(Model.getAllSnacks());
        //Doritos
    Image DoritosImage = new Image (new FileInputStream("doritos.png"));
    ImageView DoritosView = new ImageView(DoritosImage);
    DoritosView.setFitWidth(144); DoritosView.setFitHeight(90); DoritosView.setPreserveRatio(true);
    Doritos.setGraphic(DoritosView);
    //Welch's Fruit Snacks
    Image FruitSnacksImage = new Image (new FileInputStream("fruitsnacks.png"));
    ImageView FruitSnacksView = new ImageView(FruitSnacksImage);
    FruitSnacksView.setFitWidth(144); FruitSnacksView.setFitHeight(90); FruitSnacksView.setPreserveRatio(true);
    FruitSnacks.setGraphic(FruitSnacksView);
    //Nature Valley
    Image NatureValleyImage = new Image (new FileInputStream("naturevalley.jpeg"));
    ImageView NatureValleyView = new ImageView(NatureValleyImage);
    NatureValleyView.setFitWidth(144); NatureValleyView.setFitHeight(90); NatureValleyView.setPreserveRatio(true);
    NatureValley.setGraphic(NatureValleyView);
    //Takis
    Image TakisImage = new Image (new FileInputStream("takis.png"));
    ImageView TakisView = new ImageView(TakisImage);
    TakisView.setFitWidth(144); TakisView.setFitHeight(90); TakisView.setPreserveRatio(true);
    Takis.setGraphic(TakisView);
    //Rice Krispies
    Image RiceKrispiesImage = new Image (new FileInputStream("ricekrispies.png"));
    ImageView RiceKrispiesView = new ImageView(RiceKrispiesImage);
    RiceKrispiesView.setFitWidth(144); RiceKrispiesView.setFitHeight(90); RiceKrispiesView.setPreserveRatio(true);
    RiceKrispies.setGraphic(RiceKrispiesView);
    //Popcorners
    Image PopcornersImage = new Image (new FileInputStream("popcorners.jpeg"));
    ImageView PopcornersView = new ImageView(PopcornersImage);
    PopcornersView.setFitWidth(144); PopcornersView.setFitHeight(90); PopcornersView.setPreserveRatio(true);
    Popcorners.setGraphic(PopcornersView);
    //Pistachios
    Image PistachiosImage = new Image (new FileInputStream("pistachios.png"));
    ImageView PistachiosView = new ImageView(PistachiosImage);
    PistachiosView.setFitWidth(144); PistachiosView.setFitHeight(90); PistachiosView.setPreserveRatio(true);
    Pistachios.setGraphic(PistachiosView);
    //Choclate Chippers
    Image ChocolateChippersImage = new Image (new FileInputStream("chocolatechippers.jpeg"));
    ImageView ChocolateChippersView = new ImageView(ChocolateChippersImage);
    ChocolateChippersView.setFitWidth(144); ChocolateChippersView.setFitHeight(90); ChocolateChippersView.setPreserveRatio(true);
    ChocolateChippers.setGraphic(ChocolateChippersView);
    //Goldfish
    Image GoldfishImage = new Image (new FileInputStream("goldfish.jpeg"));
    ImageView GoldfishView = new ImageView(GoldfishImage);
    GoldfishView.setFitWidth(144); GoldfishView.setFitHeight(90); GoldfishView.setPreserveRatio(true);
    Goldfish.setGraphic(GoldfishView);
    //Funyuns
    Image FunyunsImage = new Image (new FileInputStream("funyuns.jpeg"));
    ImageView FunyunsView = new ImageView(FunyunsImage);
    FunyunsView.setFitWidth(144); FunyunsView.setFitHeight(90); FunyunsView.setPreserveRatio(true);
    Funyuns.setGraphic(FunyunsView);
    //Doritos Flamin' Hot
    Image DoritosFlaminHotImage = new Image (new FileInputStream("doritoshot.jpeg"));
    ImageView DoritosFlaminHotView = new ImageView(DoritosFlaminHotImage);
    DoritosFlaminHotView.setFitWidth(144); DoritosFlaminHotView.setFitHeight(90); DoritosFlaminHotView.setPreserveRatio(true);
    DoritosFlaminHot.setGraphic(DoritosFlaminHotView);
    //White Cheddar Popcorn
    Image WhiteCheddarPopcornImage = new Image (new FileInputStream("whitecheddar.png"));
    ImageView WhiteCheddarPopcornView = new ImageView(WhiteCheddarPopcornImage);
    WhiteCheddarPopcornView.setFitWidth(144); WhiteCheddarPopcornView.setFitHeight(90); WhiteCheddarPopcornView.setPreserveRatio(true);
    WhiteCheddarPopcorn.setGraphic(WhiteCheddarPopcornView);
    }

public void DataToButton(MouseEvent event) {
        String dataName = null;
        int dataStock = 0;
        float dataPrice = 0.0f;

        if (event.getSource() == Doritos) {
            dataName = Model.getAllSnacks().get(0).getItem();
            dataStock = Model.getAllSnacks().get(0).getStock();
            dataPrice = Model.getAllSnacks().get(0).getPrice();

            ItemLabel.setText(" Item: " + dataName);
            StockLabel.setText("Stock: " + String.valueOf(dataStock));
            PriceLabel.setText("Price: $" + dataPrice);
        }

        if (event.getSource() == FruitSnacks) {

            dataName = Model.getAllSnacks().get(1).getItem();
            dataStock = Model.getAllSnacks().get(1).getStock();
            dataPrice = Model.getAllSnacks().get(1).getPrice();

            ItemLabel.setText(" Item: " + dataName);
            StockLabel.setText("Stock: " + String.valueOf(dataStock));
            PriceLabel.setText("Price: $" + dataPrice);
        }

     if (event.getSource() == NatureValley) {
        dataName = Model.getAllSnacks().get(2).getItem();
        dataStock = Model.getAllSnacks().get(2).getStock();
        dataPrice = Model.getAllSnacks().get(2).getPrice();

        ItemLabel.setText(" Item: " + dataName);
        StockLabel.setText("Stock: " + String.valueOf(dataStock));
        PriceLabel.setText("Price: $" + dataPrice);
        }

    if (event.getSource() == Takis) {
        dataName = Model.getAllSnacks().get(3).getItem();
        dataStock = Model.getAllSnacks().get(3).getStock();
        dataPrice = Model.getAllSnacks().get(3).getPrice();

        ItemLabel.setText(" Item: " + dataName);
        StockLabel.setText("Stock: " + String.valueOf(dataStock));
        PriceLabel.setText("Price: $" + dataPrice);
    }
    if (event.getSource() == Popcorners) {
        dataName = Model.getAllSnacks().get(4).getItem();
        dataStock = Model.getAllSnacks().get(4).getStock();
        dataPrice = Model.getAllSnacks().get(4).getPrice();

        ItemLabel.setText(" Item: " + dataName);
        StockLabel.setText("Stock: " + String.valueOf(dataStock));
        PriceLabel.setText("Price: $" + dataPrice);
    }
    if (event.getSource() == Pistachios) {
        dataName = Model.getAllSnacks().get(5).getItem();
        dataStock = Model.getAllSnacks().get(5).getStock();
        dataPrice = Model.getAllSnacks().get(5).getPrice();

        ItemLabel.setText(" Item: " + dataName);
        StockLabel.setText("Stock: " + String.valueOf(dataStock));
        PriceLabel.setText("Price: $" + dataPrice);
    }
    if (event.getSource() == RiceKrispies) {
        dataName = Model.getAllSnacks().get(6).getItem();
        dataStock = Model.getAllSnacks().get(6).getStock();
        dataPrice = Model.getAllSnacks().get(6).getPrice();

        ItemLabel.setText(" Item: " + dataName);
        StockLabel.setText("Stock: " + String.valueOf(dataStock));
        PriceLabel.setText("Price: $" + dataPrice);
    }
    if (event.getSource() == Goldfish) {
        dataName = Model.getAllSnacks().get(7).getItem();
        dataStock = Model.getAllSnacks().get(7).getStock();
        dataPrice = Model.getAllSnacks().get(7).getPrice();

        ItemLabel.setText(" Item: " + dataName);
        StockLabel.setText("Stock: " + String.valueOf(dataStock));
        PriceLabel.setText("Price: $" + dataPrice);
    }
    if (event.getSource() == ChocolateChippers) {
        dataName = Model.getAllSnacks().get(8).getItem();
        dataStock = Model.getAllSnacks().get(8).getStock();
        dataPrice = Model.getAllSnacks().get(8).getPrice();

        ItemLabel.setText(" Item: " + dataName);
        StockLabel.setText("Stock: " + String.valueOf(dataStock));
        PriceLabel.setText("Price: $" + dataPrice);
    }
    if (event.getSource() == Funyuns) {
        dataName = Model.getAllSnacks().get(9).getItem();
        dataStock = Model.getAllSnacks().get(9).getStock();
        dataPrice = Model.getAllSnacks().get(9).getPrice();

        ItemLabel.setText(" Item: " + dataName);
        StockLabel.setText("Stock: " + String.valueOf(dataStock));
        PriceLabel.setText("Price: $" + dataPrice);
    }
    if (event.getSource() == DoritosFlaminHot) {
        dataName = Model.getAllSnacks().get(10).getItem();
        dataStock = Model.getAllSnacks().get(10).getStock();
        dataPrice = Model.getAllSnacks().get(10).getPrice();

        ItemLabel.setText(" Item: " + dataName);
        StockLabel.setText("Stock: " + String.valueOf(dataStock));
        PriceLabel.setText("Price: $" + dataPrice);
    }
    if (event.getSource() == WhiteCheddarPopcorn) {
        dataName = Model.getAllSnacks().get(11).getItem();
        dataStock = Model.getAllSnacks().get(11).getStock();
        dataPrice = Model.getAllSnacks().get(11).getPrice();

        ItemLabel.setText(" Item: " + dataName);
        StockLabel.setText("Stock: " + String.valueOf(dataStock));
        PriceLabel.setText("Price: $" + dataPrice);
        }
    if (event.getClickCount() == 2) {
        Model chosenItem = new Model(dataName, dataPrice);
        customerSelectedItems.add(chosenItem);
        System.out.println(chosenItem);
        CurrentTotal = CurrentTotal + dataPrice;
       // float CurrentTotal = Float.parseFloat(Total);
        TotalField.setText(String.valueOf(CurrentTotal));
        }
    }

    public void saveData() throws Exception {
        FileOutputStream fileOut = new FileOutputStream("SavedSnacks");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(Model.getAllSnacks());
        out.close();
        fileOut.close();
    }

    public void InsertMoney(){
        String MoneyInserted = InsertField.getText();
        float Inserted = Float.parseFloat(MoneyInserted);
        System.out.println(Inserted);
    }

    public void Checkout() {
        System.out.println("BEFORE CHECKOUT:");
        System.out.println(Model.getAllSnacks());
        System.out.println("BEFORE CHECKOUT selected:");
        System.out.println(customerSelectedItems);

        String MoneyInserted = InsertField.getText();
        if (MoneyInserted.equalsIgnoreCase("")) {
            return;
        }


            // doesnt work to decrease stock anymore
        for (Model eachSelectedItem : customerSelectedItems) {
            Model originalModel = null;
            // match eachSelectedItem to its original Model
            for (Model eachOriginalModel : Model.getAllSnacks()) {
                if (eachOriginalModel.getItem().equalsIgnoreCase(eachSelectedItem.getItem())) {
                    originalModel = eachOriginalModel;
                }
            }

            int currentNum = originalModel.getStock();
            if (currentNum >= 0) {
                originalModel.setStock(currentNum - 1);
                System.out.println(currentNum);
                StockLabel.setText("Stock: " + (currentNum-1));
            } else {
                StockLabel.setText("Out Of Stock");
            }

            // checkout clear items and stock
            // shifting around to different items has different stocks by hitting checkout it brings the stock to the first items stock -1

            float totalCost = CurrentTotal;
                float Inserted = Float.parseFloat(MoneyInserted);
                if (Inserted >= totalCost) {
                    Inserted = Inserted - totalCost;
                    totalCost = 0;
                    String NewBalance = String.valueOf(Inserted);
                    InsertField.setText(NewBalance);
                    String NewTotal = String.valueOf(totalCost);
                    TotalField.setText(NewTotal);
                } else {
                    TotalLabel.setText("Not enough money!");
                }

        }
        CurrentTotal = 0;
        customerSelectedItems.clear();

        System.out.println("AFTER CHECKOUT:");
        System.out.println(Model.getAllSnacks());
    }

    public void restoreOrReadData() {
        try {
            FileInputStream fileIn = new FileInputStream("SavedSnacks");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Model.setAllSnacks((ArrayList<Model>) in.readObject());
            in.close();
            fileIn.close();
        } catch (Exception exception) {
            Model.readAllData();
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}