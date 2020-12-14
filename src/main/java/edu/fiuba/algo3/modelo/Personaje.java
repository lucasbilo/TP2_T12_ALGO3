package edu.fiuba.algo3.modelo;

public class Personaje {
    //Atributos
    private EstadoLapiz estadoLapiz;
    private int[] posicion;
    Algoritmo algoritmo;

    //Constructor
    public Personaje(){
        this.estadoLapiz = new LapizArriba();
        this.posicion = new int[]{0,0};
        this.algoritmo = new Algoritmo();
    }

    public EstadoLapiz obtenerEstadoLapiz(){
        return this.estadoLapiz;
    }

    public int[] obtenerPosicion(){
        return this.posicion;
    }

    public void modificarEstadoLapiz(EstadoLapiz nuevoEstado){
        this.estadoLapiz = nuevoEstado;
    }

    public void ejecutarPrograma(){
        for(int i = 0;i < algoritmo.tamaño();i++){
            this.posicion[0] = posicion[0] + (algoritmo.obtenerBloqueEnPosicion(i).ejecutarPosicion())[0];
            this.posicion[1] = posicion[1] + (algoritmo.obtenerBloqueEnPosicion(i).ejecutarPosicion())[1];
            this.estadoLapiz = algoritmo.obtenerBloqueEnPosicion(i).ejecutarEstado(this.estadoLapiz);

        }
    }

    public void agregarBloque(Bloque unBloque) {algoritmo.agregarBloque(unBloque);}
}
