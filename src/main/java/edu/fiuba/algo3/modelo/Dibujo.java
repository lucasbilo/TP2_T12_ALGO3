package edu.fiuba.algo3.modelo;

public class Dibujo {

    private Algoritmo algoritmo = new Algoritmo();
    private Personaje personaje = new Personaje();
    private Tablero tablero = new Tablero();

    public void moverArriba(){
        Direccion direccionArriba = new Direccion(0,1);
        Mover moverArriba = new Mover(direccionArriba);
        this.algoritmo.agregarBloque(moverArriba);
    }

    public void ejecutar(){
        this.algoritmo.ejecutar(this.personaje,this.tablero);
    }
}
