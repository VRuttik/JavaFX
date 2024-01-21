package com.example.practice;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeTransitionExample extends Application {

    @Override
    public void start(Stage primaryStage) {

        Circle c = new Circle(250,120,80);
        c.setFill(Color.ORANGE);
        c.setStroke(Color.GREEN);

        FadeTransition f = new FadeTransition();
        f.setDuration(Duration.millis(5000));
        f.setFromValue(1.0);  // Change from 10 to 1.0
        f.setToValue(0.1);
        f.setCycleCount(1000);
        f.setAutoReverse(true);
        f.setNode(c);
        f.play();

        Group group = new Group();
        group.getChildren().addAll(c);

        Scene scene = new Scene(group, 500, 200, Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fade Transition Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
