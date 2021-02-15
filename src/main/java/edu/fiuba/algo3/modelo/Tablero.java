package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Optional;

public class Tablero {

    private ArrayList<Posicion> posiciones = new ArrayList<Posicion>();

    public Tablero(){}

    public void escribir(Posicion posicion){
        Posicion nuevaPosicion = this.obtenerPosicion(posicion.obtenerX(), posicion.obtenerY());
        if(nuevaPosicion == null) { //si entra al if significa que la posicion no esta cargada en el tablero
            this.posiciones.add(posicion);
        }
    }

    public Posicion obtenerPosicion(int x, int y){
        Optional<Posicion> buscada = this.posiciones.stream()
                .filter(posicion -> (posicion.obtenerX() == x)
                        && (posicion.obtenerY() == y))
                .findFirst();
        return buscada.orElse(null); //devuelve NULL si no se encuentra
    }

    public boolean existePosicion(int x, int y){
        return this.posiciones.stream()
                .anyMatch(posicion -> (posicion.obtenerX() == x) && (posicion.obtenerY() == y));
    }

    public void actualizar(Posicion posicion){
        Posicion posicionNueva = new Posicion(posicion.obtenerX(),posicion.obtenerY());
        this.escribir(posicionNueva);
    }

}
