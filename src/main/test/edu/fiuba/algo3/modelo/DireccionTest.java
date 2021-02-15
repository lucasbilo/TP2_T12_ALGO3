package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DireccionTest {

    @Test
    public void test01SeCreaObjetoDireccion() {
        Direccion direccion = new Direccion();

        assertTrue(direccion.coordenadasIgualesA(0,0));
    }

    @Test
    public void test02SeCreaObjetoDireccionArriba() {
        Direccion direccionArriba = new Direccion(0,1);

        assertTrue(direccionArriba.coordenadasIgualesA(0,1));
    }

    @Test
    public void test03SeCreaObjetoDireccionAbajo() {
        Direccion direccionAbajo = new Direccion(0,-1);

        assertTrue(direccionAbajo.coordenadasIgualesA(0,-1));
    }

    @Test
    public void test04SeCreaObjetoDireccionDerecha() {
        Direccion direccionDerecha = new Direccion(1,0);

        assertTrue(direccionDerecha.coordenadasIgualesA(1,0));
    }

    @Test
    public void test05SeCreaObjetoDireccionIzquierda() {
        Direccion direccionIzquierda = new Direccion(-1,0);

        assertTrue(direccionIzquierda.coordenadasIgualesA(-1,0));
    }

    @Test
    public void test06SeCreaObjetoDireccionArribaYSeLoObtieneInvertido() {
        Direccion direccion = new Direccion(0,1);
        Direccion direccionInvertida = direccion.invertir();

        assertTrue(direccionInvertida.coordenadasIgualesA(0,-1));
    }

    @Test
    public void test07SeCreaObjetoDireccionAbajoYSeLoObtieneInvertido() {
        Direccion direccion = new Direccion(0,-1);
        Direccion direccionInvertida = direccion.invertir();

        assertTrue(direccionInvertida.coordenadasIgualesA(0,1));
    }
}