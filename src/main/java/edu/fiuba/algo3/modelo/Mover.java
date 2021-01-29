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

    public void ejecutarInvertido(Personaje personaje) {
        Direccion direccionInvertida = direccion.invertir();
        personaje.modificarPosicion(direccionInvertida);
    }

    public Direccion obtenerDireccion (){
        return this.direccion;
    }

}
