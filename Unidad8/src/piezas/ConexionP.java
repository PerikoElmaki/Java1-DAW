package piezas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConexionP {
	//Variable para hacer la conexion 
	private Connection conexion=null;
	
	//Nombre archivo donde está la base 
	private String nombreBD="E:\\s-p-sp\\S-P-SP"; //lo ultimo es el prefijo de los archivos, y los coge todos 
	
	//Driver usado para conenctarnos 
	private String driver="org.hsqldb.jdbcDriver";
	
	//URL 
	private String url="jdbc:hsqldb:file:"+nombreBD;
	
	/**
	 * Constructor obtiene conexion a base ded atos 
	 */
	public ConexionP() {
		try {
			if(conexion==null) {
				Class.forName(driver);
				conexion=DriverManager.getConnection(url);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha podido establecer la conexión con BD","ERROR BD",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/*
	 * Método para terminar la conexión a la base de datos 
	 */
	public void desconectar() {
		try {
			conexion.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR al cerrar la conexión","ERROR",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/*
	 * Método para mostrar datos de la tabla en una tabla 
	 */
	public void mostrarP (JTable t){
		try {
			String consulta="select * from P";
			Statement st=conexion.createStatement(); //permite realizar operaciones sql 
			ResultSet rs=st.executeQuery(consulta); //le podriamos meter directamente un string con consulta 
			
			DefaultTableModel modelo=new DefaultTableModel();
			String atributos[]= {"Código","Nombre","Color","Peso","Ciudad"};
			modelo.setColumnIdentifiers(atributos);
			
			Object[] fila=new Object[modelo.getColumnCount()];
			
			while(rs.next()) {
				fila[0]=rs.getString("pn");
				fila[1]=rs.getString("pnombre");
				fila[2]=rs.getString("color");
				fila[3]=rs.getInt("peso");
				fila[4]=rs.getString("ciudad");
				modelo.addRow(fila);
			}
			t.setModel(modelo);
			
			st.close();
			rs.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido mostrar la tabla","ERROR CONSULTA",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public void insertarP(String cod,String nom,String col,String pes,String ciud) {
		try {
			String sql="INSERT INTO P VALUES (?,?,?,?,?);";
			
			PreparedStatement pst=conexion.prepareStatement(sql);
			
			pst.setString(1, cod);
			pst.setString(2, nom);
			pst.setString(5, ciud);
			
			if(col.isEmpty())
				pst.setString(3, null);
			else
				pst.setString(3, col);
			
			if(pes.isEmpty())
				pst.setString(4, null);
			else
				pst.setInt(4, Integer.parseInt(pes));
			
			pst.executeUpdate(); //ejecuta sentencia
			
			pst.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha podido mostrar la tabla","ERROR CONSULTA",JOptionPane.ERROR_MESSAGE);
		}
	}
		
}
