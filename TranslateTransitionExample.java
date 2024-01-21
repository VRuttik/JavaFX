package com.example.practice;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TranslateTransitionExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Circle c = new Circle(50,100,50);
        c.setFill(Color.ORANGE);
        c.setStroke(Color.GREEN);

        TranslateTransition t = new TranslateTransition();
        t.setByX(400);
        t.setDuration(Duration.millis(1000));
        t.setCycleCount(500);
        t.setAutoReverse(true);
        t.setNode(c);
        t.play();

        Group group = new Group();
        group.getChildren().addAll(c);

        Scene scene = new Scene(group, 500, 200, Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Translate Transition Example");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
