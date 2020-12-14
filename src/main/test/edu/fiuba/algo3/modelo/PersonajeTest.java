package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PersonajeTest {

    @Test
    public void test01SeCreaPersonajePorDefectoConLapizArriba(){
        Personaje personaje = new Personaje();
        EstadoLapiz estadoLapiz = personaje.obtenerEstadoLapiz();

        assertEquals("Arriba", estadoLapiz.obtenerTipoEstado());
    }

    @Test
    public void test02SeModificaElEstadoDelLapizALapizAbajo(){
        Personaje personaje = new Personaje();
        personaje.modificarEstadoLapiz(new LapizAbajo());
        EstadoLapiz estadoLapiz = personaje.obtenerEstadoLapiz();

        assertEquals("Abajo", estadoLapiz.obtenerTipoEstado());
    }

}
