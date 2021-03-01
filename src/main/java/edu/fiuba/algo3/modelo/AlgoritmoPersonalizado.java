package edu.fiuba.algo3.modelo;

public class AlgoritmoPersonalizado extends Bloque{

    private Algoritmo algoritmoGuardado = new Algoritmo();

    public AlgoritmoPersonalizado(){}

    public AlgoritmoPersonalizado(Algoritmo algoritmo){this.algoritmoGuardado = algoritmo;}

    public void agregarAlgoritmo(Algoritmo algoritmo){this.algoritmoGuardado = algoritmo;}

    public Algoritmo obtenerAlgoritmo(){return algoritmoGuardado;}

    public void ejecutar(Personaje personaje, Tablero tablero){
        Iterador iterador = new Iterador(algoritmoGuardado.obtenerAlgoritmo());
        while (iterador.tieneSiguiente()){
            algoritmoGuardado.ejecutar(personaje, tablero, iterador.actual());
            iterador.siguiente();
        }
    }


    public void ejecutarInvertido(Personaje personaje, Tablero tablero){
        Iterador iterador = new Iterador(algoritmoGuardado.obtenerAlgoritmo());
        while (iterador.tieneSiguiente()){
            algoritmoGuardado.ejecutarInvertido(personaje, tablero, iterador.actual());
            iterador.siguiente();
        }
    }
}
