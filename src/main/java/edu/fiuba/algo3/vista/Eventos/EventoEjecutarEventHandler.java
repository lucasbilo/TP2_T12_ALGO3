package edu.fiuba.algo3.vista.Eventos;

import edu.fiuba.algo3.vista.SectorPersonaje;
import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.*;
import java.util.ArrayList;


public class EventoEjecutarEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;
    private final Canvas canva;

    public EventoEjecutarEventHandler(Dibujo dibujo, Canvas canva) {
        this.dibujo = dibujo;
        this.canva = canva;
    }

    public void handle(ActionEvent actionEvent){

        GraphicsContext gc = canva.getGraphicsContext2D();

        gc.beginPath();
        double xMedio = (gc.getCanvas().getWidth()) / 2;
        double yMedio = (gc.getCanvas().getHeight()) / 2;
        gc.moveTo(xMedio,yMedio);
        SectorPersonaje sectorPersonaje = new SectorPersonaje(gc,xMedio,yMedio);
        dibujo.tablero().resetear();
        dibujo.ejecutar();
        
        ArrayList<Trazo> trazos = this.dibujo.tablero().obtenerTrazos();
        for (int i = 0; i < trazos.size(); i++) {
            if(trazos.get(i).obtenerEstadoLapiz().lapizAbajo()){
                gc.lineTo(xMedio + trazos.get(i).obtenerFinal().obtenerX(), yMedio + trazos.get(i).obtenerFinal().obtenerY());
            }
            else{
                gc.moveTo(xMedio + trazos.get(i).obtenerFinal().obtenerX(), yMedio + trazos.get(i).obtenerFinal().obtenerY());
            }
            sectorPersonaje.actualizarPosicion(xMedio + trazos.get(i).obtenerFinal().obtenerX(), yMedio + trazos.get(i).obtenerFinal().obtenerY());
        }
        gc.stroke();
    }

}