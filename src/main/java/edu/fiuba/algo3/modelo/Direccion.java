package edu.fiuba.algo3.modelo;

public class Direccion {
    //Atributos
    private int[] coordenadas = {0,0};

    //Constructor
    public Direccion(){
    }

    public Direccion(int coordenadaX, int coordenadaY){
        this.coordenadas[0] = coordenadaX;
        this.coordenadas[1] = coordenadaY;
    }

    public int[] getDireccion() {
        return coordenadas;
    }
}
