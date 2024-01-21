package com.example.practice;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ParallelTransitionExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Polygon poly = new Polygon();
        poly.getPoints().addAll(new Double[]{320.0, 270.0, 270.0, 220.0, 270.0, 270.0, 320.0, 120.0, 370.0, 270.0, 370.0, 220.0});
        poly.setFill(Color.LIMEGREEN);
        poly.setStroke(Color.BLACK);

        Duration dur1 = Duration.millis(1000);
        Duration dur2 = Duration.millis(1000);

        PauseTransition pause = new PauseTransition(Duration.millis(1000));

        FadeTransition fade = new FadeTransition(dur2);
        fade.setFromValue(1.0f);
        fade.setToValue(0.3f);
        fade.setCycleCount(5);
        fade.setAutoReverse(true);

        TranslateTransition translate = new TranslateTransition(dur1);
        translate.setToX(-150f);
        translate.setCycleCount(5);
        translate.setAutoReverse(true);

        RotateTransition rotate = new RotateTransition(dur2);
        rotate.setByAngle(360);
        rotate.setCycleCount(5);
        rotate.setAutoReverse(true);

        ScaleTransition scale = new ScaleTransition(dur1);
        scale.setByX(1.5f);
        scale.setByY(1.2f);
        scale.setCycleCount(5);
        scale.setAutoReverse(true);

        ParallelTransition parallelTransition = new ParallelTransition(poly, rotate, pause, fade, translate, scale);
        parallelTransition.play();

        Group group = new Group();
        group.getChildren().addAll(poly);

        Scene scene = new Scene(group, 490, 450, Color.WHEAT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Parallel Transition Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
