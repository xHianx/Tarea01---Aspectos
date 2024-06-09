package com.mycompany.observer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        HBox root = new HBox();
        Scene scene = new Scene(root, 300, 150);

        Button btnRed = new Button("Rojo");
        Button btnGreen = new Button("Verde");
        Button btnBlue = new Button("Azul");

        btnRed.setOnAction(event -> setBackground(scene, "red"));
        btnGreen.setOnAction(event -> setBackground(scene, "green"));
        btnBlue.setOnAction(event -> setBackground(scene, "blue"));

        root.getChildren().addAll(btnRed, btnGreen, btnBlue);

        primaryStage.setTitle("Observer con AspectJ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setBackground(Scene scene, String color) {
        scene.setFill(Color.valueOf(color));
        System.out.println("Color de fondo cambiado a: " + color);
    }

    public static void main(String[] args) {
        launch(args);
    }
}