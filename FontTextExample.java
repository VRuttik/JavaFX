package com.example.practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FontTextExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Text text = new Text();
        text.setX(100);
        text.setY(20);
        text.setFont(Font.font("Abyssinica SIL",FontWeight.BOLD,FontPosture.REGULAR,20));
        text.setText("Welcome Guy's!!");

        Group group = new Group();
        Scene scene = new Scene(group,300, 400);
        group.getChildren().add(text);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Text Example");
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
