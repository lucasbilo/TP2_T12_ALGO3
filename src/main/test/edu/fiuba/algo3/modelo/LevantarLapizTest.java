package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LevantarLapizTest {

    @Test
    public void test01SeCreaUnBloqueLevantarLapizYSeLoEjecuta(){
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();

        Bloque bloque = new LevantarLapiz();

        bloque.ejecutar(personaje, tablero);

        assertTrue(personaje.obtenerEstadoLapiz().lapizArriba());
    }

    @Test
    public void test02SeCreaUnBloqueLevantarLapizYSeLoEjecutaInvertido(){
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();

        Bloque bloque = new LevantarLapiz();

        bloque.ejecutarInvertido(personaje, tablero);

        assertFalse(personaje.obtenerEstadoLapiz().lapizArriba());
    }
}

