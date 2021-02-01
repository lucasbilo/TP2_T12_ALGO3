package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BajarLapizTest {

    @Test
    public void test01SeCreaUnBloqueBajarLapizYSeLoEjecuta(){
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();

        Bloque bloque = new BajarLapiz();

        bloque.ejecutar(personaje, tablero);

        assertTrue(personaje.obtenerEstadoLapiz().lapizAbajo() );
    }

    @Test
    public void test02SeCreaUnBloqueBajarLapizYSeLoEjecutaInvertido(){
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();

        Bloque bloque = new BajarLapiz();

        bloque.ejecutarInvertido(personaje, tablero);

        assertFalse(personaje.obtenerEstadoLapiz().lapizAbajo() );
    }
}
