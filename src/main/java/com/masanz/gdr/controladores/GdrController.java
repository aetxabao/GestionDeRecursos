package com.masanz.gdr.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GdrController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}