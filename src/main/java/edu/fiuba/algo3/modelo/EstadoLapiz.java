package edu.fiuba.algo3.modelo;

public interface EstadoLapiz {

    void esDibujo(Tablero tablero, Posicion posicion);

    boolean lapizAbajo();

    boolean lapizArriba();

}
