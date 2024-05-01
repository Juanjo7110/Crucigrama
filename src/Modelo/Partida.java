package Modelo;

import javax.swing.JOptionPane;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Partida {
	
	int tiempoTranscurrido;
	Crucigrama tablero;
	private Timeline timeline;
    private int segundos = 0;
	
	
	public Partida () {
		
	}
	
	public void inicializarCronometro(Text Tiempo) {
        // Configurar el cronómetro
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event ->{
        	segundos = segundos + 1;
            actualizarTiempoLabel(Tiempo);
            }
        ));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
	
	private void actualizarTiempoLabel(Text Tiempo) {
        // Actualizar el texto del label de tiempo
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;
        Tiempo.setText(String.format("%02d:%02d:%02d", horas, minutos, segundosRestantes));
    }
	
	 public void Stop(Text Tiempo, Button botonStop){
	        timeline.stop();
	        String tiempoTexto = Tiempo.getText(); 
	        JOptionPane.showMessageDialog(null, "¡¡Felicidades!! \n Su tiempo fue: \n" + tiempoTexto);
	        Stage stage = (Stage) botonStop.getScene().getWindow();
	        stage.close();
	    }

}
