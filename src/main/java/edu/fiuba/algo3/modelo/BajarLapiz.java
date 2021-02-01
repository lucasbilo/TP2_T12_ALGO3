package edu.fiuba.algo3.modelo;

public class BajarLapiz extends Bloque{

    private LapizAbajo estado;

    public BajarLapiz(){ this.estado = new LapizAbajo();}

    public void ejecutar(Personaje personaje, Tablero tablero){

        personaje.modificarEstadoLapiz(estado);
    }

    public void ejecutarInvertido(Personaje personaje, Tablero tablero) {
        EstadoLapiz lapizArriba = new LapizArriba();
        personaje.modificarEstadoLapiz(lapizArriba);
    }
}
