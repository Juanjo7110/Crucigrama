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
    
    public void Ingresar (Stage primaryStage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("/Vista/vistaSeleccionNiveles.fxml"));
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			/*BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			
			primaryStage.setTitle("Crucigrama");
			primaryStage.setScene(scene);
			primaryStage.show();*/
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
    
}
