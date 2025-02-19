package org.example.labwork_02_19;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SplashScreenController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}