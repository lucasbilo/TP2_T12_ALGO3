package edu.fiuba.algo3.javaFX.Eventos;
import edu.fiuba.algo3.javaFX.SectorPersonaje;
import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.*;

import java.util.ArrayList;


public class EventoEjecutarEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;
    private final Canvas canva;

    public EventoEjecutarEventHandler(Dibujo dibujo, Canvas canva){
        this.dibujo = dibujo;
        this.canva = canva;
    }

    public void handle(ActionEvent actionEvent){

        GraphicsContext gc = canva.getGraphicsContext2D();
        gc.beginPath();
        double xMedio = gc.getCanvas().getWidth() / 2;
        double yMedio = gc.getCanvas().getHeight() / 2;
        gc.moveTo(xMedio,yMedio);
        SectorPersonaje sectorPersonaje = new SectorPersonaje(gc,xMedio,yMedio);
        ArrayList<Bloque> algoritmo = dibujo.algoritmo().obtenerAlgoritmo();
        dibujo.tablero().resetear();
        Iterador iterador = new Iterador(algoritmo);
        while (iterador.tieneSiguiente()){
            Posicion posicionAnterior = dibujo.personaje().obtenerPosicion();
            dibujo.ejecutar(iterador.actual());
            if(dibujo.tablero().existePosicion(posicionAnterior)){
                gc.lineTo(xMedio + dibujo.personaje().obtenerPosicion().obtenerX(), yMedio + dibujo.personaje().obtenerPosicion().obtenerY());
            }
            else{
                gc.moveTo(xMedio + dibujo.personaje().obtenerPosicion().obtenerX(), yMedio + dibujo.personaje().obtenerPosicion().obtenerY());
            }
            iterador.siguiente();
            sectorPersonaje.actualizarPosicion(xMedio + dibujo.personaje().obtenerPosicion().obtenerX(), yMedio + dibujo.personaje().obtenerPosicion().obtenerY());
        }
        gc.stroke();
        }
    }