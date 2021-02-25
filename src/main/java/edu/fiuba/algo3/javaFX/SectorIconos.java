package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.*;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.canvas.*;

public class SectorIconos {

    private SectorAlgoritmo sectorAlgoritmo;
    private Dibujo dibujo;
    private VBox contenedorDeIconos;
    private Button botonEjecutar;
    private Button botonBorrar;

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

    public Button obtenerEjecutar(){
        return this.botonEjecutar;
    }

    public Button obtenerBorrar() { return botonBorrar; }

    public void crearIconoEjecutar(Canvas canva) {
        ImageView imgEjecutar = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/Images/ejecutar.png" );
        Button botonEjecutar = new Button();
        botonEjecutar.setGraphic(imgEjecutar);
        EventoEjecutarEventHandler eventoEjecutarEventHandler = new EventoEjecutarEventHandler(dibujo, canva);
        botonEjecutar.setOnAction(eventoEjecutarEventHandler);
        this.botonEjecutar = botonEjecutar;
    }

    public void crearIconoBorrar(Canvas canva){
        ImageView imgBorrar = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/Images/delete.png" );
        Button botonBorrar = new Button();
        botonBorrar.setGraphic(imgBorrar);
        EventoBorrarEventHandler eventoBorrarEventHandler = new EventoBorrarEventHandler(dibujo,canva);
        botonBorrar.setOnAction(eventoBorrarEventHandler);
        this.botonBorrar = botonBorrar;
    }

    public void crearIconoMoverArriba() {

        ImageView imgMoverArriba = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/Images/moverArriba.png");
        Direccion direccionArriba = new Direccion(0, -25);
        Mover moverArriba = new Mover(direccionArriba);
        EventoDragAndDrop drag = new EventoDragAndDrop(imgMoverArriba, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, moverArriba);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgMoverArriba);
    }

    public void crearIconoMoverAbajo() {
        ImageView imgMoverAbajo = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/Images/moverAbajo.png");
        Direccion direccionAbajo = new Direccion(0, 25);
        Mover moverAbajo = new Mover(direccionAbajo);
        EventoDragAndDrop drag = new EventoDragAndDrop(imgMoverAbajo, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, moverAbajo);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgMoverAbajo);
    }

    public void crearIconoMoverDerecha() {
        ImageView imgMoverDerecha = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/Images/moverDerecha.png" );
        Direccion direccionDerecha = new Direccion(25, 0);
        Mover moverDerecha = new Mover(direccionDerecha);
        EventoDragAndDrop drag = new EventoDragAndDrop(imgMoverDerecha, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, moverDerecha);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgMoverDerecha);
    }

    public void crearIconoMoverIzquierda() {
        ImageView imgMoverIzquierda = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/Images/moverIzquierda.png");
        Direccion direccionIzquierda = new Direccion(-25, 0);
        Mover moverIzquierda = new Mover(direccionIzquierda);
        EventoDragAndDrop drag = new EventoDragAndDrop(imgMoverIzquierda, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, moverIzquierda);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgMoverIzquierda);
    }

    public void crearIconoLevantarLapiz() {

        ImageView imgLevantarLapiz = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/Images/levantarLapiz.png");
        LevantarLapiz levantarLapiz = new LevantarLapiz();
        EventoDragAndDrop drag = new EventoDragAndDrop(imgLevantarLapiz, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, levantarLapiz);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgLevantarLapiz);
    }

    public void crearIconoInvertir() {
        ImageView imgInvertir = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/Images/Invertir.png");
        Invertir invertir = new Invertir();
        EventoDragAndDrop drag = new EventoDragAndDrop(imgInvertir, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, invertir);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgInvertir);
    }

    public void crearIconoBajarLapiz() {

        ImageView imgBajarLapiz = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/Images/bajarLapiz.png");
        BajarLapiz bajarLapiz = new BajarLapiz();
        EventoDragAndDrop drag = new EventoDragAndDrop(imgBajarLapiz, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, bajarLapiz);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgBajarLapiz);
    }

    public void crearIconoRepetir() {

        ImageView imgRepetir = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/Images/Repetir.png" );
        Repetir repetir = new Repetir();
        EventoDragAndDrop drag = new EventoDragAndDrop(imgRepetir, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, repetir);//, deletePanel);
        drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(imgRepetir);
    }

    public void crearIconoAlgoritmoPersonalizado(VBox contenedorDeAlgoritmos) {
        ImageView imgAlgoritmoPersonalizado = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/Images/algoritmoPersonalizado.png" );
        Button botonAlgoritmoPersonalizado = new Button();
        botonAlgoritmoPersonalizado.setGraphic(imgAlgoritmoPersonalizado);
        //AlgoritmoPersonalizado algoritmoPersonalizado = new AlgoritmoPersonalizado();
        EventoAlgoritmoPersonalizadoEventHandler eventoAlgoritmoPersonalizadoEventHandler = new EventoAlgoritmoPersonalizadoEventHandler(contenedorDeAlgoritmos, dibujo, sectorAlgoritmo.obtenerContenedorDeBloques());
        //EventoDragAndDrop drag = new EventoDragAndDrop(imgAlgoritmoPersonalizado, sectorAlgoritmo.obtenerContenedorDeBloques(), dibujo, algoritmoPersonalizado);//, deletePanel);
        //drag.empezarDragAndDrop();
        contenedorDeIconos.getChildren().add(botonAlgoritmoPersonalizado);
        botonAlgoritmoPersonalizado.setOnAction(eventoAlgoritmoPersonalizadoEventHandler);
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
