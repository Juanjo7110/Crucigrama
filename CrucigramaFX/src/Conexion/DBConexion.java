package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class DBConexion {
	
	public static final String controlador = "  ";
	public static final String base_datos = "  ";
	public static final String usuario = "  ";
	public static final String contraseña = "  ";
	Connection conexion = null;
	
	
	static {
		try {
			Class.forName(controlador);
		} catch (ClassNotFoundException e) { 	
			System.out.println("Error al cargar el controlador");
		}
		
	}

public Connection conectar() {
	
	try {
		conexion = DriverManager.getConnection(base_datos, usuario, contraseña);
		System.out.println("Conexion hecha");
		
	} catch (SQLException e) {
		JOptionPane.showMessageDialog(null,"Error de conexión:" + e.getMessage());
	}
	
	return conexion;
}
}