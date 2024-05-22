package proveedores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class FormularioS extends JFrame implements ActionListener{

	//Componentes 
	JTextField codigo,nombre,estado,ciudad;
	JLabel nueva,listado,cod,nom,estadol,ciu;
	JButton guardar,borrar;
	JScrollPane sc;
	JTable tabla;
	
	private ConexionS con;
	
	public FormularioS() {
		setLayout(null);
		
		nueva=new JLabel("Introduce una nueva pieza: ");
		nueva.setBounds(30,20,200,25);
		add(nueva);
		
		cod=new JLabel("Código: ");
		cod.setBounds(30, 100, 60, 25);
		add (cod) ;
		codigo = new JTextField();
		codigo.setBounds (90, 100, 100, 25);
		add (codigo);
		nom=new JLabel ("Nombre: ");
		nom. setBounds (220, 100, 60, 25); //
		add (nom) ;
		nombre = new JTextField();
		nombre.setBounds(280, 100, 100, 25);
		add (nombre) ;
		
		estadol=new JLabel("Estado: ");
		estadol.setBounds (30, 140, 60, 25);
		add (estadol);
		
		estado = new JTextField();
		estado.setBounds(90, 140, 100, 25);
		add(estado); 
		
		
		ciu=new JLabel("Ciudad: ");
		ciu.setBounds (220, 140, 60, 25);
		add(ciu);
		
		ciudad= new JTextField();
		ciudad.setBounds(280, 140, 100, 25);
		add (ciudad);
		
		guardar=new JButton ("Guardar");
		guardar.setBounds (90,200,130,25);
		guardar.addActionListener (this);
		add (guardar);
		
		borrar=new JButton ("Borrar");
		borrar. setBounds (250,200,130,25);
		borrar .addActionListener(this);
		add (borrar) ;
		
		listado=new JLabel("Listado de proveedores: ");
		listado.setBounds(30,260,200,25);
		add(listado);
		
		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc. setBounds (30,300,360,130);
		add (sc) ;
		con = new ConexionS();
		con.mostrarS(tabla);
		con.desconectar();
		
	}
	
	/*
	 * Procedimiento para limpiar
	 */
	public void limpiar() {
		codigo.setText(" ");
		nombre.setText(" ");
		estado.setText(" ");
		ciudad.setText(" ");
	}
	
	public static void main(String[] args) {
		FormularioS pt=new FormularioS();
		pt.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pt.setTitle("PROVEEDORES");
		pt.setSize(440,500);
		pt.setLocationRelativeTo(null);
		pt.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			// Botón GUARDAR
			// Botón GUARDAR
			if (e.getSource()==guardar) {
				String code=codigo.getText();
				String name=nombre.getText();
				String state=estado.getText();
				String city=ciudad.getText();
				// Comprobamos si los campos obligatorios están vacíos
				if (code.isEmpty() || name.isEmpty() || city.isEmpty() )
					JOptionPane.showMessageDialog(null, "Los campos Código, Nombre y Ciudad son obligatorios", "'",JOptionPane.WARNING_MESSAGE);
				else {
					// Establecemos la conexión para insertar el nuevo registro y mostrar la tabla
					con = new ConexionS();
					con. insertarP(code, name, state, city);
					con.mostrarS(tabla);
					con. desconectar();
					limpiar();
				}
			}
			if(e.getSource()==borrar)
				limpiar();
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Valores introducidos incorrectos", "ERROR al guardar",JOptionPane.WARNING_MESSAGE);
		}
		
		
	}

}
