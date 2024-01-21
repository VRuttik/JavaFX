package com.example.practice;

import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FillTransitionExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Polygon p = new Polygon();
        p.getPoints().addAll(new Double[]{220.0,270.0,170.0,220.0,170.0,120.0,220.0,70.0,270.0,120.0,270.0,220.0});
        p.setStroke(Color.GREEN);

        FillTransition f = new FillTransition();
        f.setAutoReverse(true);
        f.setCycleCount(50);
        f.setDuration(Duration.millis(1000));
        f.setFromValue(Color.BLACK);
        f.setToValue(Color.WHITE);
        f.setShape(p);
        f.play();

        Group group = new Group();
        group.getChildren().addAll(p);
        Scene scene = new Scene(group,420,400,Color.WHEAT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fill Transition Example");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
