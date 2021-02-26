package edu.fiuba.algo3.modelo;

public class AlgoritmoPersonalizado extends Bloque{

    private Algoritmo algoritmoGuardado = new Algoritmo();

    public AlgoritmoPersonalizado(){}

    public AlgoritmoPersonalizado(Algoritmo algoritmo){this.algoritmoGuardado = algoritmo;}

    public Algoritmo obtenerAlgoritmo(){return algoritmoGuardado;}

    public void ejecutar(Personaje personaje, Tablero tablero){
        algoritmoGuardado.ejecutar(personaje, tablero);
    }

    public void ejecutarInvertido(Personaje personaje, Tablero tablero){
        algoritmoGuardado.ejecutarInvertido(personaje, tablero);
    }
}
