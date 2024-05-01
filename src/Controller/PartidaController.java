package Controller;

import javax.swing.JOptionPane;

import Modelo.Crucigrama;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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
import javafx.util.Duration;
import javafx.scene.layout.AnchorPane;

public class PartidaController {
	
	@FXML
    private ToolBar barra1;

    @FXML
    private Button botonDificil;

    @FXML
    private Button botonFacil;

    @FXML
    private Button botonMedio;

    @FXML
    private Button botonSalir1;

    @FXML
    private Text programName1;

    @FXML
    private Text textInstructions1;

    @FXML
    private AnchorPane ventana1;
    
    
    @FXML
    private Button BotonSalir;


	    @FXML
	    void iniciarTablero4x4(ActionEvent event) {
	    	
	    	try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/vistaCuadricula4x4.fxml"));
				Parent root = loader.load();
				
				CrucigramaController controlador = loader.getController();
				
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.setScene(scene);
				stage.show();
				
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	  	
	    	
			}

	    

	    @FXML
	    void iniciarTablero5x5(ActionEvent event) {
	    	
	    	try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/vistaCuadricula5x5.fxml"));
				Parent root = loader.load();
				
				CrucigramaController controlador = loader.getController();
				
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.setScene(scene);
				stage.show();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	  	
	    	
			}

	    

	    @FXML
	    void iniciarTablero6x6(ActionEvent event) {
	    	
	    	try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/vistaCuadricula6x6.fxml"));
				Parent root = loader.load();
				
				CrucigramaController controlador = loader.getController();
				
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.setScene(scene);
				stage.show();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	  	
	    	
			}
	    
	    public boolean validarTableto (Crucigrama tablero, ActionEvent event) {
	    	
	    	return true;
	    	
	    }
	    
	    public String pista (Crucigrama tablero, ActionEvent event) {
	    	
	    	return "";
	    }
	    
	   
	    public void Salir() {
	    	JOptionPane.showMessageDialog(null, "¡¡Gracias por jugar!!");
	    	Stage stage = (Stage) BotonSalir.getScene().getWindow();
	        stage.close();
	    }
	    

	    }


