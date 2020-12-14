package edu.fiuba.algo3.modelo;

public class Mover extends Bloque {
    //Atributos
    private Direccion direccion = new Direccion();

    public Mover(){
    }

    public Mover(Direccion direccion){
        this.direccion = direccion;
    }

    //Métodos
    public int[] ejecutarPosicion() {
        return direccion.obtenerCoordenadas();
    }

    public EstadoLapiz ejecutarEstado(EstadoLapiz estado){ return estado;}
}
