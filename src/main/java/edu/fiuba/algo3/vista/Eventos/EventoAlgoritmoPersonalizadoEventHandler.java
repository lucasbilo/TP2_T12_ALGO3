package edu.fiuba.algo3.vista.Eventos;

import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.modelo.AlgoritmoPersonalizado;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.Dibujo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventoAlgoritmoPersonalizadoEventHandler implements EventHandler<ActionEvent> {
    private final Dibujo dibujo;
    private final VBox contenedorDeBloques;
    private final VBox contenedorDeAlgoritmos;
    private final String ruta;
    private final Bloque bloque;

    public EventoAlgoritmoPersonalizadoEventHandler(VBox contenedorDeAlgoritmos, Dibujo dibujo, VBox contenedorDeBloques, Bloque bloque, String ruta){
        this.dibujo = dibujo;
        this.contenedorDeBloques = contenedorDeBloques;
        this.contenedorDeAlgoritmos = contenedorDeAlgoritmos;
        this.contenedorDeAlgoritmos.setAlignment(Pos.TOP_CENTER);
        this.bloque = bloque;
        this.ruta = ruta;
    }

    public Label guardarNombreAlgoritmo(){
        Stage ventanaTextField = new Stage();
        TextField inputField = new TextField();
        Label consigna = new Label("Escriba el nombre de su bloque personalizado");
        Button botonGuardar = new Button("Guardar");
        Label nombreAlgoritmo = new Label();
        VBox contenedorVertical = new VBox(consigna, inputField, botonGuardar);
        Scene escenaTextField = new Scene(contenedorVertical);
        ventanaTextField.setScene(escenaTextField);
        ventanaTextField.show();

        botonGuardar.setOnAction(e -> {
            String nombre = inputField.getText();
            nombreAlgoritmo.setText(nombre);
            ventanaTextField.close();
        });

        return nombreAlgoritmo;

    }

    @Override
    public void handle(ActionEvent actionEvent){
        Algoritmo nuevoAlgoritmo = new Algoritmo();
        bloque.agregarAlgoritmo(dibujo.algoritmo());
        //AlgoritmoPersonalizado algoritmoPersonalizado = new AlgoritmoPersonalizado(dibujo.algoritmo());
        dibujo.cambiarAlgoritmo(nuevoAlgoritmo);
        Label nombreAlgoritmo = guardarNombreAlgoritmo();
        ImageView imgBloqueGuardado = generarImagenesLabels(ruta);
        HBox contenedorHorizontal = new HBox(imgBloqueGuardado, nombreAlgoritmo);
        contenedorHorizontal.setSpacing(10);
        contenedorDeAlgoritmos.getChildren().add(contenedorHorizontal);
        EventoDragAndDrop drag = new EventoDragAndDrop(imgBloqueGuardado, contenedorDeBloques, dibujo, bloque);
        drag.empezarDragAndDrop();
    }

    public ImageView generarImagenesLabels(String ruta){
        try {
            var input = new java.io.FileInputStream(ruta);
            var image = new javafx.scene.image.Image(input);
            return new javafx.scene.image.ImageView(image);
        }
        catch(java.io.FileNotFoundException ex) {
            System.err.println("An IOException was caught!");
            ex.printStackTrace();
        }

        return null;
    }

}