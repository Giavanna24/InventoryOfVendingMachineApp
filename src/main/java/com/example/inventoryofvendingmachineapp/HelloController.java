package com.example.inventoryofvendingmachineapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class HelloController {
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

    public void initialize(){
        Model.readAllData();
    }

public void DataToButton(){
        Doritos.setOnAction(actionEvent -> {
            ItemLabel.setText(ItemLabel.getText());
            ItemLabel.setText(StockLabel.getText());
            ItemLabel.setText(PriceLabel.getText());
        });
}
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}