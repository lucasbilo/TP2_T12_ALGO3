package edu.fiuba.algo3.javaFX;

import edu.fiuba.algo3.modelo.AlgoritmoPersonalizado;
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
    private final VBox algoritmo;
    private final VBox contenedorDeAlgoritmos;

    public EventoAlgoritmoPersonalizadoEventHandler(VBox contenedorDeAlgoritmos, Dibujo dibujo, VBox algoritmo){
        this.dibujo = dibujo;
        this.algoritmo = algoritmo;
        this.contenedorDeAlgoritmos = contenedorDeAlgoritmos;
        this.contenedorDeAlgoritmos.setAlignment(Pos.TOP_CENTER);
    }

    public Label guardarNombreAlgoritmo(){
        Stage ventanaTextField = new Stage();
        TextField inputField = new TextField();
        Label consigna = new Label("Escriba el nombre de su algoritmo");
        Button botonGuardar = new Button("Guardar");
        Label nombreAlgoritmo = new Label();
        VBox contenedorVertical = new VBox(consigna, inputField, botonGuardar);
        Scene escenaTextField = new Scene(contenedorVertical);
        ventanaTextField.setScene(escenaTextField);
        ventanaTextField.show();

        botonGuardar.setOnAction(e -> {
            //Retrieving data
            String nombre = inputField.getText();
            nombreAlgoritmo.setText(nombre);
            ventanaTextField.close();
        });

        return nombreAlgoritmo;

    }

    @Override
    public void handle(ActionEvent actionEvent){
        AlgoritmoPersonalizado algoritmoPersonalizado = new AlgoritmoPersonalizado(dibujo.algoritmo());
        Label nombreAlgoritmo = guardarNombreAlgoritmo();
        ImageView imgAlgoritmoGuardado = generarImagenesLabels("src/main/java/edu/fiuba/algo3/javaFX/guardarAlgoritmo.png");
        HBox contenedorHorizontal = new HBox(imgAlgoritmoGuardado, nombreAlgoritmo);
        contenedorHorizontal.setSpacing(10);
        contenedorDeAlgoritmos.getChildren().add(contenedorHorizontal);
        algoritmo.getChildren().removeAll();
        EventoDragAndDrop drag = new EventoDragAndDrop(imgAlgoritmoGuardado,algoritmo,dibujo,algoritmoPersonalizado);
        drag.empezarDragAndDrop();
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