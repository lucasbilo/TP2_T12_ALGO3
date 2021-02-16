package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.AlgoritmoPersonalizado;
import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Direccion;
import edu.fiuba.algo3.modelo.Mover;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class EventoAlgoritmoPersonalizadoEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;
    private final VBox algoritmo;

    public EventoAlgoritmoPersonalizadoEventHandler(Dibujo dibujo, VBox algoritmo){
        this.dibujo = dibujo;
        this.algoritmo = algoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        AlgoritmoPersonalizado algoritmoPersonalizado = new AlgoritmoPersonalizado(dibujo.algoritmo());
        dibujo.agregarBloque(algoritmoPersonalizado);

        Button botonAlgoritmoPersonalizado = new Button("Algoritmo Personalizado");
        algoritmo.getChildren().add(botonAlgoritmoPersonalizado);
    }

}