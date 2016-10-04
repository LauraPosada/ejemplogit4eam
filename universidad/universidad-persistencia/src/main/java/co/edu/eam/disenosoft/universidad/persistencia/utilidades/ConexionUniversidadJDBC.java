package co.edu.eam.disenosoft.universidad.persistencia.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionUniversidadJDBC {

	public static Connection getConexion() throws SQLException{
		
		//conectarse
		System.out.println("Conectando....");
		String url="jdbc:mysql://174.142.65.144:3306/universidad";
		String user="desarrollo";
		String	pass="desarrollo";
		Connection con=DriverManager.getConnection(url, user, pass);
		//retorna la conexion
		return con;
	}
	
	
}
