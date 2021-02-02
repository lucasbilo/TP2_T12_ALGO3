package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TableroTest {

    @Test
    public void test01CreoUnTableroSinPosiciones(){
        Tablero tablero = new Tablero();
        assertNull(tablero.obtenerPosicion(0,0));
    }

    @Test
    public void test02AgregoUnaPosicionAlTableroYLaBusco(){
        Tablero tablero = new Tablero();
        Posicion posicion = new Posicion(); // x=0, y=0
        tablero.escribir(posicion);

        assertEquals(posicion, tablero.obtenerPosicion(0, 0));
    }

    @Test
    public void test03AgregoDosPosicionAlTableroYBuscoUna(){
        Tablero tablero = new Tablero();
        Posicion posicionUno = new Posicion(); // x=0, y=0
        Posicion posicionDos = new Posicion(1,0);

        tablero.escribir(posicionUno);
        tablero.escribir(posicionDos);

        assertEquals(posicionDos, tablero.obtenerPosicion(1, 0));
    }

    @Test
    public void test04SeActualizaElTableroConUnaNuevaPosicion(){
        Tablero tablero = new Tablero();
        Posicion posicion = new Posicion(1, 5);
        tablero.actualizar(posicion);

        assertTrue(tablero.existePosicion(1, 5));
    }
}
