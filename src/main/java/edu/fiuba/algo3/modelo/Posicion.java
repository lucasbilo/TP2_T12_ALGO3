package edu.fiuba.algo3.modelo;

public class Posicion {
    private int x;
    private int y;

    public Posicion(){
        this.x = 0;
        this.y = 0;
    }

    public void modificarX(int numero){
        this.x += numero;
    }

    public void modificarY(int numero){
        this.y += numero;
    }


}