package com.example.practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

import java.security.PublicKey;

public class CullFaceExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Sphere sphere = new Sphere();
        sphere.setRadius(50);
        sphere.setTranslateX(100);
        sphere.setTranslateY(200);
        sphere.setCullFace(CullFace.BACK);

        Sphere sphere1 = new Sphere();
        sphere1.setRadius(50);
        sphere1.setTranslateX(250);
        sphere1.setTranslateY(200);
        sphere1.setCullFace(CullFace.FRONT);

        Sphere sphere2 = new Sphere();
        sphere2.setRadius(50);
        sphere2.setTranslateX(400);
        sphere2.setTranslateY(200);
        sphere2.setCullFace(CullFace.NONE);

        Group group = new Group();
        group.getChildren().addAll(sphere,sphere1,sphere2);
        Scene scene = new Scene(group,500,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Cull Faces Example");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
