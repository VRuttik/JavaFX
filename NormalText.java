package com.example.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NormalTextExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Text text = new Text();
        text.setText("Hello Guy's!!");

        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane, 300, 400);
        stackPane.getChildren().add(text);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Text Example");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
