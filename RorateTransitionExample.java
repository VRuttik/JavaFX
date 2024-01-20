package com.example.practice;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RotateTransitionExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Rectangle rect = new Rectangle(200, 100, 200, 200);
        rect.setFill(Color.LIMEGREEN);
        rect.setStroke(Color.HOTPINK);
        rect.setStrokeWidth(5);

        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(500);
        rotate.setDuration(Duration.millis(1000));
        rotate.setAutoReverse(true);
        rotate.setNode(rect);
        rotate.play();

        Group group = new Group();
        group.getChildren().add(rect);

        Scene scene = new Scene(group, 600, 400, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rotate Transition example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
