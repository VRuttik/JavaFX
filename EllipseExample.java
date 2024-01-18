package com.example.practice;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class EllipseExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Ellipse Example");
        Group group = new Group();

        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(500);
        ellipse.setCenterY(400);
        ellipse.setRadiusX(300);
        ellipse.setRadiusY(250);

        group.getChildren().addAll(ellipse);

        Scene scene = new Scene(group, 200, 300, Color.PURPLE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }

}
