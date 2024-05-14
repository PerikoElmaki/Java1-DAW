package ahorcado;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import ahorcadopoo.Ahorcado;

public class VentanaAhorcado extends JFrame implements ActionListener{
	
	public static String rutagif="C:\\Users\\El Maki\\Mi unidad\\ProyectosJava\\brain.gif";
	//Componentes 
	JLabel title,labelintentos,labelintroduce,labelpista,gif;
	JTextField respuesta;
	JButton boton;
	JPanel panel1,panel2,panelprinc;
	
	public VentanaAhorcado() {
		//Creamos clase ahorcado 
		Ahorcado h=new Ahorcado();
		
		title=new JLabel("AHORCADO");
		title.setFont(new Font("Pricedown Bl", Font.BOLD, 33));
		
		panel1=new JPanel(new GridLayout(1,2,30,30));
		panel1.add(title);
		
		panel2=new JPanel(new GridLayout(1,2,20,20));
		labelpista=new JLabel(h.getPalabraMostrar());
		labelintentos=new JLabel("Intentos: "+h.getIntentos());
		panel2.add(labelpista);
		panel2.add(labelintentos);
		
		panelprinc=new JPanel(new GridLayout(2,1,10,10));
		panelprinc.add(panel1);
		panelprinc.add(panel2);
		
		setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
		add(panelprinc);
		
	}
	public static void main(String[] args) {
		VentanaAhorcado v=new VentanaAhorcado();
		v.setSize(430,240);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);
		v.setVisible(true);
		v.setTitle("Jugar");
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Esbozo de método generado automáticamente
		
	}

}
