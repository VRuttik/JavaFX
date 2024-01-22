package com.example.practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class TranslationExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle rect1 = new Rectangle(20, 20, 200, 150);
        rect1.setFill(Color.RED);
        rect1.setStroke(Color.BLACK);
        rect1.setStrokeWidth(5);

        Rectangle rect2 = new Rectangle(20, 20, 200, 150);
        rect2.setFill(Color.GREEN);
        rect2.setStroke(Color.BLACK);
        rect2.setStrokeWidth(5);

        Translate translate = new Translate();
        translate.setX(200);
        translate.setY(200);
        translate.setZ(200);

        rect2.getTransforms().addAll(translate);

        Group group = new Group();
        group.getChildren().addAll(rect1, rect2);
        Scene scene = new Scene(group, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Translation Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
