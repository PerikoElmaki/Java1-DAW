package componentes;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Ventana_Boton extends JFrame{
	JButton boton; //Control visual: boton
	
	/**
	 * COnstructor
	 */
	public Ventana_Boton() {
		setLayout(null); //Utilizamos posicionamiento absoluto para los componentes 
		
		boton=new JButton("BOTON");//creamos 
		boton.setBounds(100, 40, 80, 25); //damos posición y tamaño absoluto (aunque usaremos asistente)
		add(boton); //añadimos a ventana
	}

	public static void main(String[] args) {
		Ventana_Boton v=new Ventana_Boton(); //creamos objeto 
		v.setTitle("EJEMPLO BOTON"); //titulo
		v.setSize(300,150);
		
		v.setLocationRelativeTo(null);//ubicamos ventana en el centro 
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
