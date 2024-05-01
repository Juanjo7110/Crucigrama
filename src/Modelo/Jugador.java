package Modelo;

import java.util.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Jugador {
	
	private String nickname;
    private String codigo;
    
    public Jugador(String nickname, String codigo) {
    	this.nickname = nickname;
    	this.codigo = codigo;
    }
    
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCodigo() {
    	return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
