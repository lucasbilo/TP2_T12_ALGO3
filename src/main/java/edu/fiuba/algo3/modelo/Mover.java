package edu.fiuba.algo3.modelo;

public class Mover {
    //Atributos
    private Direccion direccion = new Direccion();

    public Mover(){
    }

    public Mover(Direccion direccion){
        this.direccion = direccion;
    }

    //Métodos
    Direccion ejecutarBloque() {
        return direccion;
    }
}
