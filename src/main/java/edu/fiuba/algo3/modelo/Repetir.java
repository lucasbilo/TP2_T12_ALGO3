package edu.fiuba.algo3.modelo;

public class Repetir extends Bloque{

    //Por default se repite 2 veces
    private int numVeces = 2;
    private Algoritmo algoritmoRepetido = new Algoritmo();

    public Repetir(){}

    public Repetir(int numVeces){
        this.numVeces = numVeces;
    }

    public Algoritmo obtenerAlgoritmo(){ return algoritmoRepetido; }

    public void agregarBloque(Bloque unBloque){ algoritmoRepetido.agregarBloque(unBloque);}

    public void ejecutar(Personaje personaje){
        for(int i = 0; i < numVeces; i = i + 1) {
            algoritmoRepetido.ejecutar(personaje);
        }
    }

    public void ejecutarInvertido(Personaje personaje) {
        for (int i = 0; i < numVeces; i = i + 1) {
            algoritmoRepetido.ejecutarInvertido(personaje);
        }
    }
}
