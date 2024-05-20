package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

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

		return "Bienvenido: " + jugador.getNickname();
		

	} catch (Exception e) {
		JOptionPane.showMessageDialog(null,"Error de conexi�n:" + e.getMessage());
		System.out.println("error de registro");
	}
	
	return "Datos Insertados";
	}
	
	public String consultarTablero4() {
		
		String cadena = null;
		
		try {                      
			String SQL = "SELECT crucigrama FROM cricigramas where nivel = 4; ";

			PreparedStatement pst= conection.prepareStatement(SQL);
			
			
			ResultSet rs = pst.executeQuery();
			rs.next();
			cadena = rs.getString(1);
			
			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexi�n:" + e.getMessage());
			System.out.println("error de registro");
		}
					
		return cadena;
	}

public String consultarTablero5() {
	
	String cadena = null;
		
		try {                      
			String SQL = "SELECT crucigrama FROM cricigramas where nivel = 5; ";

			PreparedStatement pst= conection.prepareStatement(SQL);
			
			
			ResultSet rs = pst.executeQuery();
			rs.next();
			cadena = rs.getString(1);
			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexi�n:" + e.getMessage());
			System.out.println("error de registro");
		}
					
		return cadena;
	}



public String consultarTablero6() {
	
	String cadena = null;
		
		try {                      
			String SQL = "SELECT crucigrama FROM cricigramas where nivel = 6; ";

			PreparedStatement pst= conection.prepareStatement(SQL);
			
			
			ResultSet rs = pst.executeQuery();
			rs.next();
			rs.getString(1);
			
		cadena = rs.getString(1);
			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error de conexi�n:" + e.getMessage());
			System.out.println("error de registro");
		}
		
	return cadena;
					
	}
	
}


