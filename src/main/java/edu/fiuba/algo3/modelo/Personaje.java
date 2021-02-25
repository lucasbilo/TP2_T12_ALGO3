
package edu.fiuba.algo3.modelo;

public class Personaje {
    //Atributos
    private EstadoLapiz estadoLapiz;
    private Posicion posicion;

    //Constructor
    public Personaje(){
        this.posicion = new Posicion();
        this.estadoLapiz = new LapizArriba();
    }

    public EstadoLapiz obtenerEstadoLapiz(){
        return this.estadoLapiz;
    }

    public Posicion obtenerPosicion(){
        return this.posicion;
    }

    public void modificarPosicion(Direccion direccion, Tablero tablero){
        Posicion nuevaPosicion = this.posicion.mover(direccion);
        this.estadoLapiz.esDibujo(tablero, posicion);
        this.posicion = nuevaPosicion;
    }

    public void modificarEstadoLapiz(EstadoLapiz nuevoEstado){
        this.estadoLapiz = nuevoEstado;
    }

    public void resetearPosicion(){posicion.resetearCoordenadas();}

}
