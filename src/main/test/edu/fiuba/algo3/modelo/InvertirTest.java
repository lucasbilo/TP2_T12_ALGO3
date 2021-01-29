package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvertirTest {

    @Test
    public void test01SeCreaUnBloqueInvertirConUnAlgoritmoVacio(){
        Invertir bloqueInvertir = new Invertir();
        Algoritmo algoritmoInvertido = bloqueInvertir.obtenerAlgoritmo();
        ArrayList<Bloque> arrayDeBloques = algoritmoInvertido.obtenerAlgoritmo();

        assertEquals(0,arrayDeBloques.size());
    }

    @Test
    public void test02SeCreaUnBloqueInvertirConAlgoritmoHaciaLaDerechaYPersonajeVaALaIzquierda(){
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);
        Invertir bloqueInvertir = new Invertir();
        bloqueInvertir.agregarBloque(moverDerecha);
        algoritmo.agregarBloque(bloqueInvertir);
        algoritmo.ejecutar(personaje);

        assertEquals(-1,personaje.obtenerPosicion().obtenerX());
    }

    @Test
    public void test03SeCreaUnBloqueInvertirConAlgoritmoBajarLapizYPersonajeSubeElLapiz(){
        Personaje personaje = new Personaje();
        Algoritmo algoritmoUno = new Algoritmo();
        Algoritmo algoritmoDos = new Algoritmo(); //en este caso agrego todo un algoritmo

        BajarLapiz bloqueBajarLapiz = new BajarLapiz();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);

        algoritmoDos.agregarBloque(bloqueBajarLapiz);
        algoritmoDos.agregarBloque(moverDerecha);

        Invertir bloqueInvertir = new Invertir(algoritmoDos);
        algoritmoUno.agregarBloque(bloqueInvertir);
        algoritmoUno.ejecutar(personaje);

        assertEquals(false, personaje.obtenerEstadoLapiz().lapizAbajo() );
    }
}
