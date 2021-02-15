package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DibujoTest {

    @Test
    public void test01SeAgregaBloqueMoverArribaAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Direccion direccionArriba = new Direccion(0,1);
        Mover moverArriba = new Mover(direccionArriba);
        dibujo.agregarBloque(moverArriba);
        dibujo.ejecutar();

        assertEquals(1, dibujo.personaje().obtenerPosicion().obtenerY());
    }

    @Test
    public void test02SeAgregaBloqueMoverAbajoAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Direccion direccionAbajo = new Direccion(0,-1);
        Mover moverAbajo = new Mover(direccionAbajo);
        dibujo.agregarBloque(moverAbajo);
        dibujo.ejecutar();

        assertEquals(-1, dibujo.personaje().obtenerPosicion().obtenerY());
    }

    @Test
    public void test03SeAgregaBloqueMoverDerechaAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Direccion direccionDerecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(direccionDerecha);
        dibujo.agregarBloque(moverDerecha);
        dibujo.ejecutar();

        assertEquals(1, dibujo.personaje().obtenerPosicion().obtenerX());
    }

    @Test
    public void test04SeAgregaBloqueMoverIzquierdaAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Direccion direccionIzquierda = new Direccion(-1,0);
        Mover moverIzquierda = new Mover(direccionIzquierda);
        dibujo.agregarBloque(moverIzquierda);
        dibujo.ejecutar();

        assertEquals(-1, dibujo.personaje().obtenerPosicion().obtenerX());
    }

    @Test
    public void test05SeAgregaBloqueLevantarLapizAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        dibujo.personaje().modificarEstadoLapiz(new LapizArriba());
        dibujo.ejecutar();

        assertTrue(dibujo.personaje().obtenerEstadoLapiz().lapizArriba());
    }

    @Test
    public void test06SeAgregaBloqueBajarLapizAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        dibujo.personaje().modificarEstadoLapiz(new LapizAbajo());
        dibujo.ejecutar();

        assertTrue(dibujo.personaje().obtenerEstadoLapiz().lapizAbajo());
    }

    @Test
    public void test07SeAgregaBloqueInvertirConBloqueMoverDerechaAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Algoritmo algoritmo = new Algoritmo();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);
        algoritmo.agregarBloque(moverDerecha);
        Invertir invertir = new Invertir();
        invertir.agregarBloque(moverDerecha);
        dibujo.agregarBloque(invertir);
        dibujo.ejecutar();

        assertEquals(-1, dibujo.personaje().obtenerPosicion().obtenerX());
    }

    @Test
    public void test08SeAgregaBloqueAlgoritmoPersonalizadoConUnAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Algoritmo algoritmo = new Algoritmo();
        Mover moverArriba = new Mover(new Direccion(0,1));
        algoritmo.agregarBloque(moverArriba);
        AlgoritmoPersonalizado algoritmoPersonalizado = new AlgoritmoPersonalizado(algoritmo);
        dibujo.ejecutar();
        algoritmoPersonalizado.ejecutar(dibujo.personaje(),dibujo.tablero());

        assertEquals(1,dibujo.personaje().obtenerPosicion().obtenerY());
    }

    @Test
    public void test09SeAgregaBloqueBajarLapizYMoverArribaTableroDebeEstarPintado(){
        // Arranca en 0,0 y termina en 0,2, deberia estar pintado las posiciones 0,0 y 0,1.
        Dibujo dibujo = new Dibujo();
        BajarLapiz lapizAbajo = new BajarLapiz();
        LevantarLapiz lapizArriba = new LevantarLapiz();
        Mover moverArriba = new Mover(new Direccion(0,1));
        dibujo.agregarBloque(moverArriba);
        dibujo.agregarBloque(lapizAbajo);
        dibujo.agregarBloque(moverArriba);
        dibujo.agregarBloque(lapizArriba);
        dibujo.agregarBloque(moverArriba);
        dibujo.ejecutar();

        assertFalse(dibujo.tablero().existePosicion(new Posicion(0,0)));
        assertTrue(dibujo.tablero().existePosicion(new Posicion(0,1)));
        assertFalse(dibujo.tablero().existePosicion(new Posicion(0,2)));

    }


}
