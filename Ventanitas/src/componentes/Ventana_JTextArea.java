package componentes;

import javax.swing.*;

public class Ventana_JTextArea extends JFrame{
	//Definimos Componentes 
	JTextArea area;
	JScrollPane scpanel;
	
	/**
	 * Constructor de ventana con text area y scrolPane(ruleta)
	 */
	public Ventana_JTextArea() {
		setLayout(null);
		
		area=new JTextArea(); //Creamos el área de texto 
		area.setLineWrap(true); //Para que salte de linea al llegar al final del ancho 
		
		JScrollPane scpanel =new JScrollPane(area);//Lo creamos y lo añadimos al text area(el parámetro)
		scpanel.setBounds(20,20,225,150); //ubicamos 
		add(scpanel);
	}
	
	
	public static void main(String[] args) {
		Ventana_JTextArea v=new Ventana_JTextArea();
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		v.setTitle("Ejemplo JTextField");
		v.setBounds(10,10,300,250);
		v.setVisible(true);

	}

}
