package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Direccion;
import edu.fiuba.algo3.modelo.Mover;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class EventoDropMoverArribaHandler implements EventHandler<ActionEvent>{
        private final Dibujo dibujo;
        private final VBox algoritmo;

        public EventoDropMoverArribaHandler(Dibujo dibujo, VBox algoritmo){
            this.dibujo = dibujo;
            this.algoritmo = algoritmo;
        }

        @Override
        public void handle(ActionEvent actionEvent){
            Direccion direccionArriba = new Direccion(0,1);
            Mover moverArriba = new Mover(direccionArriba);
            dibujo.agregarBloque(moverArriba);

            Button botonArriba = new Button("Mover Arriba");
            EventoEliminarBloqueEventHandler eventoBorrarBloqueEventHandler = new EventoEliminarBloqueEventHandler(dibujo, moverArriba, algoritmo, botonArriba);
            botonArriba.setOnAction(eventoBorrarBloqueEventHandler);
            algoritmo.getChildren().add(botonArriba);
        }

}

