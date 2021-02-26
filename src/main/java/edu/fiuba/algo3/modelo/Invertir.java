package edu.fiuba.algo3.modelo;

public class Invertir extends Bloque{

    private Algoritmo algoritmoInvertido = new Algoritmo();

    public Invertir(){}

    public Invertir(Algoritmo algoritmo){ this.algoritmoInvertido = algoritmo; }

    public void agregarBloque(Bloque unBloque){ algoritmoInvertido.agregarBloque(unBloque); }

    public Algoritmo obtenerAlgoritmo(){ return algoritmoInvertido; }

    public void ejecutar(Personaje personaje, Tablero tablero){
        Iterador iterador = new Iterador(algoritmoInvertido.obtenerAlgoritmo());
        while (iterador.tieneSiguiente()){
            algoritmoInvertido.ejecutarInvertido(personaje, tablero, iterador.actual());
            iterador.siguiente();
        }
    }

    public void ejecutarInvertido(Personaje personaje, Tablero tablero){
        Iterador iterador = new Iterador(algoritmoInvertido.obtenerAlgoritmo());
        while (iterador.tieneSiguiente()){
            algoritmoInvertido.ejecutar(personaje, tablero, iterador.actual());
            iterador.siguiente();
        }
    }
}
