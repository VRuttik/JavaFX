package com.example.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ImageLabel extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{

        StackPane root = new StackPane();
        FileInputStream input = new FileInputStream("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSysqIr2FGykhlHX-uIwovIp5353NzSqR5lbQ&usqp=CAU");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        Label my_label = new Label("Flower",imageView);
        Scene scene = new Scene(root, 300,300);
        root.getChildren().add(my_label);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Label Class Example");
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
