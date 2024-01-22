package com.example.practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class ScalingExample extends Application{

    @Override

    public void start(Stage primaryStage) throws Exception{

        Circle cir1 = new Circle(230,200,100);
        Circle cir2 = new Circle(550,200,100);
        cir1.setFill(Color.YELLOW);
        cir1.setStroke(Color.BLACK);
        cir2.setFill(Color.YELLOW);
        cir2.setStroke(Color.BLACK);

        Text t1 = new Text("Original Circle");
        Text t2 = new Text("Scaled with factor 1.5 in XY");
        t1.setX(150);
        t1.setY(400);
        t2.setX(400);
        t2.setY(400);

        t1.setFont(Font.font("calibri",FontWeight.BLACK,FontPosture.ITALIC,20));
        t2.setFont(Font.font("calibri",FontWeight.BLACK,FontPosture.ITALIC,20));

        Scale scale = new Scale();
        scale.setX(1.5);
        scale.setY(1.5);
        scale.setPivotX(550);
        scale.setPivotY(200);

        cir2.getTransforms().addAll(scale);
        Group group = new Group();
        group.getChildren().addAll(cir1,cir2,t1,t2);
        Scene scene = new Scene(group,800,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Scaling Example");
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
