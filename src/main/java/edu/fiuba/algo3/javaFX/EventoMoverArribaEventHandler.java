package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Direccion;
import edu.fiuba.algo3.modelo.Mover;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EventoMoverArribaEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;

    public EventoMoverArribaEventHandler(Dibujo dibujo){
        this.dibujo = dibujo;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        Direccion direccionArriba = new Direccion(0,1);
        Mover moverArriba = new Mover(direccionArriba);
        dibujo.agregarBloque(moverArriba);
    }

}
