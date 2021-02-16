package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Direccion;
import edu.fiuba.algo3.modelo.Mover;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class EventoMoverIzquierdaEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;
    private final VBox algoritmo;

    public EventoMoverIzquierdaEventHandler(Dibujo dibujo, VBox algoritmo){
        this.dibujo = dibujo;
        this.algoritmo = algoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        Direccion direccionIzquierda = new Direccion(-1,0);
        Mover moverIzquierda = new Mover(direccionIzquierda);
        dibujo.agregarBloque(moverIzquierda);

        Button botonIzquierda = new Button("Mover Izquierda");
        EventoEliminarBloqueEventHandler eventoBorrarBloqueEventHandler = new EventoEliminarBloqueEventHandler(dibujo, moverIzquierda, algoritmo, botonIzquierda);
        botonIzquierda.setOnAction(eventoBorrarBloqueEventHandler);
        algoritmo.getChildren().add(botonIzquierda);
    }

}