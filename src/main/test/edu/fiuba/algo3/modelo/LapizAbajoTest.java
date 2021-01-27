package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LapizAbajoTest {

    @Test
    public void test01SeCreaLapizAbajoYSeLlamaALapizAbajo(){
        EstadoLapiz lapiz = new LapizAbajo();

        assertEquals(true, lapiz.lapizAbajo());
    }

    @Test
    public void test02SeCreaLapizAbajoYSeLlamaALapizArriba(){
        EstadoLapiz lapiz = new LapizAbajo();

        assertEquals(false, lapiz.lapizArriba());
    }
}
