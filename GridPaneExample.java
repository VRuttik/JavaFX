package com.example.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{

        Label firstName = new Label("First Name");
        Label lastName = new Label("Last Name");

        TextField tf1 = new TextField();
        TextField tf2 = new TextField();

        Button Submit = new Button("Submit");
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 400,200);
        root.addRow(0,firstName,tf1);
        root.addRow(1,lastName,tf2);
        root.addRow(2,Submit);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
