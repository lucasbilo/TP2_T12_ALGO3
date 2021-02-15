package edu.fiuba.algo3.modelo;

public class LapizArriba implements EstadoLapiz {

    public void esDibujo (Tablero tablero, Posicion posicion){
    }

    public boolean lapizAbajo(){
        return false;
    }

    public boolean lapizArriba() { return true; }

}
