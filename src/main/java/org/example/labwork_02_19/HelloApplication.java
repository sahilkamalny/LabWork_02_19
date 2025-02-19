package org.example.labwork_02_19;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class HelloApplication extends Application {
    Stage stage;

    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        this.stage = stage;
        FXMLLoader root = new FXMLLoader(HelloApplication.class.getResource("splash_screen.fxml"));
        Scene scene = new Scene(root.load());
        stage.setTitle("Welcome!");
        stage.setScene(scene);
        stage.show();
        
        displayLoginScreen();
    }

    public void displayLoginScreen() throws IOException {
        FXMLLoader root = new FXMLLoader(HelloApplication.class.getResource("login_screen.fxml"));
        Scene scene = new Scene(root.load());
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}