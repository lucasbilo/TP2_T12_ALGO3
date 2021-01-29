package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DireccionTest {

    @Test
    void test01SeCreaObjetoDireccion() {
        Direccion direccion = new Direccion();
        //Se crea una direccion con coordenadas x=0 e y=0
        int[] arrayCoordenadas = direccion.obtenerCoordenadas();

        assertArrayEquals(new int[] {0,0}, arrayCoordenadas);
    }

    @Test
    void test02SeCreaObjetoDireccionArriba() {
        Direccion direccionArriba = new Direccion(0,1);
        //Se crea una direccion con coordenadas x=0 e y=1
        int[] arrayCoordenadas = direccionArriba.obtenerCoordenadas();

        assertArrayEquals(new int[] {0,1}, arrayCoordenadas);
    }

    @Test
    void test03SeCreaObjetoDireccionAbajo() {
        Direccion direccionAbajo = new Direccion(0,-1);
        //Se crea una direccion con coordenadas x=0 e y=-1
        int[] arrayCoordenadas = direccionAbajo.obtenerCoordenadas();

        assertArrayEquals(new int[] {0,-1}, arrayCoordenadas);
    }

    @Test
    void test04SeCreaObjetoDireccionDerecha() {
        Direccion direccionDerecha = new Direccion(1,0);
        //Se crea una direccion con coordenadas x=1 e y=0
        int[] arrayCoordenadas = direccionDerecha.obtenerCoordenadas();

        assertArrayEquals(new int[] {1,0}, arrayCoordenadas);
    }

    @Test
    void test05SeCreaObjetoDireccionIzquierda() {
        Direccion direccion = new Direccion(-1,0);
        //Se crea una direccion con coordenadas x=-1 e y=0
        int[] arrayCoordenadas = direccion.obtenerCoordenadas();

        assertArrayEquals(new int[] {-1,0}, arrayCoordenadas);
    }

    @Test
    void test06SeCreaObjetoDireccionArribaYSeLoObtieneInvertido() {
        Direccion direccion = new Direccion(0,1);
        //Se crea una direccion con coordenadas x=0 e y=1
        Direccion direccionInvertida = direccion.invertir();
        int[] arrayCoordenadas = direccionInvertida.obtenerCoordenadas();

        assertArrayEquals(new int[] {0,-1}, arrayCoordenadas);
    }

    @Test
    void test07SeCreaObjetoDireccionAbajoYSeLoObtieneInvertido() {
        Direccion direccion = new Direccion(0,-1);
        //Se crea una direccion con coordenadas x=0 e y=-1
        Direccion direccionInvertida = direccion.invertir();
        int[] arrayCoordenadas = direccionInvertida.obtenerCoordenadas();

        assertArrayEquals(new int[] {0,1}, arrayCoordenadas);
    }
}