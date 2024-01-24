package com.example.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

public class BoxExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Box box1 = new Box();
        box1.setHeight(100);
        box1.setWidth(100);
        box1.setDepth(400);
        box1.setTranslateX(200);
        box1.setTranslateY(200);
        box1.setTranslateZ(200);

        Box box2 = new Box();
        box2.setTranslateX(450);
        box2.setTranslateY(300);
        box2.setTranslateZ(100);
        box2.setHeight(150);
        box2.setWidth(50);
        box2.setDepth(400);

        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateX(100);
        camera.setTranslateY(100);
        camera.setTranslateZ(50);

        Group group = new Group();
        group.getChildren().addAll(box1,box2);
        Scene scene = new Scene(group,450,300,Color.LIMEGREEN);
        scene.setCamera(camera);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Box Example");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
