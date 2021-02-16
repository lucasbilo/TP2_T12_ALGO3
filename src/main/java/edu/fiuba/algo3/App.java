package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        try {
            var input = new java.io.FileInputStream("src/main/java/edu/fiuba/algo3/static_avatar.png");
            var image = new javafx.scene.image.Image(input);
            var imageView = new javafx.scene.image.ImageView(image);
            var label = new Label("AlgoBlock", imageView);
            var scene = new Scene(new StackPane(label), 640, 480);
            stage.setScene(scene);
            stage.show();
        }

        catch(java.io.FileNotFoundException ex) {
            System.err.println("An IOException was caught!");
            ex.printStackTrace();
        }




    }

    public static void main(String[] args) {
        launch();
    }

}