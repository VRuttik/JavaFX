package com.example.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class MaterialExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Cylinder 1
        Cylinder cyn1 = new Cylinder();
        cyn1.setRadius(70);
        cyn1.setHeight(200);
        cyn1.setTranslateX(180);
        cyn1.setTranslateY(150);

        // Cylinder 2
        Cylinder cyn2 = new Cylinder();
        cyn2.setRadius(70);
        cyn2.setHeight(200);
        cyn2.setTranslateX(380);
        cyn2.setTranslateY(150);

        // Cylinder 3
        Cylinder cyn3 = new Cylinder();
        cyn3.setRadius(70);
        cyn3.setHeight(200);
        cyn3.setTranslateX(580);
        cyn3.setTranslateY(150);

        // Sphere
        Sphere s = new Sphere();
        s.setRadius(70);
        s.setTranslateX(780);
        s.setTranslateY(150);

        //Setting Material 1
        Image img1 = new Image("https://www.javatpoint.com/kotlin/images/kotlin-    tutorial.png");
        PhongMaterial mat = new PhongMaterial();
        mat.setDiffuseMap(img1);
        mat.setDiffuseColor(Color.WHITE);

        //Setting Material 2
        PhongMaterial mat2 = new PhongMaterial();
        mat2.setSelfIlluminationMap(img1);

        //Setting Material 3
        PhongMaterial mat3 = new PhongMaterial();
        mat3.setSpecularMap(img1);

        //Setting Material for sphere
        PhongMaterial mat4 = new PhongMaterial();
        mat4.setDiffuseColor(Color.BLUE);

        // Applying Material to     mat4.setBumpMap(img1);the shape
        cyn1.setMaterial(mat);
        cyn2.setMaterial(mat2);
        cyn3.setMaterial(mat3);
        s.setMaterial(mat4);

        //Setting Camera    mat4.setBumpMap(img1);
        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateX(20);
        camera.setTranslateY(10);
        camera.setTranslateZ(50);

        //setting group and stage
        Group root = new Group();
        root.getChildren().addAll(cyn1,cyn2,cyn3,s);
        Scene scene = new Scene(root,900,300,Color.WHITE);
        scene.setCamera(camera);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Material Example");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
