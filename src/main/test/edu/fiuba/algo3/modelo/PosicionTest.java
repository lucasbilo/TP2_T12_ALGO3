package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PosicionTest {

    @Test
    void test01SeCreaObjetoPosicionVacia() {
        Posicion posicion = new Posicion();

        assertTrue(posicion.coordenadasIgualesA(0, 0));
    }

    @Test
    void test02SeCreaObjetoPosicionConCoordenadas() {
        Posicion posicion = new Posicion(2, 5);

        assertTrue(posicion.coordenadasIgualesA(2, 5));
    }

    @Test
    void test03SeCreaObjetoPosicionConCoordenadasYSeLoMueveHaciaArriba() {
        Posicion posicion = new Posicion(0, 3);
        Direccion direccionArriba = new Direccion(0,1);
        Posicion nuevaPosicion = posicion.mover(direccionArriba);

        assertTrue(nuevaPosicion.coordenadasIgualesA(0, 4));
    }


}
