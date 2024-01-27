package com.example.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HyperLinkExample extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{
        Hyperlink hp = new Hyperlink("https://www.google.com/");
        StackPane root = new StackPane();
        hp.setOnAction(e-> System.out.println("Link Clicked"));
        root.getChildren().add(hp);
        Scene scene = new Scene(root, 400,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hyperlink Example");
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
