package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EventoLevantarLapizEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;

    public EventoLevantarLapizEventHandler(Dibujo dibujo){
        this.dibujo = dibujo;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        Bloque bloque = new LevantarLapiz();
        dibujo.agregarBloque(bloque);
    }

}