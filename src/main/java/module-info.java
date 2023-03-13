module com.example.inventoryofvendingmachineapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.inventoryofvendingmachineapp to javafx.fxml;
    exports com.example.inventoryofvendingmachineapp;
}