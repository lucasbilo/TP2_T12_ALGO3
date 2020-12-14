package edu.fiuba.algo3.modelo;

public class BajarLapiz{

    public BajarLapiz (Personaje personaje){
        personaje.modificarEstadoLapiz(new LapizAbajo());
    }
}
