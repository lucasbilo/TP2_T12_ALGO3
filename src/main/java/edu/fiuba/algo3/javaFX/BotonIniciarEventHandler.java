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
        Button botonArriba = new Button();
        botonArriba.setText("Mover Arriba");
        EventoMoverArribaEventHandler eventoMoverArribaEventHandler = new EventoMoverArribaEventHandler(dibujo);
        botonArriba.setOnAction(eventoMoverArribaEventHandler);

        Button botonAbajo = new Button();
        botonAbajo.setText("Mover Abajo");
        EventoMoverAbajoEventHandler eventoMoverAbajoEventHandler = new EventoMoverAbajoEventHandler(dibujo);
        botonAbajo.setOnAction(eventoMoverAbajoEventHandler);

        Button botonIzquierda = new Button();
        botonIzquierda.setText("Mover Izquierda");
        EventoMoverIzquierdaEventHandler eventoMoverIzquierdaEventHandler = new EventoMoverIzquierdaEventHandler(dibujo);
        botonIzquierda.setOnAction(eventoMoverIzquierdaEventHandler);

        Button botonDerecha = new Button();
        botonDerecha.setText("Mover Derecha");
        EventoMoverDerechaEventHandler eventoMoverDerechaEventHandler = new EventoMoverDerechaEventHandler(dibujo);
        botonDerecha.setOnAction(eventoMoverDerechaEventHandler);

        Button botonBajarLapiz = new Button();
        botonBajarLapiz.setText("Bajar Lapiz");
        EventoBajarLapizEventHandler eventoBajarLapizEventHandler = new EventoBajarLapizEventHandler(dibujo);
        botonBajarLapiz.setOnAction(eventoBajarLapizEventHandler);

        Button botonLevantarLapiz = new Button();
        botonLevantarLapiz.setText("Subir Lapiz");
        EventoLevantarLapizEventHandler eventoLevantarLapizEventHandler = new EventoLevantarLapizEventHandler(dibujo);
        botonLevantarLapiz.setOnAction(eventoLevantarLapizEventHandler);

        Button botonAlgoritmoPersonalizado = new Button();
        botonAlgoritmoPersonalizado.setText("Algoritmo Personalizado");
        EventoAlgoritmoPersonalizadoEventHandler eventoAlgoritmoPersonalizadoEventHandler = new EventoAlgoritmoPersonalizadoEventHandler(dibujo);
        botonAlgoritmoPersonalizado.setOnAction(eventoAlgoritmoPersonalizadoEventHandler);

        TextArea panelDibujo = new TextArea();
        TextArea algoritmo  = new TextArea();

        VBox contenedorVertical = new VBox (botonArriba, botonAbajo, botonIzquierda, botonDerecha, botonBajarLapiz, botonLevantarLapiz, botonAlgoritmoPersonalizado);
        contenedorVertical.setSpacing(50);
        contenedorVertical.setAlignment(Pos.CENTER);
        HBox contenedorHorizontal = new HBox(panelDibujo, contenedorVertical, algoritmo);
        contenedorHorizontal.setAlignment(Pos.CENTER);

        Stage programa = new Stage();

        Scene scene = new Scene(contenedorHorizontal,1200,1000);

        programa.setScene(scene);

        programa.show();
    }

}
