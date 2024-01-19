package com.example.practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.stage.Stage;

public class WebColorExample extends Application{

    @Override
    public void start(Stage primaryStage){

        Group group = new Group();
        primaryStage.setTitle("Web Color Example");

        Rectangle rect = new Rectangle();
        rect.setX(200);
        rect.setY(200);
        rect.setWidth(350);
        rect.setHeight(400);
        rect.setFill(Color.web("#0000FF", 1));

        group.getChildren().add(rect);

        Scene scene = new Scene(group, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
