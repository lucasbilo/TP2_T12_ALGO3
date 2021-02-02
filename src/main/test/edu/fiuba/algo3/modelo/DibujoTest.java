package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DibujoTest {

    @Test
    public void test01SeAgregaBloqueMoverArribaAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        dibujo.moverArriba();
        dibujo.ejecutar();

        assertEquals(1, dibujo.personaje().obtenerPosicion().obtenerY());
    }

    @Test
    public void test02SeAgregaBloqueMoverAbajoAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        dibujo.moverAbajo();
        dibujo.ejecutar();

        assertEquals(-1, dibujo.personaje().obtenerPosicion().obtenerY());
    }

    @Test
    public void test03SeAgregaBloqueMoverDerechaAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        dibujo.moverDerecha();
        dibujo.ejecutar();

        assertEquals(1, dibujo.personaje().obtenerPosicion().obtenerX());
    }

    @Test
    public void test04SeAgregaBloqueMoverIzquierdaAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        dibujo.moverIzquierda();
        dibujo.ejecutar();

        assertEquals(-1, dibujo.personaje().obtenerPosicion().obtenerX());
    }

    @Test
    public void test05SeAgregaBloqueLevantarLapizAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        dibujo.levantarLapiz();
        dibujo.ejecutar();

        assertTrue(dibujo.personaje().obtenerEstadoLapiz().lapizArriba());
    }

    @Test
    public void test06SeAgregaBloqueBajarLapizAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        dibujo.bajarLapiz();
        dibujo.ejecutar();

        assertTrue(dibujo.personaje().obtenerEstadoLapiz().lapizAbajo());
    }

    @Test
    public void test07SeAgregaBloqueRepetirDosVecesConUnAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Algoritmo algoritmo = new Algoritmo();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);
        algoritmo.agregarBloque(moverDerecha);

        dibujo.repetirDosVeces(algoritmo);
        dibujo.ejecutar();

        assertEquals(2, dibujo.personaje().obtenerPosicion().obtenerX());
    }

    @Test
    public void test08SeAgregaBloqueRepetirTresVecesConUnAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Algoritmo algoritmo = new Algoritmo();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);
        algoritmo.agregarBloque(moverDerecha);

        dibujo.repetirTresVeces(algoritmo);
        dibujo.ejecutar();

        assertEquals(3, dibujo.personaje().obtenerPosicion().obtenerX());
    }

    @Test
    public void test09SeAgregaBloqueInvertirConBloqueMoverDerechaAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Algoritmo algoritmo = new Algoritmo();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);
        algoritmo.agregarBloque(moverDerecha);

        dibujo.invertir(algoritmo);
        dibujo.ejecutar();

        assertEquals(-1, dibujo.personaje().obtenerPosicion().obtenerX());
    }

    @Test
    public void test10SeAgregaBloqueAlgoritmoPersonalizadoConUnAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Algoritmo algoritmo = new Algoritmo();
        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMoverArriba = new Mover(direccionArriba);
        algoritmo.agregarBloque(bloqueMoverArriba);

        dibujo.algoritmoPersonalizado(algoritmo);
        dibujo.ejecutar();

        assertEquals(1,dibujo.personaje().obtenerPosicion().obtenerY());
    }

    @Test
    public void test11SeAgregaBloqueBajarLapizYMoverArribaTableroDebeEstarPintado(){
        // Arranca en 0,0 y termina en 0,2, deberia estar pintado las posiciones 0,0 y 0,1.
        Dibujo dibujo = new Dibujo();
        dibujo.bajarLapiz();
        dibujo.moverArriba();
        dibujo.moverArriba();
        dibujo.ejecutar();

        assertTrue(dibujo.tablero().obtenerPosicion(0, 0).estaPintado());

    }


}
