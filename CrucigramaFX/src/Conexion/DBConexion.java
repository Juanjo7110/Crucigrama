package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Modelo.Jugador;


public class DBConexion {
	
	public static final String url = "jdbc:mysql://localhost:3306/CrucigramaBD";
	public static final String controlador = "com.mysql.jdbc.Driver";
	public static final String usuario = "root";
	public static final String contraseña = "12345678";
	Connection conexion = null;
	
	
	static {
		try {
			Class.forName(controlador);
			/*JOptionPane.showMessageDialog(null, "controlador conectado");*/
		} catch (ClassNotFoundException e) { 	
			System.out.println("Error al cargar el controlador");
		}
		
	}

public Connection conectar() {
	
	try {
		conexion = DriverManager.getConnection(url, usuario, contraseña);
		System.out.println("Conexion hecha");
		
	} catch (SQLException e) {
		JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
	}
	
	return conexion;
}

	
}