package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepetirTest {

    @Test
    public void test01SeCreaUnBloqueRepetirConAlgoritmoVacio(){
        Repetir bloqueRepetir = new Repetir();
        Algoritmo algoritmoRepetido = bloqueRepetir.obtenerAlgoritmo();
        ArrayList<Bloque> arrayDeBloques = algoritmoRepetido.obtenerAlgoritmo();

        assertEquals(0,arrayDeBloques.size());
    }

    @Test
    public void test02SeCreaUnBloqueRepetirConBloqueMoverYSeLoEjecuta(){
        Personaje personaje = new Personaje();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);
        Repetir bloqueRepetir = new Repetir();

        bloqueRepetir.agregarBloque(moverDerecha);
        bloqueRepetir.ejecutar(personaje);
        //Por default, el bloque Repetir se repite 2 veces
        assertEquals(2,personaje.obtenerPosicion().obtenerX());
    }

    @Test
    public void test03SeCreaUnBloqueRepetirTresVecesConBloqueMoverYSeLoEjecuta(){
        Personaje personaje = new Personaje();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);
        Repetir bloqueRepetir = new Repetir(3);

        bloqueRepetir.agregarBloque(moverDerecha);
        bloqueRepetir.ejecutar(personaje);

        assertEquals(3,personaje.obtenerPosicion().obtenerX());
    }

    @Test
    public void test04SeCreaUnBloqueRepetirConBloqueMoverYSeLoEjecutaInvertido(){
        Personaje personaje = new Personaje();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);
        Repetir bloqueRepetir = new Repetir();

        bloqueRepetir.agregarBloque(moverDerecha);
        bloqueRepetir.ejecutarInvertido(personaje);
        //Por default, el bloque Repetir se repite 2 veces
        assertEquals(-2,personaje.obtenerPosicion().obtenerX());
    }

    @Test
    public void test05SeCreaUnBloqueRepetirTresVecesConBloqueMoverYSeLoEjecutaInvertido(){
        Personaje personaje = new Personaje();
        Direccion derecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(derecha);
        Repetir bloqueRepetir = new Repetir(3);

        bloqueRepetir.agregarBloque(moverDerecha);
        bloqueRepetir.ejecutarInvertido(personaje);

        assertEquals(-3,personaje.obtenerPosicion().obtenerX());
    }

}
