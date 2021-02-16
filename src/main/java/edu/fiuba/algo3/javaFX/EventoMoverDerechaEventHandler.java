package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Direccion;
import edu.fiuba.algo3.modelo.Mover;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class EventoMoverDerechaEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;
    private final VBox algoritmo;

    public EventoMoverDerechaEventHandler(Dibujo dibujo, VBox algoritmo){
        this.dibujo = dibujo;
        this.algoritmo = algoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        Direccion direccionDerecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(direccionDerecha);
        dibujo.agregarBloque(moverDerecha);

        Button botonDerecha = new Button("Mover Derecha");
        EventoEliminarBloqueEventHandler eventoBorrarBloqueEventHandler = new EventoEliminarBloqueEventHandler(dibujo, moverDerecha, algoritmo, botonDerecha);
        botonDerecha.setOnAction(eventoBorrarBloqueEventHandler);
        algoritmo.getChildren().add(botonDerecha);
    }

}