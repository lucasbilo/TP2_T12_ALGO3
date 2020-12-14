package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PersonajeTest {

    @Test
    public void test01SeCreaPersonajePorDefectoConLapizArriba(){
        Personaje personaje = new Personaje();
        EstadoLapiz estadoLapiz = personaje.obtenerEstadoLapiz();

        assertEquals(new LapizArriba(), estadoLapiz);
    }

    @Test
    public void test01SeModificaElEstadoDelLapizALapizAbajo(){
        Personaje personaje = new Personaje();
        personaje.modificarEstadoLapiz(new LapizAbajo());
        EstadoLapiz estadoLapiz = personaje.obtenerEstadoLapiz();

        assertEquals(new LapizAbajo(), estadoLapiz);
    }

}
