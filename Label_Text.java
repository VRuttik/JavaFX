package com.example.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Label_Test extends Application{

    @Override
    public void start(Stage primayStage) throws Exception{

        BorderPane BPane = new BorderPane();
        BPane.setTop(new Label("Top"));
        BPane.setBottom(new Label("Bottom"));
        BPane.setLeft(new Label("Left"));
        BPane.setRight(new Label("Right"));
        BPane.setCenter(new Label("Centre"));

        Scene scene = new Scene(BPane, 600, 400);
        primayStage.setScene(scene);
        primayStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
