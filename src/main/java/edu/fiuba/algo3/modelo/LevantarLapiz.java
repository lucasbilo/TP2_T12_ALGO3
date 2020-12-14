package edu.fiuba.algo3.modelo;

public class LevantarLapiz{

    public LevantarLapiz (Personaje personaje){
        personaje.modificarEstadoLapiz(new LapizArriba());
    }

}
