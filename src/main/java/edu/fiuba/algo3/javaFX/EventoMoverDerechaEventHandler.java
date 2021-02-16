package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Direccion;
import edu.fiuba.algo3.modelo.Mover;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EventoMoverDerechaEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;

    public EventoMoverDerechaEventHandler(Dibujo dibujo){
        this.dibujo = dibujo;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        Direccion direccionDerecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(direccionDerecha);
        dibujo.agregarBloque(moverDerecha);
    }

}