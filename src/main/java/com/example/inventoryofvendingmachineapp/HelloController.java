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

    public void initialize() throws FileNotFoundException {
        Model.readAllData();
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

public void DataToButton(){
       // Doritos.setOnAction(actionEvent -> {
           // ItemLabel.setText(ItemLabel.getText());
            //ItemLabel.setText(StockLabel.getText());
           // ItemLabel.setText(PriceLabel.getText());
       // });
}
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}