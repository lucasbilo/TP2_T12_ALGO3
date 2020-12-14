package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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

}
