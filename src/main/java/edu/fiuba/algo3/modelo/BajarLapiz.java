package edu.fiuba.algo3.modelo;

public class BajarLapiz extends Bloque{

    private LapizAbajo estado;

    public BajarLapiz(){ this.estado = new LapizAbajo();}

    public void ejecutar(Personaje personaje){
        personaje.modificarEstadoLapiz(estado);
    }

    public void ejecutarInvertido(Personaje personaje) {
        EstadoLapiz lapizArriba = new LapizArriba();
        personaje.modificarEstadoLapiz(lapizArriba);
    }
}
