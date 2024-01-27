package com.example.practice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        StackPane root = new StackPane();

        // Set alignment for each button individually
        StackPane.setAlignment(btn1, Pos.CENTER_LEFT);
        StackPane.setAlignment(btn2, Pos.CENTER_RIGHT);

        Scene scene = new Scene(root, 200, 200);
        root.getChildren().addAll(btn1, btn2);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
