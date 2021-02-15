package edu.fiuba.algo3.modelo;

public class LapizAbajo implements EstadoLapiz {

    public void esDibujo (Tablero tablero, Posicion posicion){
        tablero.actualizar(posicion);
    }

    public boolean lapizAbajo(){return true;}

    public boolean lapizArriba() { return false; }

}
