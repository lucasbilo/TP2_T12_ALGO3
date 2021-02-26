package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DibujoTest {

    @Test
    public void test01SeAgregaBloqueMoverArribaAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Direccion direccionArriba = new Direccion(0,1);
        Mover moverArriba = new Mover(direccionArriba);
        dibujo.agregarBloque(moverArriba);
        for (int i = 0; i < dibujo.algoritmo().obtenerAlgoritmo().size() ; i++){
            dibujo.ejecutar(i);
        }
        Posicion posicionActual = dibujo.personaje().obtenerPosicion();
        Posicion posicionEsperada = new Posicion (0,1);

        assertTrue(posicionActual.igualA(posicionEsperada));
    }

    @Test
    public void test02SeAgregaBloqueMoverAbajoAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Direccion direccionAbajo = new Direccion(0,-1);
        Mover moverAbajo = new Mover(direccionAbajo);
        dibujo.agregarBloque(moverAbajo);
        for (int i = 0; i < dibujo.algoritmo().obtenerAlgoritmo().size() ; i++){
            dibujo.ejecutar(i);
        }

        Posicion posicionActual = dibujo.personaje().obtenerPosicion();
        Posicion posicionEsperada = new Posicion(0,-1);

        assertTrue(posicionActual.igualA(posicionEsperada));
    }

    @Test
    public void test03SeAgregaBloqueMoverDerechaAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Direccion direccionDerecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(direccionDerecha);
        dibujo.agregarBloque(moverDerecha);
        for (int i = 0; i < dibujo.algoritmo().obtenerAlgoritmo().size() ; i++){
            dibujo.ejecutar(i);
        }

        Posicion posicionActual = dibujo.personaje().obtenerPosicion();
        Posicion posicionEsperada = new Posicion (1,0);

        assertTrue(posicionActual.igualA(posicionEsperada));
    }

    @Test
    public void test04SeAgregaBloqueMoverIzquierdaAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Direccion direccionIzquierda = new Direccion(-1,0);
        Mover moverIzquierda = new Mover(direccionIzquierda);
        dibujo.agregarBloque(moverIzquierda);
        for (int i = 0; i < dibujo.algoritmo().obtenerAlgoritmo().size() ; i++){
            dibujo.ejecutar(i);
        }

        Posicion posicionActual = dibujo.personaje().obtenerPosicion();
        Posicion posicionEsperada = new Posicion(-1,0);

        assertTrue(posicionActual.igualA(posicionEsperada));
    }

    @Test
    public void test05SeAgregaBloqueLevantarLapizAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        dibujo.personaje().modificarEstadoLapiz(new LapizArriba());
        for (int i = 0; i < dibujo.algoritmo().obtenerAlgoritmo().size() ; i++){
            dibujo.ejecutar(i);
        }

        EstadoLapiz estado = dibujo.personaje().obtenerEstadoLapiz();

        assertTrue(estado.lapizArriba());
    }

    @Test
    public void test06SeAgregaBloqueBajarLapizAlAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        dibujo.personaje().modificarEstadoLapiz(new LapizAbajo());
        for (int i = 0; i < dibujo.algoritmo().obtenerAlgoritmo().size() ; i++){
            dibujo.ejecutar(i);
        }

        EstadoLapiz estado = dibujo.personaje().obtenerEstadoLapiz();

        assertTrue(estado.lapizAbajo());
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
        for (int i = 0; i < dibujo.algoritmo().obtenerAlgoritmo().size() ; i++){
            dibujo.ejecutar(i);
        }

        Posicion posicionActual = dibujo.personaje().obtenerPosicion();
        Posicion posicionEsperada = new Posicion(-1,0);

        assertTrue(posicionActual.igualA(posicionEsperada));
    }

    @Test
    public void test08SeAgregaBloqueAlgoritmoPersonalizadoConUnAlgoritmoYSeEjecuta(){
        Dibujo dibujo = new Dibujo();
        Algoritmo algoritmo = new Algoritmo();
        Mover moverArriba = new Mover(new Direccion(0,1));
        algoritmo.agregarBloque(moverArriba);
        AlgoritmoPersonalizado algoritmoPersonalizado = new AlgoritmoPersonalizado(algoritmo);
        for (int i = 0; i < dibujo.algoritmo().obtenerAlgoritmo().size() ; i++){
            dibujo.ejecutar(i);
        }
        algoritmoPersonalizado.ejecutar(dibujo.personaje(),dibujo.tablero());

        Posicion posicionActual = dibujo.personaje().obtenerPosicion();
        Posicion posicionEsperada = new Posicion (0,1);

        assertTrue(posicionActual.igualA(posicionEsperada));
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
        for (int i = 0; i < dibujo.algoritmo().obtenerAlgoritmo().size() ; i++){
            dibujo.ejecutar(i);
        }

        assertFalse(dibujo.tablero().existePosicion(new Posicion(0,0)));
        assertTrue(dibujo.tablero().existePosicion(new Posicion(0,1)));
        assertFalse(dibujo.tablero().existePosicion(new Posicion(0,2)));

    }

    @Test
    public void test10SeAgreganDosBloquesYLuegoSeBorraUno(){
        Dibujo dibujo = new Dibujo();
        ArrayList<Bloque> arrayDeBloques = dibujo.algoritmo().obtenerAlgoritmo();
        BajarLapiz lapizAbajo = new BajarLapiz();
        LevantarLapiz lapizArriba = new LevantarLapiz();
        dibujo.agregarBloque(lapizAbajo);
        dibujo.agregarBloque(lapizArriba);

        assertEquals(2,arrayDeBloques.size());
        dibujo.eliminarBloque(lapizAbajo);
        assertEquals(1,arrayDeBloques.size());
    }


}
