package proveedores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ConexionS extends JFrame implements ActionListener {
	//Componentes 
	JTextField codigo,nombre,color,peso,ciudad;
	JLabel nueva,listado,cod,nom,col,pes,ciu;
	JButton guardar,borrar;
	JScrollPane sc;
	JTable tabla;
		
		
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
	public ConexionS() {
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
	 * Método para mostrar datos de la tabla en una jtable
	 */
	public void mostrarS (JTable t){
		try {
			String consulta="select * from S";
			Statement st=conexion.createStatement(); //permite realizar operaciones sql 
			ResultSet rs=st.executeQuery(consulta); //le podriamos meter directamente un string con consulta 
			
			DefaultTableModel modelo=new DefaultTableModel();
			String atributos[]= {"Código","Nombre","Estado","Ciudad"};
			modelo.setColumnIdentifiers(atributos);
			
			Object[] fila=new Object[modelo.getColumnCount()];
			
			while(rs.next()) {
				fila[0]=rs.getString("sn");
				fila[1]=rs.getString("snombre");
				fila[2]=rs.getInt("estado");
				fila[3]=rs.getString("ciudad");
				modelo.addRow(fila);
			}
			t.setModel(modelo);
			
			st.close();
			rs.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido mostrar la tabla","ERROR CONSULTA",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/*
	 * Método para insertar en tabla 
	 */
	
	public void insertarP(String cod,String nom,String est,String ciud) {
		try {
			String sql="INSERT INTO S VALUES (?,?,?,?);";
			
			PreparedStatement pst=conexion.prepareStatement(sql);
			
			pst.setString(1, cod);
			pst.setString(2, nom);
			pst.setString(4, ciud);
			
			if(est.isEmpty())
				pst.setString(3, null); //primer atributo columna
			else
				pst.setInt(3, Integer.parseInt(est));
			
			pst.executeUpdate(); //ejecuta sentencia
			
			pst.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha podido mostrar la tabla","ERROR CONSULTA",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Esbozo de método generado automáticamente
		
	}
}
