package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class InvertirTest {

    @Test
    public void test01SeCreaUnBloqueInvertirConUnAlgoritmoVacio(){
        Invertir bloqueInvertir = new Invertir();
        Algoritmo algoritmoInvertido = bloqueInvertir.obtenerAlgoritmo();
        ArrayList<Bloque> arrayDeBloques = algoritmoInvertido.obtenerAlgoritmo();

        assertEquals(0,arrayDeBloques.size());
    }

    @Test
    public void test02SeCreaUnBloqueInvertirSeAgregaBloqueMoverDerechaYPersonajeVaALaIzquierda(){
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);
        Invertir bloqueInvertir = new Invertir();

        bloqueInvertir.agregarBloque(moverDerecha);
        bloqueInvertir.ejecutar(personaje, tablero);

        assertEquals(-1,personaje.obtenerPosicion().obtenerX());
    }

    @Test
    public void test03SeCreaUnBloqueInvertirConAlgoritmoHaciaLaDerechaYPersonajeVaALaIzquierda(){
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Algoritmo algoritmo = new Algoritmo();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);
        algoritmo.agregarBloque(moverDerecha);

        Invertir bloqueInvertir = new Invertir(algoritmo);
        bloqueInvertir.ejecutar(personaje, tablero);

        assertEquals(-1,personaje.obtenerPosicion().obtenerX());
    }

    @Test
    public void test04SeCreaUnBloqueInvertirSeAgregaBloqueBajarLapizYPersonajeSubeLapiz(){
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        BajarLapiz bloqueBajarLapiz = new BajarLapiz();
        Invertir bloqueInvertir = new Invertir();

        bloqueInvertir.agregarBloque(bloqueBajarLapiz);
        bloqueInvertir.ejecutar(personaje, tablero);

        assertFalse(personaje.obtenerEstadoLapiz().lapizAbajo());
    }

    @Test
    public void test05SeCreaUnBloqueInvertirConAlgoritmoBajarLapizYPersonajeSubeLapiz(){
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Algoritmo algoritmo = new Algoritmo();
        BajarLapiz bloqueBajarLapiz = new BajarLapiz();

        algoritmo.agregarBloque(bloqueBajarLapiz);
        Invertir bloqueInvertir = new Invertir(algoritmo);
        bloqueInvertir.ejecutar(personaje, tablero);

        assertFalse(personaje.obtenerEstadoLapiz().lapizAbajo());
    }

    @Test
    public void test06SeCreaUnBloqueInvertirSeAgregaBloqueMoverDerechaYSeLoEjecutaInvertido(){
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);
        Invertir bloqueInvertir = new Invertir();

        bloqueInvertir.agregarBloque(moverDerecha);
        bloqueInvertir.ejecutarInvertido(personaje, tablero);

        assertEquals(1,personaje.obtenerPosicion().obtenerX());
    }

    @Test
    public void test07SeCreaUnBloqueInvertirConAlgoritmoHaciaLaDerechaYSeLoEjecutaInvertido(){
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Algoritmo algoritmo = new Algoritmo();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);
        algoritmo.agregarBloque(moverDerecha);

        Invertir bloqueInvertir = new Invertir(algoritmo);
        bloqueInvertir.ejecutarInvertido(personaje, tablero);

        assertEquals(1,personaje.obtenerPosicion().obtenerX());
    }
}
