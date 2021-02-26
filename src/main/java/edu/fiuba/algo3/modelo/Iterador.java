package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Iterador{
    private ArrayList<Bloque> array;
    private int posicion;

    public Iterador(ArrayList<Bloque> array) {
        this.array = array;
        posicion = 0;
    }

    public boolean tieneSiguiente(){
        if (posicion < array.size())
            return true;
        else
            return false;
    }

    public int actual(){
        return posicion;
    }

    public void siguiente(){
        posicion++;
    }
}
