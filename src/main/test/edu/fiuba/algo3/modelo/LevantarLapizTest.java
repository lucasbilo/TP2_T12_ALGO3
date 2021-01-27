package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LevantarLapizTest {

    @Test
    public void test01SeModificaElEstadoDelLapizHaciaArriba() {
        Personaje personaje = new Personaje();

        Bloque bloque = new LevantarLapiz();

        bloque.ejecutar(personaje);

        assertEquals(true, personaje.obtenerEstadoLapiz().lapizArriba());
    }
}

