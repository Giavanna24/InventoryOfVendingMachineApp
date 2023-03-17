package com.example.inventoryofvendingmachineapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}