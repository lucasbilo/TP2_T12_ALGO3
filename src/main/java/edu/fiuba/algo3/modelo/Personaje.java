
package edu.fiuba.algo3.modelo;

public class Personaje {
    //Atributos
    //private EstadoLapiz estadoLapiz;
    private Posicion posicion;

    //Constructor
    public Personaje(){
        this.posicion = new Posicion();
        //this.estadoLapiz = new LapizArriba();
    }

    public EstadoLapiz obtenerEstadoLapiz(){
        return this.posicion.obtenerEstadoLapiz();
    }

    public Posicion obtenerPosicion(){
        return this.posicion;
    }

    public void modificarPosicion(Direccion direccion, Tablero tablero){

        posicion.modificar(direccion);
        tablero.escribir(this.posicion);
    }

    public void modificarEstadoLapiz(EstadoLapiz nuevoEstado){
        this.posicion.modificarEstadoLapiz(nuevoEstado);
    }

}
