package piezas;

import java.awt.FlowLayout;
import java.sql.Connection;
import javax.swing.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class Piezas2 extends JFrame {
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
			String consulta="SELECT * from P"; //Aqui consulta con condiciones y todo 
			
			Statement st=conexion.createStatement(); //permite realizar operaciones sql 
			ResultSet rs=st.executeQuery(consulta); //le podriamos meter directamente un string con consulta 
			
			//Imprimimos resultado 
			//el REsultset se lee como si fuese un archivo de texto, por lineas 
			while(rs.next()) {
				System.out.print("\n"+rs.getString("pn"));                  //getString coge solo los valores de la columna 
				System.out.print("\t"+rs.getString("color"));				//la columna, debemos especificar qué columna aparece
				System.out.print("\t"+rs.getInt("peso"));
				System.out.print("\t"+rs.getString("pnombre")); 			//las condiciones van en la consulta pero para mostrar 	
				System.out.print("\t"+rs.getString("ciudad"));
			}
			//cerramos los dos 
			st.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("ERROR en la consulta");
		}
	}
	
	/*
	 * para Mostrar la tabla 
	 */
	
	public void mostrarTabla(DefaultTableModel t) {
		try {
		String consulta="select * from p";
		Statement st=conexion.createStatement();
		ResultSet rs=st.executeQuery(consulta);
		//insertamos resultado fila por fila, no sabemos el tipo por eso usamos Object
		Object[] fila=new Object[t.getColumnCount()]; //de cuantas columnas tenga 
		while(rs.next()) {
			fila[0]=rs.getString("pn");
			fila[1]=rs.getString("pnombre");
			fila[2]=rs.getString("color");
			fila[3]=rs.getInt("peso");
			fila[4]=rs.getString("ciudad");
		}
		st.close();
		rs.close();
	}catch (SQLException e) {
		System.out.println("ERROR");
	
	}
	}
}
