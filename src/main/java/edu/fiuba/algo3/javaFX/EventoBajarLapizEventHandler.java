package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EventoBajarLapizEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;

    public EventoBajarLapizEventHandler(Dibujo dibujo){
        this.dibujo = dibujo;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        Bloque bloque = new BajarLapiz();
        dibujo.agregarBloque(bloque);
    }

}