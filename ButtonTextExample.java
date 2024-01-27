package com.example.practice;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonTextExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub


        FileInputStream input = new FileInputStream("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCwPEj8cHOIhmsjKNII-e229eCkILeShdqYw&usqp=CAU");
        Image image = new Image(input);
        ImageView img=new ImageView(image);

        StackPane root = new StackPane();
        Button btn=new Button("Button 1",img);
        btn.setWrapText(true);
        Scene scene=new Scene(root,300,300);
        root.getChildren().add(btn);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Button Class Example");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
