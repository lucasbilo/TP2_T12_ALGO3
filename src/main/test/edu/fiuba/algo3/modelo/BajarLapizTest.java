package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BajarLapizTest {

    @Test
    public void test01SeModificaElEstadoDelLapizHaciaAbajo(){
        Personaje personaje = new Personaje();

        new BajarLapiz(personaje);

        EstadoLapiz estadoLapiz = personaje.obtenerEstadoLapiz();

        assertEquals("Abajo", estadoLapiz.obtenerTipoEstado());
    }
}