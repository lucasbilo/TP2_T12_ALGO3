package edu.fiuba.algo3.vista.Eventos;

import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class EventoBorrarEventHandler implements EventHandler<ActionEvent>{

    private final Canvas canva;
    private final Dibujo dibujo;

    public EventoBorrarEventHandler(Dibujo dibujo, Canvas canva){
        this.canva = canva;
        this.dibujo = dibujo;
    }

    @Override
    public void handle(ActionEvent actionEvent){

        GraphicsContext gc = canva.getGraphicsContext2D();
        gc.clearRect(0, 0, canva.getWidth(), canva.getHeight());
        gc.strokeRect(0, 0, canva.getWidth(), canva.getHeight());
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);
        dibujo.personaje().modificarEstadoLapiz(new LapizArriba());
        dibujo.personaje().obtenerPosicion().resetearCoordenadas();
    }


}
