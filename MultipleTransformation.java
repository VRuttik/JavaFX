package com.example.practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Shear;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class MultipleTransformation extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Rectangle rect = new Rectangle(50,10,200,250);
        Circle c = new Circle(300,260,100);

        c.setFill(Color.LIGHTBLUE);
        c.setStroke(Color.BLACK);
        rect.setStroke(Color.BLACK);
        rect.setFill(Color.LIMEGREEN);
        rect.setStrokeWidth(2);

        Translate trans = new Translate();
        trans.setX(100);
        trans.setY(10);

        Rotate rotate = new Rotate();
        rotate.setAngle(30);
        rotate.setPivotX(50);
        rotate.setPivotY(100);

        Scale scale = new Scale();
        scale.setX(1.5);
        scale.setY(1.2);
        scale.setPivotX(50);
        scale.setPivotY(50);

        Shear shear = new Shear();
        shear.setX(0.3);

        rect.getTransforms().addAll(trans,rotate,scale,shear);

        Group group = new Group();
        group.getChildren().addAll(rect,c);

        Scene scene = new Scene(group,550,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Multiple Transformation Example");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
