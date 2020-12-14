package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Algoritmo {

    private ArrayList<Bloque> algoritmo;

    public Algoritmo(){ algoritmo = new ArrayList();}

    public ArrayList<Bloque> obtenerAlgoritmo() { return algoritmo; }

    public void agregarBloque(Bloque unBloque) { algoritmo.add(unBloque); }

    public Bloque obtenerBloqueEnPosicion(int pos){ return algoritmo.get(pos); }

    public int tamaño() { return algoritmo.size(); }
}
