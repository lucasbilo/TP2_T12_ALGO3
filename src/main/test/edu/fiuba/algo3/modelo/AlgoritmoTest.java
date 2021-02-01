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
    public void test04SeCreaUnAlgoritmoConUnBloqueMoverYSeLoEjecuta(){
        Algoritmo algoritmo = new Algoritmo();
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMoverArriba = new Mover(direccionArriba);

        algoritmo.agregarBloque(bloqueMoverArriba);
        algoritmo.ejecutar(personaje, tablero);

        assertEquals(1, personaje.obtenerPosicion().obtenerY());

    }

    @Test
    public void test05SeCreaUnAlgoritmoConUnBloqueBajarLapizYSeLoEjecuta(){
        Algoritmo algoritmo = new Algoritmo();
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Bloque bloque = new BajarLapiz();

        algoritmo.agregarBloque(bloque);
        algoritmo.ejecutar(personaje, tablero);

        assertTrue(personaje.obtenerEstadoLapiz().lapizAbajo());

    }

    @Test
    public void test06SeCreaUnAlgoritmoConUnBloqueMoverYSeLoEjecutaInvertido(){
        Algoritmo algoritmo = new Algoritmo();
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMoverArriba = new Mover(direccionArriba);

        algoritmo.agregarBloque(bloqueMoverArriba);
        algoritmo.ejecutarInvertido(personaje, tablero);

        assertEquals(-1, personaje.obtenerPosicion().obtenerY());

    }

    @Test
    public void test07SeCreaUnAlgoritmoConUnBloqueBajarLapizYSeLoEjecutaInvertido(){
        Algoritmo algoritmo = new Algoritmo();
        Personaje personaje = new Personaje();
        Tablero tablero = new Tablero();
        Bloque bloque = new BajarLapiz();

        algoritmo.agregarBloque(bloque);
        algoritmo.ejecutarInvertido(personaje, tablero);

        assertFalse(personaje.obtenerEstadoLapiz().lapizAbajo());

    }

}
