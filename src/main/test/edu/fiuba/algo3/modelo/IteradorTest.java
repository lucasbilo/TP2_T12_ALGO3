package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class IteradorTest {

    @Test
    public void test01UnArrayVacioNoTieneSiguiente(){
        Iterador iterador = new Iterador(new ArrayList<>());

        assertFalse(iterador.tieneSiguiente());
    }

    @Test
    public void test02UnArrayConBloquesTieneSiguiente(){
        Bloque lapiz = new LevantarLapiz();
        Bloque lapiz2 = new BajarLapiz();
        ArrayList<Bloque> array = new ArrayList<Bloque>();
        array.add(lapiz);
        array.add(lapiz2);
        Iterador iterador = new Iterador(array);

        assertTrue(iterador.tieneSiguiente());

    }

    @Test
    public void test03ElSiguienteDatoEstaEnLaPosicionUno(){
        Bloque lapiz = new LevantarLapiz();
        Bloque lapiz2 = new BajarLapiz();
        ArrayList<Bloque> array = new ArrayList<Bloque>();
        array.add(lapiz);
        array.add(lapiz2);
        Iterador iterador = new Iterador(array);
        iterador.siguiente();

        assertEquals(1,iterador.actual());
    }
}
