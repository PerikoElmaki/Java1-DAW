package piezas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FormularioP extends JFrame implements ActionListener{
	//Componentes 
	JTextField codigo,nombre,color,peso,ciudad;
	JLabel nueva,listado,cod,nom,col,pes,ciu;
	JButton guardar,borrar;
	JScrollPane sc;
	JTable tabla;
	
	private ConexionP con;
	
	public FormularioP() {
		setLayout(null);
		
		nueva=new JLabel("Introduce una nueva pieza: ");
		nueva.setBounds(30,20,200,25);
		add(nueva);
		
		cod=new JLabel("Código: ");
		cod.setBounds(30,60,60,25);
		add (cod) ;
		codigo = new JTextField();
		codigo.setBounds (90,60,100,25);
		add (codigo);
		nom=new JLabel ("Nombre: ");
		nom. setBounds (30, 100, 60, 25);
		add (nom) ;
		nombre = new JTextField();
		nombre.setBounds(90, 100, 100, 25);
		add (nombre) ;
		col=new JLabel("Color: ");
		col.setBounds (30, 140, 60, 25);
		add (col);
		
		color = new JTextField();
		color.setBounds(90, 140, 100, 25);
		add (color);
		
		pes=new JLabel("Peso: ");
		pes.setBounds (220, 100, 60, 25);
		add (pes);
		
		peso = new JTextField();
		peso.setBounds(280, 100, 100, 25);
		add (peso);
		
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
		
		listado=new JLabel("Listado de piezas: ");
		listado.setBounds(30,260,200,25);
		add(listado);
		
		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc. setBounds (30,300,360,130);
		add (sc) ;
		con = new ConexionP();
		con.mostrarP(tabla);
		con.desconectar();
		
		
	}
	
	public void limpiar() {
		codigo.setText(" ");
		nombre.setText(" ");
		color.setText(" ");
		peso.setText(" ");
		ciudad.setText(" ");
	}
	
	public static void main(String[] args) {
		FormularioP pt=new FormularioP();
		pt.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pt.setTitle("PIEZAS");
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
				String colour=color.getText();
				String weight=peso.getText();
				String city=ciudad.getText();
				// Comprobamos si los campos obligatorios están vacíos
				if (code.isEmpty() || name.isEmpty() || city.isEmpty() )
					JOptionPane.showMessageDialog(null, "Los campos Código, Nombre y Ciudad son obligatorios", "'",JOptionPane.WARNING_MESSAGE);
				else {
					// Establecemos la conexión para insertar el nuevo registro y mostrar la tabla
					con = new ConexionP();
					con. insertarP(code, name, colour, weight, city);
					con.mostrarP(tabla);
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
