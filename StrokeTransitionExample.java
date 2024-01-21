package com.example.practice;

import javafx.animation.StrokeTransition;
import javafx.animation.Animation;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StrokeTransitionExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Circle c = new Circle(200,150,100);
        c.setStroke(Color.BLUE);
        c.setFill(Color.GREEN);
        c.setStrokeWidth(10);

        StrokeTransition s = new StrokeTransition();
        s.setAutoReverse(true);
        s.setCycleCount(500);
        s.setDuration(Duration.millis(500));
        s.setFromValue(Color.BLACK);
        s.setToValue(Color.PURPLE);
        s.setShape(c);
        s.play();

        Group group = new Group();
        group.getChildren().addAll(c);

        Scene scene = new Scene(group,420,300,Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Stroke Transition Example");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
