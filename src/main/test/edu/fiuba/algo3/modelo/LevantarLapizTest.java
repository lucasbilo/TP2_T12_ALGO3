package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LevantarLapizTest {

    @Test
    public void test01SeModificaElEstadoDelLapizHaciaArriba(){
        Personaje personaje = new Personaje();

        new LevantarLapiz(personaje);

        EstadoLapiz estadoLapiz = personaje.obtenerEstadoLapiz();

        assertEquals("Arriba", estadoLapiz.obtenerTipoEstado());
    }

    @Test
    public void test02LevantarLapizDevuelveEstadoLapizArribaNoImportaQueEstadoLePases(){

        LevantarLapiz bloqueLevantarLapiz = new LevantarLapiz();
        LapizAbajo lapizArriba = new LapizAbajo();
        EstadoLapiz estadoLapiz = bloqueLevantarLapiz.ejecutarEstado(lapizArriba);

        assertEquals("Arriba", estadoLapiz.obtenerTipoEstado());
    }

    @Test
    public void test03BajarLapizDevuelvePosicionEn0(){

        LevantarLapiz bloqueLevantarLapiz = new LevantarLapiz();
        int[] arrayCoordenadas = bloqueLevantarLapiz.ejecutarPosicion();

        assertArrayEquals(new int[] {0,0}, arrayCoordenadas);
    }
}

