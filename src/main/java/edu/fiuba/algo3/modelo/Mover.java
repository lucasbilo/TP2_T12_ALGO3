package edu.fiuba.algo3.modelo;

public class Mover extends Bloque {

    private Direccion direccion = new Direccion();

    public Mover(){ }

    public Mover(Direccion direccion){
        this.direccion = direccion;
    }

    public void ejecutar(Personaje personaje, Tablero tablero){
        personaje.modificarPosicion(direccion);
    }

    public void ejecutarInvertido(Personaje personaje, Tablero tablero) {
        Direccion direccionInvertida = direccion.invertir();
        personaje.modificarPosicion(direccionInvertida);
    }

    public Direccion obtenerDireccion (){
        return this.direccion;
    }

}
