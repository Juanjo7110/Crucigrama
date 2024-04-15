package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Conexion.DBConexion;
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
import javafx.stage.Modality;
import javafx.stage.Stage;
import Conexion.*;


public class JugadorController {
	
    @FXML
    private TextArea CodeField;

    @FXML
    private ToolBar barra;

    @FXML
    private Button botonIngresar;

    @FXML
    private Button botonSalir;

    @FXML
    private TextArea nameField;

    @FXML
    private Text programName;

    @FXML
    private Text textInstructions;

    @FXML
    private Pane ventana;
    
    
    public Jugador jugador1; //Jugador creado
    
    
    //VentanaSleccionNiveles
    
    
    DBConexion conexion = new DBConexion();
    Connection conection = conexion.conectar();

    
    public void crearJugador(ActionEvent event) {
    	
    	
    	jugador1 = new Jugador(null,null);
    	
    	jugador1.setNickname(nameField.getText());
    	jugador1.setCodigo(CodeField.getText());
    	
    	System.out.println(jugador1.getNickname() +  " " + jugador1.getCodigo());
    	
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/vistaSeleccionNiveles.fxml"));
			Parent root = loader.load();
			
			SeleccionNivelesController controlador = loader.getController();
			
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage.show();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	try {                      
			String SQL = "INSERT INTO usuarios values (?, ?); ";

			PreparedStatement pst= conection.prepareStatement(SQL);

			pst.setString(1,jugador1.getCodigo());
			pst.setString(2, jugador1.getNickname());
			pst.execute();

			System.out.println("se registro los datos");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexi�n:" + e.getMessage());
			System.out.println("error de registro");
		}

	
    	
    }
    
    
}

















