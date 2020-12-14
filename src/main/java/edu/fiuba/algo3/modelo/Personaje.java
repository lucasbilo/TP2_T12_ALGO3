package edu.fiuba.algo3.modelo;

public class Personaje {
    //Atributos
    private EstadoLapiz estadoLapiz;

    //Constructor
    public Personaje(){
        this.estadoLapiz = new LapizArriba();
    }

    public EstadoLapiz obtenerEstadoLapiz(){
        return this.estadoLapiz;
    }

    public void modificarEstadoLapiz(EstadoLapiz nuevoEstado){
        this.estadoLapiz = nuevoEstado;
    }

}
