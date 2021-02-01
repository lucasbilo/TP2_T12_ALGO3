package edu.fiuba.algo3.modelo;

public class LevantarLapiz extends Bloque{

    private LapizArriba estado;

    public LevantarLapiz(){this.estado = new LapizArriba(); }

    public void ejecutar(Personaje personaje, Tablero tablero){
        personaje.modificarEstadoLapiz(estado);
    }

    public void ejecutarInvertido(Personaje personaje, Tablero tablero) {
        EstadoLapiz lapizAbajo = new LapizAbajo();
        personaje.modificarEstadoLapiz(lapizAbajo);
    }
}
