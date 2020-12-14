package edu.fiuba.algo3.modelo;

public class LevantarLapiz extends Bloque{
    private EstadoLapiz estado;

    public LevantarLapiz(){this.estado = new LapizArriba(); }

    public LevantarLapiz (Personaje personaje){
        personaje.modificarEstadoLapiz(new LapizArriba());
    }

    public EstadoLapiz ejecutarEstado(EstadoLapiz estadoLapiz) { return this.estado; }

    public int[] ejecutarPosicion(){ return new int[] {0,0}; }
}
