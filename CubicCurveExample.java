package com.example.practice;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.effect.DropShadow;
import javafx.stage.Stage;

public class CubicCurveExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Cubic Curve Example");
        Group group = new Group();
        CubicCurve cubicCurve = new CubicCurve();
        cubicCurve.setStartX(20);
        cubicCurve.setStartY(100);
        cubicCurve.setControlX1(300);
        cubicCurve.setControlX2(200);
        cubicCurve.setControlY1(100);
        cubicCurve.setControlY2(90);
        cubicCurve.setFill(Color.MAGENTA);
        cubicCurve.setEffect(new DropShadow());
        cubicCurve.setEndX(100);
        cubicCurve.setEndY(300);

        group.getChildren().addAll(cubicCurve);

        Scene scene = new Scene(group, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
