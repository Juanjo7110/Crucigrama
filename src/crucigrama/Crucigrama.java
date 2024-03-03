
package crucigrama;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Crucigrama extends Application{
    
    public void start(Stage primaryStage) {
            // Creamos un contenedor StackPane como raíz de la escena
            StackPane root = new StackPane();

            // Creamos la escena y la configuramos con el contenedor StackPane
            Scene scene = new Scene(root, 400, 300);

            // Configuramos el título de la ventana
            primaryStage.setTitle("Crucigrama");

            // Establecemos la escena en la ventana primaria
            primaryStage.setScene(scene);

            // Mostramos la ventana
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
