package edu.fiuba.algo3.modelo;

public class Mover extends Bloque {

    private Direccion direccion = new Direccion();

    public Mover(){ }

    public Mover(Direccion direccion){
        this.direccion = direccion;
    }

    public void ejecutar(Personaje personaje){
        personaje.modificarPosicion(direccion);
    }

    public Direccion obtenerDireccion (){
        return this.direccion;
    }

}
