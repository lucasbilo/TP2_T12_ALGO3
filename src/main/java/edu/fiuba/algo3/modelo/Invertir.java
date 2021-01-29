package edu.fiuba.algo3.modelo;

public class Invertir extends Bloque{

    private Algoritmo algoritmoInvertido = new Algoritmo();

    public Invertir(){}

    public Invertir(Algoritmo algoritmo){ this.algoritmoInvertido = algoritmo; }

    public void agregarBloque(Bloque unBloque){ algoritmoInvertido.agregarBloque(unBloque); }

    public Algoritmo obtenerAlgoritmo(){ return algoritmoInvertido; }

    public void ejecutar(Personaje personaje){ algoritmoInvertido.ejecutarInvertido(personaje); }

    public void ejecutarInvertido(Personaje personaje) {algoritmoInvertido.ejecutar(personaje);}
}
