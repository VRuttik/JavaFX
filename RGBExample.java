package com.example.practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RGBExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Group group = new Group();
        primaryStage.setTitle("RGB Example");

        Rectangle rect = new Rectangle();
        rect.setX(150);
        rect.setY(150);
        rect.setWidth(200);
        rect.setHeight(300);

        int red = 20;
        int green = 125;
        int blue = 10;

        rect.setFill(Color.rgb(red,green,blue,0.63));
        group.getChildren().add(rect);

        Scene scene = new Scene(group,300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
