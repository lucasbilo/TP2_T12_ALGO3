package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BajarLapizTest {

    @Test
    public void test01SeCreaUnBloqueBajarLapizYSeLoEjecuta(){
        Personaje personaje = new Personaje();

        Bloque bloque = new BajarLapiz();

        bloque.ejecutar(personaje);

        assertTrue(personaje.obtenerEstadoLapiz().lapizAbajo() );
    }

    @Test
    public void test02SeCreaUnBloqueBajarLapizYSeLoEjecutaInvertido(){
        Personaje personaje = new Personaje();

        Bloque bloque = new BajarLapiz();

        bloque.ejecutarInvertido(personaje);

        assertFalse(personaje.obtenerEstadoLapiz().lapizAbajo() );
    }
}
