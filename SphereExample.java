package com.example.practice;

import javafx.application.Application;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class SphereExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Sphere s = new Sphere();
        s.setRadius(100);
        s.setTranslateX(200);
        s.setTranslateY(150);
        s.setCullFace(CullFace.BACK);

        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateX(-50);
        camera.setTranslateY(0);
        camera.setTranslateZ(0);

        Group group = new Group();
        group.getChildren().addAll(s);
        Scene scene = new Scene(group,500,300,Color.LIMEGREEN);
        scene.setCamera(camera);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sphere Example");
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
