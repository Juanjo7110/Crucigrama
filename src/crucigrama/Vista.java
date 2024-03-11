package crucigrama;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Vista {

    private Stage stage;
    private TextField nombre;
    private TextField codigo;

    public Vista(Stage stage) {
        this.stage = stage;
        initializeUI();
    }

    private void initializeUI() {
        // Crear el título
        Label titulo = new Label("CRUCIGRAMA");
        titulo.setFont(Font.font("Arial", FontWeight.BOLD, 24));

        // Crear el texto pequeño
        Label texto = new Label("Ingrese su nombre y código para jugar");

        // Crear campo de texto para ingresar nombre
        nombre = new TextField();
        nombre.setMaxWidth(200); // Limitar el ancho del campo de texto
        nombre.setAlignment(Pos.CENTER);
        nombre.setPromptText("Nombre");
        nombre.setStyle("-fx-prompt-text-fill: gray;");
        
        // Crear campo de texto para ingresar código
        codigo = new TextField();
        codigo.setMaxWidth(200); // Limitar el ancho del campo de texto
        codigo.setAlignment(Pos.CENTER); // Centrar el texto en el campo
        codigo.setPromptText("Código");
        codigo.setStyle("-fx-prompt-text-fill: gray;");

        // Crear contenedor vertical y agregar todos los nodos
        VBox contenedor = new VBox(10); // 10 es el espacio entre nodos
        contenedor.setPadding(new Insets(20)); // Agregar relleno alrededor del contenedor
        contenedor.getChildren().addAll(titulo, texto, nombre, codigo);
        contenedor.setAlignment(Pos.CENTER);// Centrar los elementos horizontalmente en el contenedor

        StackPane root = new StackPane();
        root.getChildren().add(contenedor);
        root.setAlignment(Pos.CENTER); // Centrar el VBox vertical y horizontalmente en el StackPane
        
        // Crear la escena y configurarla en el escenario
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Crucigrama App");
    }

    public void show() {
        stage.show();
    }

    public TextField getNombre() {
        return nombre;
    }

    public TextField getCodigo() {
        return codigo;
    }
}