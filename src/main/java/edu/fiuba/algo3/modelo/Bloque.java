package edu.fiuba.algo3.modelo;

public abstract class Bloque {

    //metodos abstractos
    abstract int[] ejecutarPosicion(); //este metodo es para la clase mover
    abstract EstadoLapiz ejecutarEstado(EstadoLapiz estado);//abstract EstadoLapiz ejecutarBloque; //este metodo es para las clases bajar y levantar lapiz
}
