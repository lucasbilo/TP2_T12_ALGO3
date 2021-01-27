package edu.fiuba.algo3.modelo;

public class Personaje {
    //Atributos
    private EstadoLapiz estadoLapiz;
    private Posicion posicion;

    //Constructor
    public Personaje(){
        this.estadoLapiz = new LapizArriba();
    }

    /*public EstadoLapiz obtenerEstadoLapiz(){
        return this.estadoLapiz;
    }

    public Posicion obtenerPosicion(){
        return this.posicion;
    }*/

    public void modificarPosicion(Direccion direccion){
        posicion.modificarX(direccion.obtenerCoordenadas()[0]);
        posicion.modificarY(direccion.obtenerCoordenadas()[1]);
    }

    public void modificarEstadoLapiz(EstadoLapiz nuevoEstado){
        this.estadoLapiz = nuevoEstado;
    }

}
