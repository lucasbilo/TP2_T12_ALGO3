package edu.fiuba.algo3.modelo;

public class Posicion {
    private int x;
    private int y;
    private EstadoLapiz estadoLapiz = new LapizArriba();

    public Posicion(){
        this.x = 0;
        this.y = 0;
    }

    public void modificar(Direccion direccion){
        this.x += direccion.obtenerCoordenadas()[0];
        this.y += direccion.obtenerCoordenadas()[1];
    }

    public int obtenerX(){
        return x;
    }

    public int obtenerY(){
        return y;
    }

    public EstadoLapiz obtenerEstadoLapiz(){
        return this.estadoLapiz;
    }

    public void modificarEstadoLapiz(EstadoLapiz nuevoEstado){

        this.estadoLapiz = nuevoEstado;
    }

}
