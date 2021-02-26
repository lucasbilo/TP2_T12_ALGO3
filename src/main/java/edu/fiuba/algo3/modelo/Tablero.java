package edu.fiuba.algo3.modelo;
import javafx.scene.control.Tab;

import java.util.ArrayList;
import java.util.Optional;

public class Tablero {

    private ArrayList<Posicion> posiciones = new ArrayList<>();
    private int alto = 10;
    private int ancho = 10;

    public Tablero(){}

    public Tablero(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public void escribir(Posicion posicion){
        Optional<Posicion> nuevaPosicion = this.obtenerPosicion(posicion);
        if(nuevaPosicion.isEmpty()){
            this.posiciones.add(posicion);
        }
    }

    public Optional<Posicion> obtenerPosicion(Posicion pos){
        return this.posiciones.stream().filter(posicion -> posicion.igualA(pos)).findFirst();
        //devuelve NULL si no se encuentra
    }

    public boolean existePosicion(Posicion pos){
        return this.posiciones.stream().anyMatch(posicion -> posicion.igualA(pos));
    }

    public void actualizar(Posicion posicion){
        Posicion posicionNueva = new Posicion(posicion.obtenerX(),posicion.obtenerY());
        this.escribir(posicionNueva);
    }

    public boolean posicionEsValida(Posicion posicion) {
        boolean x = Math.abs(posicion.obtenerX()) <= this.ancho / 2;
        boolean y = Math.abs(posicion.obtenerY()) <= this.alto / 2;
        return x && y;
    }

    public void resetear(){
        this.posiciones = new ArrayList<>();
    }
}
