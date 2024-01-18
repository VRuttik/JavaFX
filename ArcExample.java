package com.example.practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class ArcExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Arc Example");
        Group group = new Group();
        Arc arc = new Arc();

        arc.setCenterX(500);
        arc.setCenterY(400);
        arc.setRadiusX(50);
        arc.setRadiusY(80);
        arc.setStartAngle(30);
        arc.setLength(70);
        arc.setType(ArcType.ROUND);
        arc.setFill(Color.RED);

        group.getChildren().addAll(arc);
        Scene scene = new Scene(group, 200, 300, Color.WHITE);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
