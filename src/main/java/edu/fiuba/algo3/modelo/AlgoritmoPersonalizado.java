package edu.fiuba.algo3.modelo;

public class AlgoritmoPersonalizado extends Bloque{

    private Algoritmo algoritmoGuardado = new Algoritmo();

    public AlgoritmoPersonalizado(){}

    public AlgoritmoPersonalizado(Algoritmo algoritmo){this.algoritmoGuardado = algoritmo;}

    public Algoritmo obtenerAlgoritmo(){return algoritmoGuardado;}

    public void ejecutar(Personaje personaje){
        algoritmoGuardado.ejecutar(personaje);
    }

    public void ejecutarInvertido(Personaje personaje){
        algoritmoGuardado.ejecutarInvertido(personaje);
    }
}
