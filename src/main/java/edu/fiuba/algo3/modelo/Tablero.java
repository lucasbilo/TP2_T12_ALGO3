package edu.fiuba.algo3.modelo;
import java.util.ArrayList;
import java.util.Optional;

public class Tablero {

    private ArrayList<Posicion> posiciones = new ArrayList<Posicion>();

    public Tablero(){}

    public void escribir(Posicion posicion){
        Optional<Posicion> nuevaPosicion = this.obtenerPosicion(posicion);
        if(nuevaPosicion.isEmpty()){
            this.posiciones.add(posicion);
        }
    }

    public Optional<Posicion> obtenerPosicion(Posicion pos){
        Optional<Posicion> buscada = this.posiciones.stream()
                .filter(posicion -> posicion.igualA(pos))
                .findFirst();
        return buscada; //devuelve NULL si no se encuentra
    }

    public boolean existePosicion(Posicion pos){
        return this.posiciones.stream()
                .anyMatch(posicion -> posicion.igualA(pos));
    }

    public void actualizar(Posicion posicion){
        Posicion posicionNueva = new Posicion(posicion.obtenerX(),posicion.obtenerY());
        this.escribir(posicionNueva);
    }

}
