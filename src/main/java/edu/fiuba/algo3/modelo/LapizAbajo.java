package edu.fiuba.algo3.modelo;

public class LapizAbajo implements EstadoLapiz {
    private String tipo;

    public LapizAbajo(){
        tipo = "Abajo";
    }

    public String obtenerTipoEstado(){
        return tipo;
    }
}
