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

    @Test
    public void test02BajarLapizDevuelveEstadoLapizAbajoNoImportaQueEstadoLePases(){

        BajarLapiz bloqueBajarLapiz = new BajarLapiz();
        LapizArriba lapizArriba = new LapizArriba();
        EstadoLapiz estadoLapiz = bloqueBajarLapiz.ejecutarEstado(lapizArriba);

        assertEquals("Abajo", estadoLapiz.obtenerTipoEstado());
    }

    @Test
    public void test03BajarLapizDevuelvePosicionEn0(){

        BajarLapiz bloqueBajarLapiz = new BajarLapiz();
        int[] arrayCoordenadas = bloqueBajarLapiz.ejecutarPosicion();

        assertArrayEquals(new int[] {0,0}, arrayCoordenadas);
    }
}