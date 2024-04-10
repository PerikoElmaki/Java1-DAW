package componentes;

import javax.swing.*;

public class Ventana_JTextField extends JFrame{
	//COMPONENTES 
	JLabel mensaje;  //definimos/declaramos aqui dandoles el nombre
	JTextField campotext;
	
	/*
	 * COnstructor de la ventana con etiqueta y campo de texto,
	 * con esto editamos una ventana normal y usamos este constructor que 
	 * ya tiene componentes. 
	 */
	public Ventana_JTextField() {
		setLayout(null); //porque le vamos a dar absoluta 
		
		//Creamos etiqueta, ubicamos y damos tamaño
		mensaje=new JLabel("Usuario");
		mensaje.setBounds(20, 40, 100, 25);
		add(mensaje); //añadimos a ventana
		
		//Creamos campo de texto y añadimos 
		campotext=new JTextField();
		campotext.setBounds(80, 40, 175, 25);
		add(campotext);
	}
	
	public static void main(String[] args) {
		Ventana_JTextField v=new Ventana_JTextField();
		//COnfiguramos la ventana, su titulo, ubicacion y tamaño 
		v.setTitle("Ejemplo JTextField");
		v.setBounds(10, 10, 300, 150);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		v.setVisible(true);

	}

}
