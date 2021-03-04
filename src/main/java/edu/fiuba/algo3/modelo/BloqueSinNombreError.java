package edu.fiuba.algo3.modelo;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.*;

public class BloqueSinNombreError extends Throwable {

    public String arrojarMensaje(VBox contenedorVertical, Label mensajeError){
        mensajeError.setText("El nombre del bloque no puede estar vacío");
        mensajeError.setTextFill(Color.RED);
        return mensajeError.getText();
    }
}
