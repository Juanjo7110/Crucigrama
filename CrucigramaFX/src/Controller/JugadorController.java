package Controller;

import Modelo.Jugador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class JugadorController {
	
	@FXML
    private ToolBar barra;

    @FXML
    private Pane ventana;

    @FXML
    private TextArea CodeField;

    @FXML
    private Text programName;

    @FXML
    private Button botonSalir;

    @FXML
    private Button botonIngresar;

    @FXML
    private TextArea nameField;

    @FXML
    private Text textInstructions;
    
    
    public Jugador jugador1;
    
    public void start(Stage stage) throws Exception {
    	   
		Parent root = FXMLLoader.load(getClass().getResource("Vista.vista.fxml"));
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
	
}
    
    public void crearJugador(ActionEvent event) {
    	
    	System.out.println("Jugador agregado");
    	
    	/*jugador1 = new Jugador(null,null);
    	
    	jugador1.setNickname(nameField.getText());
    	jugador1.setCodigo(CodeField.getText());
    	
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("vista.fxml"));
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
    

}
