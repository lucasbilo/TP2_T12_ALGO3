package edu.fiuba.algo3.modelo;

public class Dibujo {

    private Algoritmo algoritmo = new Algoritmo();
    private Personaje personaje = new Personaje();
    private Tablero tablero = new Tablero();

    public Dibujo(){}

    public Personaje personaje(){
        return this.personaje;
    }

    public Tablero tablero(){ return this.tablero; }

    public Algoritmo algoritmo(){return this.algoritmo;}

    public void agregarBloque (Bloque bloque){
        this.algoritmo.agregarBloque(bloque);
    }

    public void ejecutar(){
        this.algoritmo.ejecutar(this.personaje,this.tablero);
    }
}
