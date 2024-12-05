module com.example.paisesapi {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.annotation;
    requires retrofit2;
    requires com.google.gson;
    requires retrofit2.converter.gson;


    opens com.example.paisesapi to javafx.fxml;
    exports com.example.paisesapi;
    exports Modelos;
}