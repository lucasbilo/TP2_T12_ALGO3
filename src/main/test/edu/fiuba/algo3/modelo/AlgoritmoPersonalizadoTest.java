package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AlgoritmoPersonalizadoTest {

    @Test
    public void test01SeCreaUnBloqueAlgoritmoPersonalizadoConAlgoritmoVacio(){
        AlgoritmoPersonalizado algoritmoPersonalizado = new AlgoritmoPersonalizado();
        Algoritmo algoritmo = algoritmoPersonalizado.obtenerAlgoritmo();
        ArrayList<Bloque> arrayDeBloques = algoritmo.obtenerAlgoritmo();

        assertEquals(0,arrayDeBloques.size());
    }

    @Test
    public void test02SeCreaUnBloqueAlgoritmoPersonalizadoConAlgoritmoYaCreadoYSeLoEjecuta(){
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo();
        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMoverArriba = new Mover(direccionArriba);
        algoritmo.agregarBloque(bloqueMoverArriba);

        AlgoritmoPersonalizado algoritmoPersonalizado = new AlgoritmoPersonalizado(algoritmo);
        algoritmoPersonalizado.ejecutar(personaje);

        assertEquals(1,personaje.obtenerPosicion().obtenerY());
    }

    @Test
    public void test03SeCreaUnBloqueAlgoritmoPersonalizadoConAlgoritmoYaCreadoYSeLoEjecutaInvertido(){
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo();
        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMoverArriba = new Mover(direccionArriba);
        algoritmo.agregarBloque(bloqueMoverArriba);

        AlgoritmoPersonalizado algoritmoPersonalizado = new AlgoritmoPersonalizado(algoritmo);
        algoritmoPersonalizado.ejecutarInvertido(personaje);

        assertEquals(-1,personaje.obtenerPosicion().obtenerY());
    }

    @Test
    public void test04SeCreaUnBloqueAlgoritmoPersonalizadoConAlgoritmoYSeAgregaAOtroAlgoritmo(){
        Algoritmo algoritmoUno = new Algoritmo();
        Algoritmo algoritmoDos = new Algoritmo();

        Direccion direccionArriba = new Direccion(0,1);
        Mover bloqueMoverArriba = new Mover(direccionArriba);
        algoritmoUno.agregarBloque(bloqueMoverArriba);

        Direccion direccionAbajo = new Direccion(0,-1);
        Mover bloqueMoverAbajo = new Mover(direccionAbajo);
        algoritmoDos.agregarBloque(bloqueMoverAbajo);
        BajarLapiz bloqueBajarLapiz = new BajarLapiz();
        algoritmoDos.agregarBloque(bloqueBajarLapiz);

        AlgoritmoPersonalizado algoritmoPersonalizado = new AlgoritmoPersonalizado(algoritmoDos);
        algoritmoUno.agregarBloque(algoritmoPersonalizado);

        ArrayList<Bloque> arrayDeBloques = algoritmoUno.obtenerAlgoritmo();

        assertEquals(2,arrayDeBloques.size()); //Deberia tener 2 bloques, uno para el MoverArriba y otro para el AlgoritmoPersonalizado
    }
}
