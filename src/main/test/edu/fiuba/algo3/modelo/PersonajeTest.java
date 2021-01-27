package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PersonajeTest {

    @Test
    public void test01SeCreaPersonajePorDefectoConLapizArriba() {
        Personaje personaje = new Personaje();
        EstadoLapiz estadoLapiz = personaje.obtenerEstadoLapiz();

        assertEquals(true, estadoLapiz.lapizArriba());
    }

    @Test
    public void test02SeModificaElEstadoDelLapizDelPersonajeALapizAbajo() {
        Personaje personaje = new Personaje();
        personaje.modificarEstadoLapiz(new LapizAbajo());
        EstadoLapiz estadoLapiz = personaje.obtenerEstadoLapiz();

        assertEquals(true, estadoLapiz.lapizAbajo());
    }

    @Test
    public void test03SeModificaLaPosicionDelPersonajeCincoLugaresHaciaArriba() {
        Personaje personaje = new Personaje();
        Direccion direccionArriba = new Direccion(0, 5);
        personaje.modificarPosicion(direccionArriba);
        Posicion posicion = personaje.obtenerPosicion();

        assertEquals(5, posicion.obtenerX());
    }
}
