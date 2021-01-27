package edu.fiuba.algo3.modelo;

public class LevantarLapiz extends Bloque{

    private LapizArriba estado;

    public LevantarLapiz(){this.estado = new LapizArriba(); }

    public void ejecutar(Personaje personaje){
        personaje.modificarEstadoLapiz(estado);
    }
}
