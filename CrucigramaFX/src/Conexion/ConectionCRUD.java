package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Modelo.*;

public class ConectionCRUD {
	
	DBConexion conexion = new DBConexion();
    Connection conection = conexion.conectar();
	
	
	public String InsertBD(Jugador jugador) {
	

	try {                      
		String SQL = "INSERT INTO usuarios values (?, ?); ";

		PreparedStatement pst= conection.prepareStatement(SQL);

		pst.setString(1,jugador.getCodigo());
		pst.setString(2, jugador.getNickname());
		pst.execute();

		JOptionPane.showMessageDialog(null,"Bienvenido: " + jugador.getNickname());
		

	} catch (Exception e) {
		JOptionPane.showMessageDialog(null,"Error de conexi�n:" + e.getMessage());
		System.out.println("error de registro");
	}
	
	return "Datos Insertados";
	}
	
	public String consultarTablero() {
		
		return "";
	}

	
}


