package edu.fiuba.algo3.modelo;

public class LapizArriba implements EstadoLapiz {
    private String tipo;

    public LapizArriba(){
        tipo = "Arriba";
    }

    public String obtenerTipoEstado(){
        return tipo;
    }

}
