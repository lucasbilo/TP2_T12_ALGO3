package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PersonajeTest {

    @Test
    public void test01SeCreaPersonajePorDefectoConLapizArriba() {
        Personaje personaje = new Personaje();
        EstadoLapiz estadoLapiz = personaje.obtenerEstadoLapiz();

        assertTrue(estadoLapiz.lapizArriba());
    }

    @Test
    public void test02SeModificaElEstadoDelLapizDelPersonajeALapizAbajo() {
        Personaje personaje = new Personaje();
        personaje.modificarEstadoLapiz(new LapizAbajo());
        EstadoLapiz estadoLapiz = personaje.obtenerEstadoLapiz();

        assertTrue(estadoLapiz.lapizAbajo());
    }

    @Test
    public void test03SeModificaLaPosicionDelPersonajeCincoLugaresHaciaArriba() {
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Direccion direccionArriba = new Direccion(0, 5);
        personaje.modificarPosicion(direccionArriba, tablero);

        assertEquals(5, personaje.obtenerPosicion().obtenerY());
    }
}
