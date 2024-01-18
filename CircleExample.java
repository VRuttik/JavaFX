package com.example.practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Circle Example");
        Group group = new Group();

        Circle circle = new Circle();
        circle.setCenterX(400);
        circle.setCenterY(500);
        circle.setRadius(100);
        circle.setFill(Color.RED);

        group.getChildren().addAll(circle);
        Scene scene = new Scene(group, 200, 300, Color.WHITE);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
