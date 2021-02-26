package edu.fiuba.algo3.vista;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;



public class SectorDibujo {

    private Canvas canva;

    public SectorDibujo(){
        Canvas canvas = new Canvas(500,500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.strokeRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);
        this.canva = canvas;
}

    public Canvas obtenerCanva(){
        return this.canva;
    }

}