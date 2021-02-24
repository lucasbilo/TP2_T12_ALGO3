package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.Dibujo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonIniciarEventHandler implements EventHandler<ActionEvent> {
    private Dibujo dibujo;

    public BotonIniciarEventHandler(Dibujo dibujo){
        this.dibujo = dibujo;
    }


    public void handle(ActionEvent actionEvent){
        //sector de algoritmo
        SectorAlgoritmo sectorAlgoritmo = new SectorAlgoritmo();

        //sector de algoritmos personalizados
        VBox algoritmosPersonalizados = new VBox();
        algoritmosPersonalizados.setPrefHeight(200);
        algoritmosPersonalizados.setAlignment(Pos.CENTER);


        //sector de iconos que se arrastran al sector Algoritmo
        SectorIconos sectorIconos = new SectorIconos(sectorAlgoritmo, dibujo);
        sectorIconos.crearIconoMoverArriba();
        sectorIconos.crearIconoMoverAbajo();
        sectorIconos.crearIconoMoverDerecha();
        sectorIconos.crearIconoMoverIzquierda();
        sectorIconos.crearIconoLevantarLapiz();
        sectorIconos.crearIconoBajarLapiz();
        sectorIconos.crearIconoRepetir();
        sectorIconos.crearIconoInvertir();
        sectorIconos.crearIconoAlgoritmoPersonalizado(algoritmosPersonalizados);


        //sector de dibujo
        final Canvas canvas = new Canvas(500,500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        gc.fillRect(0,0,500,500);

        //todalapagina
        HBox contenedorHorizontal = new HBox(canvas, sectorIconos.obtenerContenedorDeIconos(), sectorAlgoritmo.obtenerContenedorDeAlgoritmo(),algoritmosPersonalizados);//, deletePanel);
        contenedorHorizontal.setSpacing(20);
        contenedorHorizontal.setAlignment(Pos.CENTER);


        Stage programa = new Stage();

        Scene scene = new Scene(contenedorHorizontal,600,600);

        programa.setScene(scene);

        programa.show();
    }

}
