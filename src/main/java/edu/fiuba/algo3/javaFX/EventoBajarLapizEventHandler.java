package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class EventoBajarLapizEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;
    private final VBox algoritmo;

    public EventoBajarLapizEventHandler(Dibujo dibujo, VBox algoritmo){
        this.dibujo = dibujo;
        this.algoritmo = algoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        Bloque bloque = new BajarLapiz();
        dibujo.agregarBloque(bloque);

        Button botonBajarLapiz = new Button("Bajar Lapiz");
        algoritmo.getChildren().add(botonBajarLapiz);
    }

}