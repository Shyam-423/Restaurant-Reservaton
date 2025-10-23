package com.restaurant;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Welcome to the Restaurant Table Reservation System!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("Table Reservation System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
