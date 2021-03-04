package edu.fiuba.algo3.modelo;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AlgoritmoPersonalizadoSinBloquesError extends Exception {

    public void arrojarMensaje(){
        Stage ventanaError = new Stage();
        Label mensajeError = new Label();
        mensajeError.setText("El bloque personalizado no puede estar vacío");
        mensajeError.setTextFill(Color.RED);
        VBox contenedorMensaje = new VBox(mensajeError);
        Scene escenaError = new Scene(contenedorMensaje);
        ventanaError.setScene(escenaError);
        ventanaError.show();
    }
}
