package com.example.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class SingleLine extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Line line = new Line(); // Line class
        line.setStartX(0); // setting starting X point of line
        line.setStartY(0); // setting starting Y point of line
        line.setEndX(100); // setting ending X point of line
        line.setEndY(200); // setting ending Y point of line

        Group root = new Group(); // Creating a Group
        root.getChildren().add(line); // adding the class object to the group

        Scene scene = new Scene(root, 300, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Line Example");
        primaryStage.show();
    }

    public static void main(String args){

        launch(args);
    }
}
