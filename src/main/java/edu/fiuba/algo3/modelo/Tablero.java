package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Tablero {

    private ArrayList<Posicion> posiciones = new ArrayList<Posicion>();

    public void escribir(Posicion posicion){

        posiciones.add(posicion);
    }

}
