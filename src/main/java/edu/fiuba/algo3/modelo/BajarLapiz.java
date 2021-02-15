package edu.fiuba.algo3.modelo;

public class BajarLapiz extends Bloque{

    public BajarLapiz(){    }

    public void ejecutar(Personaje personaje, Tablero tablero){
        personaje.modificarEstadoLapiz(new LapizAbajo());
    }

    public void ejecutarInvertido(Personaje personaje, Tablero tablero) {
        EstadoLapiz lapizArriba = new LapizArriba();
        personaje.modificarEstadoLapiz(lapizArriba);
    }
}
