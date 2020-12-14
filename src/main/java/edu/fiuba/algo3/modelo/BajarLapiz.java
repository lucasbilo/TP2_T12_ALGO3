package edu.fiuba.algo3.modelo;

public class BajarLapiz extends Bloque{

    private LapizAbajo estadoLapiz;

    public BajarLapiz(){ this.estadoLapiz = new LapizAbajo();}

    public BajarLapiz (Personaje personaje){ personaje.modificarEstadoLapiz(new LapizAbajo()); }

    public EstadoLapiz ejecutarEstado(EstadoLapiz estado){ return this.estadoLapiz; }

    public int[] ejecutarPosicion(){ return new int[] {0,0}; }
}
