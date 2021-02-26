package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AlgoritmoTest {

    @Test
    public void test01SeCreaUnAlgoritmoVacio(){
        Algoritmo algoritmo = new Algoritmo();
        ArrayList<Bloque> arrayDeBloques = algoritmo.obtenerAlgoritmo();

        assertEquals(0,arrayDeBloques.size());
    }

    @Test
    public void test02SeCreaUnAlgoritmoYSeAgregaUnBloque(){
        Algoritmo algoritmo = new Algoritmo();
        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMoverArriba = new Mover(direccionArriba);
        algoritmo.agregarBloque(bloqueMoverArriba);
        ArrayList<Bloque> arrayDeBloques = algoritmo.obtenerAlgoritmo();

        assertEquals(1,arrayDeBloques.size());
    }

    @Test
    public void test03SeCreaUnAlgoritmoYSeAgreganTresBloques(){
        Algoritmo algoritmo = new Algoritmo();
        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMoverArriba = new Mover(direccionArriba);
        algoritmo.agregarBloque(bloqueMoverArriba);
        Direccion direccionAbajo = new Direccion(0,-1);
        Mover bloqueMoverAbajo = new Mover(direccionAbajo);
        algoritmo.agregarBloque(bloqueMoverAbajo);
        BajarLapiz bloqueBajarLapiz = new BajarLapiz();
        algoritmo.agregarBloque(bloqueBajarLapiz);

        ArrayList<Bloque> arrayDeBloques = algoritmo.obtenerAlgoritmo();

        assertEquals(3,arrayDeBloques.size());
    }

    @Test
    public void test04SeCreaUnAlgoritmoConUnBloqueMoverArribaYSeLoEjecuta(){
        Algoritmo algoritmo = new Algoritmo();
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMoverArriba = new Mover(direccionArriba);

        algoritmo.agregarBloque(bloqueMoverArriba);
        for (int i = 0; i < algoritmo.obtenerAlgoritmo().size(); i++){
            algoritmo.ejecutar(personaje, tablero, i);
        }
        Posicion posicionActual = personaje.obtenerPosicion();
        Posicion posicionEsperada = new Posicion(0,1);

        assertTrue(posicionActual.igualA(posicionEsperada));

    }

    @Test
    public void test05SeCreaUnAlgoritmoConUnBloqueBajarLapizYSeLoEjecuta(){
        Algoritmo algoritmo = new Algoritmo();
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Bloque bloque = new BajarLapiz();

        algoritmo.agregarBloque(bloque);
        for (int i = 0; i < algoritmo.obtenerAlgoritmo().size(); i++){
            algoritmo.ejecutar(personaje, tablero, i);
        }

        EstadoLapiz estado = personaje.obtenerEstadoLapiz();

        assertTrue(estado.lapizAbajo());
    }

    @Test
    public void test06SeCreaUnAlgoritmoConUnBloqueMoverYSeLoEjecutaInvertido(){
        Algoritmo algoritmo = new Algoritmo();
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMoverArriba = new Mover(direccionArriba);

        algoritmo.agregarBloque(bloqueMoverArriba);
        for (int i = 0; i < algoritmo.obtenerAlgoritmo().size(); i++){
            algoritmo.ejecutarInvertido(personaje, tablero, i);
        }

        Posicion posicionActual = personaje.obtenerPosicion();
        Posicion posicionEsperada = new Posicion(0,-1);

        assertTrue(posicionActual.igualA(posicionEsperada));

    }

    @Test
    public void test07SeCreaUnAlgoritmoConUnBloqueBajarLapizYSeLoEjecutaInvertido(){
        Algoritmo algoritmo = new Algoritmo();
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Bloque bloque = new BajarLapiz();

        algoritmo.agregarBloque(bloque);
        for (int i = 0; i < algoritmo.obtenerAlgoritmo().size(); i++){
            algoritmo.ejecutarInvertido(personaje, tablero, i);
        }

        EstadoLapiz estado = personaje.obtenerEstadoLapiz();

        assertFalse(estado.lapizAbajo());

    }

    @Test
    public void test08SeCreaUnAlgoritmoConUnBloqueYLuegoSeBorraDichoBloque(){
        Algoritmo algoritmo = new Algoritmo();
        Bloque bloque = new BajarLapiz();
        algoritmo.agregarBloque(bloque);
        ArrayList<Bloque> arrayDeBloques = algoritmo.obtenerAlgoritmo();

        assertEquals(1,arrayDeBloques.size());
        algoritmo.eliminarBloque(bloque);
        assertEquals(0,arrayDeBloques.size());
    }

}
