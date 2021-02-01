package edu.fiuba.algo3.modelo;

public abstract class Bloque {

    abstract void ejecutar(Personaje personaje, Tablero tablero);

    public abstract void ejecutarInvertido(Personaje personaje, Tablero tablero);
}
