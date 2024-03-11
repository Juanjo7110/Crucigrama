package crucigrama;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista(primaryStage);
        Controlador controlador = new Controlador(modelo, vista);
        controlador.inicializar();
    }

    public static void main(String[] args) {
        launch(args);
    }
}