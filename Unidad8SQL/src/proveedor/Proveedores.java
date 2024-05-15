package proveedor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Proveedores {
	//Variable para hacer la conexion 
	private Connection conexion=null;
	
	//Nombre archivo donde está la base 
	private String nombreBD="E:\\s-p-sp\\S-P-SP"; //lo ultimo es el prefijo de los archivos, y los coge todos 
	
	//Driver usado para conenctarnos 
	private String driver="org.hsqldb.jdbcDriver";
	
	//URL 
	private String url="jdbc:hsqldb:file:"+nombreBD;
	
	//Método para obtener conexión 
	public Connection obtenerConexion() {
		try {
			if(conexion==null) {
				Class.forName(driver); //cargamos driver 
				conexion= DriverManager.getConnection(url);
				System.out.println("Conexión establecida correctamente");
			}
		} catch (Exception e) {
			System.out.println("ERROR al establecer conexión");
		}
		return conexion;
	}
	
	/*
	 * PAra desconectar, como los scaner hay que cerrarlo
	 */
	public void desconectar() {
		try {
			conexion.close();
		} catch (SQLException e) {
			System.out.println("ERROR al cerrar");
		}
	}
	
	/*
	 * Método para mostrar
	 */
	public void mostrar() {
		try {
			String consulta="SELECT * from S"; //Aqui consulta con condiciones y todo 
			
			Statement st=conexion.createStatement(); //permite realizar operaciones sql 
			ResultSet rs=st.executeQuery(consulta); //le podriamos meter directamente un string con consulta 
			
			//Imprimimos resultado 
			//el REsultset se lee como si fuese un archivo de texto, por lineas 
			while(rs.next()) {
				System.out.print("\n"+rs.getString("sn"));                 
				System.out.print("\t"+rs.getString("snombre")); 				
				System.out.print("\t"+rs.getInt("estado"));					
				System.out.print("\t"+rs.getString("ciudad"));
			}
			//cerramos los dos 
			st.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("ERROR en la consulta");
		}
	}
}
