package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class EventoLevantarLapizEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;
    private final VBox algoritmo;

    public EventoLevantarLapizEventHandler(Dibujo dibujo, VBox algoritmo){
        this.dibujo = dibujo;
        this.algoritmo = algoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        Bloque bloque = new LevantarLapiz();
        dibujo.agregarBloque(bloque);

        Button botonLevantarLapiz = new Button("Levantar Lapiz");
        EventoEliminarBloqueEventHandler eventoBorrarBloqueEventHandler = new EventoEliminarBloqueEventHandler(dibujo, bloque, algoritmo, botonLevantarLapiz);
        botonLevantarLapiz.setOnAction(eventoBorrarBloqueEventHandler);
        algoritmo.getChildren().add(botonLevantarLapiz);
    }

}