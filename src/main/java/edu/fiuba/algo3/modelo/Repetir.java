package edu.fiuba.algo3.modelo;

public class Repetir extends Bloque{

    //Por default se repite 2 veces
    private int numVeces = 2;
    private Algoritmo algoritmoRepetido = new Algoritmo();

    public Repetir(){}

    public Repetir(int numVeces){
        this.numVeces = numVeces;
    }

    public Repetir(int numVeces, Algoritmo algoritmo){
        this.numVeces = numVeces;
        this.algoritmoRepetido = algoritmo;
    }

    public Algoritmo obtenerAlgoritmo(){ return algoritmoRepetido; }

    public void agregarBloque(Bloque unBloque){ algoritmoRepetido.agregarBloque(unBloque);}

    public void ejecutar(Personaje personaje, Tablero tablero){

        for(int i = 0; i < numVeces; i = i + 1) {
            Iterador iterador = new Iterador(algoritmoRepetido.obtenerAlgoritmo());
            while (iterador.tieneSiguiente()){
                algoritmoRepetido.ejecutar(personaje, tablero, iterador.actual());
                iterador.siguiente();
            }
        }
    }

    public void ejecutarInvertido(Personaje personaje, Tablero tablero) {
        for (int i = 0; i < numVeces; i = i + 1) {
            Iterador iterador = new Iterador(algoritmoRepetido.obtenerAlgoritmo());
            while (iterador.tieneSiguiente()) {
                algoritmoRepetido.ejecutarInvertido(personaje, tablero, iterador.actual());
                iterador.siguiente();
            }
        }
    }
}
