package com.example.inventoryofvendingmachineapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

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

    public void initialize() throws FileNotFoundException {
        Model.readAllData();
    Image DoritosImage = new Image (new FileInputStream("doritos.png"));
    ImageView DoritosView = new ImageView(DoritosImage);
    Doritos.setGraphic(DoritosView);

    }

public void DataToButton(){
        Doritos.setOnAction(actionEvent -> {

        });
}
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}