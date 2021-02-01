package edu.fiuba.algo3.modelo;

public class Dibujo {

    private Algoritmo algoritmo = new Algoritmo();
    private Personaje personaje = new Personaje();
    private Tablero tablero = new Tablero();

    public void moverArriba(){
        Direccion direccionArriba = new Direccion(0,1);
        Mover moverArriba = new Mover(direccionArriba);
        this.algoritmo.agregarBloque(moverArriba);
    }

    public void moverAbajo(){
        Direccion direccionAbajo = new Direccion(0,-1);
        Mover moverAbajo = new Mover(direccionAbajo);
        this.algoritmo.agregarBloque(moverAbajo);
    }

    public void moverDerecha(){
        Direccion direccionDerecha = new Direccion(1,0);
        Mover moverDerecha = new Mover(direccionDerecha);
        this.algoritmo.agregarBloque(moverDerecha);
    }

    public void moverIzquierda(){
        Direccion direccionIzquierda = new Direccion(-1,0);
        Mover moverIzquierda = new Mover(direccionIzquierda);
        this.algoritmo.agregarBloque(moverIzquierda);
    }

    public void levantarLapiz(){
        LevantarLapiz levantarLapiz = new LevantarLapiz();
        this.algoritmo.agregarBloque(levantarLapiz);
    }

    public void bajarLapiz(){
        BajarLapiz bajarLapiz = new BajarLapiz();
        this.algoritmo.agregarBloque(bajarLapiz);
    }

    public void repetirDosVeces(){
        Repetir repetirDosVeces = new Repetir(2);
        this.algoritmo.agregarBloque(repetirDosVeces);
    }

    public void repetirTresVeces(){
        Repetir repetirTresVeces = new Repetir(3);
        this.algoritmo.agregarBloque(repetirTresVeces);
    }

    public void invertir(){
        Invertir invertir = new Invertir();
        this.algoritmo.agregarBloque(invertir);
    }

    public void algoritmoPersonalizado(){
        AlgoritmoPersonalizado algoritmoPersonalizado = new AlgoritmoPersonalizado();
        this.algoritmo.agregarBloque(algoritmoPersonalizado);
    }

    public void ejecutar(){
        this.algoritmo.ejecutar(this.personaje,this.tablero);
    }
}
