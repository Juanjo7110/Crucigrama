package Controller;

import java.io.IOException;
import javafx.animation.Animation;

import javax.swing.JOptionPane;

import Modelo.Jugador;
import Modelo.Partida;
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
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.AnchorPane;

public class CrucigramaController {


    @FXML
    private ToolBar barraCuatro;

    @FXML
    private Button botonPista;

    @FXML
    private Button botonSalirCuatro;

    @FXML
    private Button botonStop;

    @FXML
    private TextArea cuatro00;

    @FXML
    private TextArea cuatro01;

    @FXML
    private TextArea cuatro02;

    @FXML
    private TextArea cuatro03;

    @FXML
    private TextArea cuatro10;

    @FXML
    private TextArea cuatro11;

    @FXML
    private TextArea cuatro12;

    @FXML
    private TextArea cuatro13;

    @FXML
    private TextArea cuatro20;

    @FXML
    private TextArea cuatro21;

    @FXML
    private TextArea cuatro22;

    @FXML
    private TextArea cuatro23;

    @FXML
    private TextArea cuatro30;

    @FXML
    private TextArea cuatro31;

    @FXML
    private TextArea cuatro32;

    @FXML
    private TextArea cuatro33;

    @FXML
    private Text cuatroHorizontales;

    @FXML
    private Text cuatroVerticales;

    @FXML
    private Text nivelFacil;

    @FXML
    private Pane ventanaCuatro;
    
    @FXML
    private Button botonFacil;
    
    //Ventana 5x5
    
    @FXML
    private ToolBar barraCinco;

    @FXML
    private Button botonSalirCinco;

    @FXML
    private TextArea cinco00;

    @FXML
    private TextArea cinco01;

    @FXML
    private TextArea cinco02;

    @FXML
    private TextArea cinco03;

    @FXML
    private TextArea cinco04;

    @FXML
    private TextArea cinco10;

    @FXML
    private TextArea cinco11;

    @FXML
    private TextArea cinco12;

    @FXML
    private TextArea cinco13;

    @FXML
    private TextArea cinco14;

    @FXML
    private TextArea cinco20;

    @FXML
    private TextArea cinco21;

    @FXML
    private TextArea cinco22;

    @FXML
    private TextArea cinco23;

    @FXML
    private TextArea cinco24;

    @FXML
    private TextArea cinco30;

    @FXML
    private TextArea cinco31;

    @FXML
    private TextArea cinco32;

    @FXML
    private TextArea cinco33;

    @FXML
    private TextArea cinco34;

    @FXML
    private TextArea cinco40;

    @FXML
    private TextArea cinco41;

    @FXML
    private TextArea cinco42;

    @FXML
    private TextArea cinco43;

    @FXML
    private TextArea cinco44;

    @FXML
    private Text cincoHoriontales;

    @FXML
    private Text cincoVerticales;

    @FXML
    private Button cincobotonPista;

    @FXML
    private Button cincobotonStop;

    @FXML
    private Text nivelMedio;

    @FXML
    private Pane ventanaCinco;
    
    //Ventana 6x6
    
    @FXML
    private ToolBar barraSeis;

    @FXML
    private Button botonSalirSeis;

    @FXML
    private Text nivelDificil;

    @FXML
    private TextArea seis00;

    @FXML
    private TextArea seis01;

    @FXML
    private TextArea seis02;

    @FXML
    private TextArea seis03;

    @FXML
    private TextArea seis04;

    @FXML
    private TextArea seis05;

    @FXML
    private TextArea seis10;

    @FXML
    private TextArea seis11;

    @FXML
    private TextArea seis12;

    @FXML
    private TextArea seis13;

    @FXML
    private TextArea seis14;

    @FXML
    private TextArea seis15;

    @FXML
    private TextArea seis20;

    @FXML
    private TextArea seis21;

    @FXML
    private TextArea seis22;

    @FXML
    private TextArea seis23;

    @FXML
    private TextArea seis24;

    @FXML
    private TextArea seis25;

    @FXML
    private TextArea seis30;

    @FXML
    private TextArea seis31;

    @FXML
    private TextArea seis32;

    @FXML
    private TextArea seis33;

    @FXML
    private TextArea seis34;

    @FXML
    private TextArea seis35;

    @FXML
    private TextArea seis40;

    @FXML
    private TextArea seis41;

    @FXML
    private TextArea seis42;

    @FXML
    private TextArea seis43;

    @FXML
    private TextArea seis44;

    @FXML
    private TextArea seis45;

    @FXML
    private TextArea seis50;

    @FXML
    private TextArea seis51;

    @FXML
    private TextArea seis52;

    @FXML
    private TextArea seis53;

    @FXML
    private TextArea seis54;

    @FXML
    private TextArea seis55;

    @FXML
    private Text seisHoriontales;

    @FXML
    private Text seisVerticales;

    @FXML
    private Button seisbotonPista;

    @FXML
    private Button seisbotonStop;

    @FXML
    private Pane ventanaSeis;
    
    @FXML
    private Text Tiempo;
    
    public Partida partida1;

    
    public void IniciarPartida(ActionEvent event) {
    	partida1 = new Partida();
    	partida1.inicializarCronometro(Tiempo);
    }
    
    public void TerminarPartida(ActionEvent event) {
    	partida1.Stop(Tiempo, botonStop);
    }

    

}


