package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.*;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class SectorIconos {

    private SectorAlgoritmo sectorAlgoritmo;
    private Dibujo dibujo;
    private VBox contenedorDeIconos;

    public SectorIconos(SectorAlgoritmo sectorAlgoritmo, Dibujo dibujo) {

        this.sectorAlgoritmo = sectorAlgoritmo;
        this.dibujo = dibujo;
        this.contenedorDeIconos = new VBox();
        this.contenedorDeIconos.setSpacing(10);
        this.contenedorDeIconos.setAlignment(Pos.CENTER);
    }

    public VBox obtenerContenedorDeIconos(){
        return this.contenedorDeIconos;
    }

    public void crearIconoMoverArriba() {

        ImageView imgMoverArriba = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/moverArriba.png");
        Direccion direccionArriba = new Direccion(0, 1);
        Mover moverArriba = new Mover(direccionArriba);
        EventoDragAndDrop drag = new EventoDragAndDrop(imgMoverArriba, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, moverArriba);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgMoverArriba);
    }

    public void crearIconoMoverAbajo() {
        ImageView imgMoverAbajo = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/moverAbajo.png");
        Direccion direccionAbajo = new Direccion(0, -1);
        Mover moverAbajo = new Mover(direccionAbajo);
        EventoDragAndDrop drag = new EventoDragAndDrop(imgMoverAbajo, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, moverAbajo);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgMoverAbajo);
    }

    public void crearIconoMoverDerecha() {
        ImageView imgMoverDerecha = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/moverDerecha.png" );
        Direccion direccionDerecha = new Direccion(1, 0);
        Mover moverDerecha = new Mover(direccionDerecha);
        EventoDragAndDrop drag = new EventoDragAndDrop(imgMoverDerecha, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, moverDerecha);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgMoverDerecha);
    }

    public void crearIconoMoverIzquierda() {
        ImageView imgMoverIzquierda = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/moverIzquierda.png");
        Direccion direccionIzquierda = new Direccion(-1, 0);
        Mover moverIzquierda = new Mover(direccionIzquierda);
        EventoDragAndDrop drag = new EventoDragAndDrop(imgMoverIzquierda, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, moverIzquierda);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgMoverIzquierda);
    }

    public void crearIconoLevantarLapiz() {

        ImageView imgLevantarLapiz = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/levantarLapiz.png");
        LevantarLapiz levantarLapiz = new LevantarLapiz();
        EventoDragAndDrop drag = new EventoDragAndDrop(imgLevantarLapiz, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, levantarLapiz);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgLevantarLapiz);
    }

    public void crearIconoBajarLapiz() {

        ImageView imgBajarLapiz = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/bajarLapiz.png");
        BajarLapiz bajarLapiz = new BajarLapiz();
        EventoDragAndDrop drag = new EventoDragAndDrop(imgBajarLapiz, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, bajarLapiz);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgBajarLapiz);
    }

    public void crearIconoRepetir() {

        ImageView imgRepetir = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/Repetir.png" );
        Repetir repetir = new Repetir();
        EventoDragAndDrop drag = new EventoDragAndDrop(imgRepetir, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, repetir);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgRepetir);
    }

    public void crearIconoInvertir() {
        ImageView imgInvertir = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/Invertir.png");
        Invertir invertir = new Invertir();
        EventoDragAndDrop drag = new EventoDragAndDrop(imgInvertir, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, invertir);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgInvertir);
    }

    public void crearIconoAlgoritmoPersonalizado() {
        ImageView imgAlgoritmoPersonalizado = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/algoritmoPersonalizado.png" );
        AlgoritmoPersonalizado algoritmoPersonalizado = new AlgoritmoPersonalizado();
        EventoDragAndDrop drag = new EventoDragAndDrop(imgAlgoritmoPersonalizado, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, algoritmoPersonalizado);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgAlgoritmoPersonalizado);
    }

    public ImageView generarImagenesLabels(String ruta){
        try {
            var input = new java.io.FileInputStream(ruta);
            var image = new javafx.scene.image.Image(input);
            ImageView imageView = new javafx.scene.image.ImageView(image);
            return imageView;
        }
        catch(java.io.FileNotFoundException ex) {
            System.err.println("An IOException was caught!");
            ex.printStackTrace();
        }

        return null;
    }
}
