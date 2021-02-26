package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Algoritmo {

    private ArrayList<Bloque> algoritmo;

    public Algoritmo(){ algoritmo = new ArrayList();}

    public ArrayList<Bloque> obtenerAlgoritmo() { return algoritmo; }

    public void agregarBloque(Bloque unBloque) { algoritmo.add(unBloque); }

    public void ejecutar(Personaje personaje, Tablero tablero, int indice){
            algoritmo.get(indice).ejecutar(personaje, tablero);
    }

    public void ejecutarInvertido(Personaje personaje, Tablero tablero, int indice){
            algoritmo.get(indice).ejecutarInvertido(personaje, tablero);
    }

    public void eliminarBloque(Bloque bloque) {
        for(int i = 0; i < algoritmo.size(); i++){
            if (bloque == algoritmo.get(i)) {
                algoritmo.remove(i);
            }
        }
    }
}
