package Modelo;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Partida {
	
	int tiempoTranscurrido;
	Crucigrama tablero;
	
	
	public Partida (int tiempoTranscurrido, Crucigrama tablero) {
		this.tiempoTranscurrido = tiempoTranscurrido;
		this.tablero = tablero;
	}
	
	

}
