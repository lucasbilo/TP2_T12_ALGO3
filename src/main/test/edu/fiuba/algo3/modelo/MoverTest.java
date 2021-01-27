package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class MoverTest {
    @Test
    public void test01SeCreaObjetoMover(){
        Mover bloqueMover = new Mover();

        assertArrayEquals(new int[]{0, 0}, bloqueMover.obtenerDireccion().obtenerCoordenadas());
    }

    @Test
    public void test02SeCreaObjetoMoverArriba(){
        //creo una direccion "arriba" con x=0 e y=1
        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMover = new Mover(direccionArriba);

        assertArrayEquals(new int[]{0, 1},bloqueMover.obtenerDireccion().obtenerCoordenadas());
    }

    @Test
    public void test03SeCreaObjetoMoverAbajo(){
        //creo una direccion "abajo" con x=0 e y=-1
        Direccion direccionAbajo = new Direccion(0,-1);
        Mover bloqueMover = new Mover(direccionAbajo);

        assertArrayEquals(new int[]{0, -1},bloqueMover.obtenerDireccion().obtenerCoordenadas());
    }

    @Test
    public void test04SeCreaObjetoMoverALaDerecha(){
        //creo una direccion "a la derecha" con x=1 e y=0
        Direccion direccionALaDerecha = new Direccion(1,0);
        Mover bloqueMover = new Mover(direccionALaDerecha);

        assertArrayEquals(new int[]{1, 0}, bloqueMover.obtenerDireccion().obtenerCoordenadas());
    }

    @Test
    public void test05SeCreaObjetoMoverALaIzquierda(){
        //creo una direccion "a la izquierda" con x=-1 e y=0
        Direccion direccionALaIzquierda = new Direccion(-1,0);
        Mover bloqueMover = new Mover(direccionALaIzquierda);

        assertArrayEquals(new int[]{-1, 0}, bloqueMover.obtenerDireccion().obtenerCoordenadas());
    }



}
