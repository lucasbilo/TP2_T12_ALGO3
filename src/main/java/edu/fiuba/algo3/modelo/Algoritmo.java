package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Algoritmo {

    private ArrayList<Bloque> algoritmo;

    public Algoritmo(){ algoritmo = new ArrayList();}

    public ArrayList<Bloque> obtenerAlgoritmo() { return algoritmo; }

    public void agregarBloque(Bloque unBloque) { algoritmo.add(unBloque); }

    public void ejecutar(Personaje personaje, Tablero tablero){
        for (int i = 0; i < algoritmo.size(); i++){
            algoritmo.get(i).ejecutar(personaje, tablero);
        }
    }

    public void ejecutarInvertido(Personaje personaje, Tablero tablero){
        for (int i = 0; i < algoritmo.size(); i++){
            algoritmo.get(i).ejecutarInvertido(personaje, tablero);
        }
    }

    public void eliminarBloque(Bloque bloque) {
        for(int i = 0; i < algoritmo.size(); i++){
            if (bloque == algoritmo.get(i)) {
                System.out.println("Se remueve el de la posicion " + i);
                algoritmo.remove(i);
            }
        }
    }
}
