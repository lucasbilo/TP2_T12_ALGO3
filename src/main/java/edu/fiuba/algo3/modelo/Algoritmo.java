package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Algoritmo{

    private ArrayList<Bloque> algoritmo = new ArrayList<>();

    public Algoritmo(){}

    public Algoritmo(ArrayList<Bloque> algoritmo) { this.algoritmo = algoritmo;}

    public ArrayList<Bloque> obtenerAlgoritmo() { return algoritmo; }

    public void agregarBloque(Bloque unBloque) { algoritmo.add(unBloque); }

    public void ejecutar(Personaje personaje, Tablero tablero){
        for(int i = 0; i < algoritmo.size(); i++){
            algoritmo.get(i).ejecutar(personaje, tablero);
        }
    }

    public void ejecutarInvertido(Personaje personaje, Tablero tablero){
        for(int i = 0; i < algoritmo.size(); i++){
            algoritmo.get(i).ejecutarInvertido(personaje, tablero);
        }
    }

    public void eliminarBloque(Bloque bloque) {
        for(int i = 0; i < algoritmo.size(); i++){
            if (bloque == algoritmo.get(i)) {
                algoritmo.remove(i);
            }
        }
    }

    public Algoritmo clonarAlgoritmo(){
        ArrayList<Bloque> nuevoArray = new ArrayList<>();
        for(int i = 0; i < algoritmo.size(); i++){
                nuevoArray.add(algoritmo.get(i).clonarBloque());
            }
        return new Algoritmo(nuevoArray);
    }

}
