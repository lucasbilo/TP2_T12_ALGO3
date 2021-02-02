package edu.fiuba.algo3.modelo;

public class Posicion {
    private int x = 0;
    private int y = 0;
    private EstadoLapiz estadoLapiz = new LapizArriba();

    public Posicion(){}

    public Posicion(int x, int y){
        this.x = x;
        this.y = y;
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

    public boolean estaPintado(){
        return estadoLapiz.lapizAbajo();
    }

    public void modificarEstadoLapiz(EstadoLapiz nuevoEstado){

        this.estadoLapiz = nuevoEstado;
    }

}
