package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.Dibujo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonIniciarEventHandler implements EventHandler<ActionEvent> {
    private Dibujo dibujo;

    public BotonIniciarEventHandler(Dibujo dibujo){
        this.dibujo = dibujo;
    }

    public void handle(ActionEvent actionEvent){
        VBox algoritmo = new VBox();
        algoritmo.setAlignment(Pos.CENTER);
        algoritmo.setSpacing(40);

        Button botonArriba = new Button("Mover Arriba");
        EventoMoverArribaEventHandler eventoMoverArribaEventHandler = new EventoMoverArribaEventHandler(dibujo, algoritmo);
        botonArriba.setOnAction(eventoMoverArribaEventHandler);

        Button botonAbajo = new Button("Mover Abajo");
        EventoMoverAbajoEventHandler eventoMoverAbajoEventHandler = new EventoMoverAbajoEventHandler(dibujo, algoritmo);
        botonAbajo.setOnAction(eventoMoverAbajoEventHandler);

        Button botonIzquierda = new Button("Mover Izquierda");
        EventoMoverIzquierdaEventHandler eventoMoverIzquierdaEventHandler = new EventoMoverIzquierdaEventHandler(dibujo, algoritmo);
        botonIzquierda.setOnAction(eventoMoverIzquierdaEventHandler);

        Button botonDerecha = new Button("Mover Derecha");
        EventoMoverDerechaEventHandler eventoMoverDerechaEventHandler = new EventoMoverDerechaEventHandler(dibujo, algoritmo);
        botonDerecha.setOnAction(eventoMoverDerechaEventHandler);

        Button botonBajarLapiz = new Button("Bajar Lapiz");
        EventoBajarLapizEventHandler eventoBajarLapizEventHandler = new EventoBajarLapizEventHandler(dibujo, algoritmo);
        botonBajarLapiz.setOnAction(eventoBajarLapizEventHandler);

        Button botonLevantarLapiz = new Button("Levantar Lapiz");
        EventoLevantarLapizEventHandler eventoLevantarLapizEventHandler = new EventoLevantarLapizEventHandler(dibujo, algoritmo);
        botonLevantarLapiz.setOnAction(eventoLevantarLapizEventHandler);

        Button botonAlgoritmoPersonalizado = new Button("Algoritmo Personalizado");
        EventoAlgoritmoPersonalizadoEventHandler eventoAlgoritmoPersonalizadoEventHandler = new EventoAlgoritmoPersonalizadoEventHandler(dibujo, algoritmo);
        botonAlgoritmoPersonalizado.setOnAction(eventoAlgoritmoPersonalizadoEventHandler);

        TextArea panelDibujo = new TextArea();

        VBox contenedorVertical = new VBox (botonArriba, botonAbajo, botonIzquierda, botonDerecha, botonBajarLapiz, botonLevantarLapiz, botonAlgoritmoPersonalizado);
        contenedorVertical.setSpacing(40);
        contenedorVertical.setAlignment(Pos.CENTER);
        HBox contenedorHorizontal = new HBox(panelDibujo, contenedorVertical, algoritmo);
        contenedorHorizontal.setAlignment(Pos.CENTER);

        Stage programa = new Stage();

        Scene scene = new Scene(contenedorHorizontal,600,600);

        programa.setScene(scene);

        programa.show();
    }

}
