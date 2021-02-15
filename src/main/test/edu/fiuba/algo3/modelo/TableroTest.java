package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TableroTest {

    @Test
    public void test01AgregoUnaPosicionAlTableroYLaBusco(){
        Tablero tablero = new Tablero();
        Posicion posicion = new Posicion(); // x=0, y=0
        tablero.escribir(posicion);
        Posicion posicionEsperada = new Posicion(0, 0);

        assertTrue(posicionEsperada.igualA(posicion));
    }

    @Test
    public void test02AgregoDosPosicionAlTableroYBuscoUna(){
        Tablero tablero = new Tablero();
        Posicion posicionUno = new Posicion(); // x=0, y=0
        Posicion posicionDos = new Posicion(1,0);

        tablero.escribir(posicionUno);
        tablero.escribir(posicionDos);

        Posicion posicionEsperada = new Posicion(1, 0);

        assertTrue(posicionEsperada.igualA(posicionDos));
    }

    @Test
    public void test03SeActualizaElTableroConUnaNuevaPosicion(){
        Tablero tablero = new Tablero();
        Personaje personaje = new Personaje();
        personaje.modificarPosicion(new Direccion(1,5), tablero);
        tablero.actualizar(personaje.obtenerPosicion());

        assertTrue(tablero.existePosicion(new Posicion(1,5)));
    }
}
