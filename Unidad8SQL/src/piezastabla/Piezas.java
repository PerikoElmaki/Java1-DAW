package piezastabla;

import java.awt.FlowLayout;
import java.sql.Connection;
import javax.swing.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class Piezas extends JFrame {
	/*
	 * Constructor para ventana 
	 */
	public Piezas() {
		setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
		
		DefaultTableModel modelo=new DefaultTableModel(); //lo usaremos en clase jtbale 
		String atributos[]= {"Código","Nombre","Color","Peso","Ciudad"}; //array de string para los títulos de las columnas 
		modelo.setColumnIdentifiers(atributos);
		
		JTable tabla=new JTable();
		tabla.setModel(modelo);
		
		JScrollPane sc=new JScrollPane(tabla);
		add(sc);
		
		//Insertamos datos en tabla
		obtenerConexion();
		mostrarTabla(modelo);
		desconectar();
	}
	
	public static void main(String[] args) {
		Piezas pt=new Piezas();
		pt.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pt.setTitle("Piezas");
		pt.pack();
		pt.setVisible(true);
	}
	
	
	
	
	
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
