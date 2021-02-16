package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Direccion;
import edu.fiuba.algo3.modelo.Mover;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class EventoMoverAbajoEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;
    private final VBox algoritmo;

    public EventoMoverAbajoEventHandler(Dibujo dibujo, VBox algoritmo){
        this.dibujo = dibujo;
        this.algoritmo = algoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        Direccion direccionAbajo = new Direccion(0,-1);
        Mover moverAbajo = new Mover(direccionAbajo);
        dibujo.agregarBloque(moverAbajo);

        Button botonAbajo = new Button("Mover Abajo");
        EventoEliminarBloqueEventHandler eventoBorrarBloqueEventHandler = new EventoEliminarBloqueEventHandler(dibujo, moverAbajo, algoritmo, botonAbajo);
        botonAbajo.setOnAction(eventoBorrarBloqueEventHandler);
        this.algoritmo.getChildren().add(botonAbajo);
    }

}
