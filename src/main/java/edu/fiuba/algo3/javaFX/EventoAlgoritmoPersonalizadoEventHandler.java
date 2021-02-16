package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.AlgoritmoPersonalizado;
import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Direccion;
import edu.fiuba.algo3.modelo.Mover;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EventoAlgoritmoPersonalizadoEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;

    public EventoAlgoritmoPersonalizadoEventHandler(Dibujo dibujo){
        this.dibujo = dibujo;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        AlgoritmoPersonalizado algoritmoPersonalizado = new AlgoritmoPersonalizado(dibujo.algoritmo());
        dibujo.agregarBloque(algoritmoPersonalizado);
    }

}