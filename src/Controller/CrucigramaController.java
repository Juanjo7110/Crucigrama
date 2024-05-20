package Controller;

import java.io.IOException;
import javafx.scene.input.KeyEvent;
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
    
    @FXML
    private Button BotonIniciarTiempo;
    
    private void limitarCampoTexto(TextArea campoTexto) {
        campoTexto.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("[A-Z]") && !newValue.isEmpty() || newValue.length() > 1) {
                campoTexto.setText(oldValue);
            }
        });
    }

    
    public void IniciarPartida4x4(ActionEvent event) {
    	partida1 = new Partida();
    	partida1.inicializarCronometro(Tiempo);
    	BotonIniciarTiempo.setDisable(true);
    	botonStop.setDisable(false);
    	botonPista.setDisable(false);
    	cuatro00.setDisable(false);
    	cuatro10.setDisable(false);
    	cuatro20.setDisable(false);
    	cuatro30.setDisable(false);
    	cuatro01.setDisable(false);
    	cuatro11.setDisable(false);
    	cuatro02.setDisable(false);
    	cuatro21.setDisable(false);
    	cuatro31.setDisable(false);
    	cuatro12.setDisable(false);
    	cuatro22.setDisable(false);
    	cuatro32.setDisable(false);
    	cuatro03.setDisable(false);
    	cuatro13.setDisable(false);
    	cuatro23.setDisable(false);
    	cuatro33.setDisable(false);
    	limitarCampoTexto(cuatro00);
    	limitarCampoTexto(cuatro10);
    	limitarCampoTexto(cuatro20);
    	limitarCampoTexto(cuatro30);
    	limitarCampoTexto(cuatro01);
    	limitarCampoTexto(cuatro11);
    	limitarCampoTexto(cuatro02);
    	limitarCampoTexto(cuatro21);
    	limitarCampoTexto(cuatro31);
    	limitarCampoTexto(cuatro12);
    	limitarCampoTexto(cuatro22);
    	limitarCampoTexto(cuatro32);
    	limitarCampoTexto(cuatro03);
    	limitarCampoTexto(cuatro13);
    	limitarCampoTexto(cuatro23);
    	limitarCampoTexto(cuatro33);
            
    }
    
    	public void IniciarPartida5x5(ActionEvent event) {
        	partida1 = new Partida();
        	partida1.inicializarCronometro(Tiempo);
        	BotonIniciarTiempo.setDisable(true);
        	botonStop.setDisable(false);
        	botonPista.setDisable(false);
        	cinco00.setDisable(false);
        	cinco10.setDisable(false);
            cinco20.setDisable(false);
            cinco30.setDisable(false);
            cinco01.setDisable(false);
            cinco11.setDisable(false);
            cinco02.setDisable(false);
            cinco21.setDisable(false);
            cinco31.setDisable(false);
            cinco12.setDisable(false);
            cinco22.setDisable(false);
            cinco32.setDisable(false);
            cinco03.setDisable(false);
            cinco13.setDisable(false);
            cinco23.setDisable(false);
            cinco33.setDisable(false);
            cinco40.setDisable(false);
            cinco41.setDisable(false);
            cinco42.setDisable(false);
            cinco43.setDisable(false);
            cinco04.setDisable(false);
            cinco14.setDisable(false);
            cinco24.setDisable(false);
            cinco34.setDisable(false);
            cinco44.setDisable(false);
            
            limitarCampoTexto(cinco00);
            limitarCampoTexto(cinco10);
            limitarCampoTexto(cinco20);
            limitarCampoTexto(cinco30);
            limitarCampoTexto(cinco01);
            limitarCampoTexto(cinco11);
            limitarCampoTexto(cinco02);
            limitarCampoTexto(cinco21);
            limitarCampoTexto(cinco31);
            limitarCampoTexto(cinco12);
            limitarCampoTexto(cinco22);
            limitarCampoTexto(cinco32);
            limitarCampoTexto(cinco03);
            limitarCampoTexto(cinco13);
            limitarCampoTexto(cinco23);
            limitarCampoTexto(cinco33);
            limitarCampoTexto(cinco40);
            limitarCampoTexto(cinco41);
            limitarCampoTexto(cinco42);
            limitarCampoTexto(cinco43);
            limitarCampoTexto(cinco04);
            limitarCampoTexto(cinco14);
            limitarCampoTexto(cinco24);
            limitarCampoTexto(cinco34);
            limitarCampoTexto(cinco44);
    	}
    	
    	
    	public void IniciarPartida6x6(ActionEvent event) {
        	partida1 = new Partida();
        	partida1.inicializarCronometro(Tiempo);
        	BotonIniciarTiempo.setDisable(true);
        	botonStop.setDisable(false);
        	botonPista.setDisable(false);
        	seis00.setDisable(false);
        	seis10.setDisable(false);
            seis20.setDisable(false);
            seis30.setDisable(false);
            seis01.setDisable(false);
            seis11.setDisable(false);
            seis02.setDisable(false);
            seis21.setDisable(false);
            seis31.setDisable(false);
            seis12.setDisable(false);
            seis22.setDisable(false);
            seis32.setDisable(false);
            seis03.setDisable(false);
            seis13.setDisable(false);
            seis23.setDisable(false);
            seis33.setDisable(false);
            seis40.setDisable(false);
            seis41.setDisable(false);
            seis42.setDisable(false);
            seis43.setDisable(false);
            seis04.setDisable(false);
            seis14.setDisable(false);
            seis24.setDisable(false);
            seis34.setDisable(false);
            seis44.setDisable(false);
            seis50.setDisable(false);
            seis51.setDisable(false);
            seis52.setDisable(false);
            seis53.setDisable(false);
            seis54.setDisable(false);
            seis05.setDisable(false);
            seis15.setDisable(false);
            seis25.setDisable(false);
            seis35.setDisable(false);
            seis45.setDisable(false);
            seis55.setDisable(false);
            
            limitarCampoTexto(seis00);
            limitarCampoTexto(seis10);
            limitarCampoTexto(seis20);
            limitarCampoTexto(seis30);
            limitarCampoTexto(seis01);
            limitarCampoTexto(seis11);
            limitarCampoTexto(seis02);
            limitarCampoTexto(seis21);
            limitarCampoTexto(seis31);
            limitarCampoTexto(seis12);
            limitarCampoTexto(seis22);
            limitarCampoTexto(seis32);
            limitarCampoTexto(seis03);
            limitarCampoTexto(seis13);
            limitarCampoTexto(seis23);
            limitarCampoTexto(seis33);
            limitarCampoTexto(seis40);
            limitarCampoTexto(seis41);
            limitarCampoTexto(seis42);
            limitarCampoTexto(seis43);
            limitarCampoTexto(seis04);
            limitarCampoTexto(seis14);
            limitarCampoTexto(seis24);
            limitarCampoTexto(seis34);
            limitarCampoTexto(seis44);
            limitarCampoTexto(seis50);
            limitarCampoTexto(seis51);
            limitarCampoTexto(seis52);
            limitarCampoTexto(seis53);
            limitarCampoTexto(seis54);
            limitarCampoTexto(seis05);
            limitarCampoTexto(seis15);
            limitarCampoTexto(seis25);
            limitarCampoTexto(seis35);
            limitarCampoTexto(seis45);
            limitarCampoTexto(seis55);
    	}
    
    
    public void TerminarPartida(ActionEvent event) {
    	partida1.Stop(Tiempo, botonStop);
    }

    

}


