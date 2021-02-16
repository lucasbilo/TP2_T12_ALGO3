package edu.fiuba.algo3;

import edu.fiuba.algo3.javaFX.BotonIniciarEventHandler;
import edu.fiuba.algo3.modelo.Dibujo;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        try {
            Dibujo dibujo = new Dibujo();
            var input = new java.io.FileInputStream("src/main/java/edu/fiuba/algo3/static_avatar.png");
            var image = new javafx.scene.image.Image(input);
            var imageView = new javafx.scene.image.ImageView(image);
            var label = new Label("¡¡Bienvenido a AlgoBlocks!!", imageView);
            var botonIniciar = new Button();
            botonIniciar.setText("Iniciar Programa");
            BotonIniciarEventHandler botonIniciarEventHandler = new BotonIniciarEventHandler(dibujo);
            botonIniciar.setOnAction(botonIniciarEventHandler);
            VBox contenedorVertical = new VBox(label,botonIniciar);
            contenedorVertical.setAlignment(Pos.CENTER);
            contenedorVertical.setPadding(new Insets(50));
            var scene = new Scene(contenedorVertical, 400, 500);
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