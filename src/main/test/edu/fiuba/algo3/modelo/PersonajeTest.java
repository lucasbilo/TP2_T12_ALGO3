package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PersonajeTest {

    @Test
    public void test01SeCreaPersonajePorDefectoConLapizArriba(){
        Personaje personaje = new Personaje();
        EstadoLapiz estadoLapiz = personaje.obtenerEstadoLapiz();

        assertEquals("Arriba", estadoLapiz.obtenerTipoEstado());
    }

    @Test
    public void test02SeModificaElEstadoDelLapizDelPersonajeALapizAbajo(){
        Personaje personaje = new Personaje();
        personaje.modificarEstadoLapiz(new LapizAbajo());
        EstadoLapiz estadoLapiz = personaje.obtenerEstadoLapiz();

        assertEquals("Abajo", estadoLapiz.obtenerTipoEstado());
    }

    @Test
    public void test03SeAgregaUnBloqueMoverArribaAlAlgoritmoDelPersonaje(){
        Personaje personaje = new Personaje();
        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMoverArriba = new Mover(direccionArriba);
        personaje.agregarBloque(bloqueMoverArriba);

        personaje.ejecutarPrograma();

        assertArrayEquals(new int[] {0,1}, personaje.obtenerPosicion());
    }

    @Test
    public void test04SeAgregaUnBloqueMoverArribaYUnBloqueMoverALaDerechaAlAlgoritmoDelPersonaje(){
        Personaje personaje = new Personaje();
        Direccion direccionDerecha = new Direccion(1,0);
        Mover bloqueMoverALaDerecha = new Mover(direccionDerecha);
        personaje.agregarBloque(bloqueMoverALaDerecha);
        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMoverArriba = new Mover(direccionArriba);
        personaje.agregarBloque(bloqueMoverArriba);

        personaje.ejecutarPrograma();

        assertArrayEquals(new int[] {1,1}, personaje.obtenerPosicion());
    }

    @Test
    public void test04SeAgregaUnBloqueMoverArribaYUnBloqueBajarLapizAlAlgoritmoDelPersonaje(){
        Personaje personaje = new Personaje();
        BajarLapiz bloqueBajarLapiz = new BajarLapiz();
        personaje.agregarBloque(bloqueBajarLapiz);
        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMoverArriba = new Mover(direccionArriba);
        personaje.agregarBloque(bloqueMoverArriba);

        personaje.ejecutarPrograma();

        assertEquals("Abajo", personaje.obtenerEstadoLapiz().obtenerTipoEstado());
    }

}
