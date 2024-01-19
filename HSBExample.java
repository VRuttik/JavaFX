package com.example.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.stage.Stage;

public class HSBExample extends Application{

    @Override
    public  void start(Stage primaryStage) throws Exception{

        Group group = new Group();
        primaryStage.setTitle("Color Example");

        Rectangle rect = new Rectangle();
        rect.setX(150);
        rect.setY(200);
        rect.setWidth(300);
        rect.setHeight(500);
        rect.setEffect(new DropShadow());
        group.getChildren().add(rect);

        Scene scene = new Scene(group, 300, 400, Color.hsb(180, 1, 1));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
