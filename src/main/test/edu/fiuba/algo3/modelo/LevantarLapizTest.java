package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LevantarLapizTest {

    @Test
    public void test01SeCreaUnBloqueLevantarLapizYSeLoEjecuta(){
        Personaje personaje = new Personaje();

        Bloque bloque = new LevantarLapiz();

        bloque.ejecutar(personaje);

        assertTrue(personaje.obtenerEstadoLapiz().lapizArriba());
    }

    @Test
    public void test02SeCreaUnBloqueLevantarLapizYSeLoEjecutaInvertido(){
        Personaje personaje = new Personaje();

        Bloque bloque = new LevantarLapiz();

        bloque.ejecutarInvertido(personaje);

        assertFalse(personaje.obtenerEstadoLapiz().lapizArriba());
    }
}

