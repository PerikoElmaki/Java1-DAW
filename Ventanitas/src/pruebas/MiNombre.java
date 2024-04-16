package pruebas;

import javax.swing.*;

public class MiNombre extends JFrame {
	//Componentes 
	JLabel etiqueta;
	
	public MiNombre() {
		setLayout(null);
		etiqueta=new JLabel("Federico Garcia");
		add(etiqueta);
	}
	public static void main(String[] args) {
		MiNombre ventana=new MiNombre();
		ventana.setTitle("Mi Nombre");
		ventana.setVisible(true);
		ventana.setSize(300,100);
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
