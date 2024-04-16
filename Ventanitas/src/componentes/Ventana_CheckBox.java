package componentes;

import javax.swing.*;

public class Ventana_CheckBox extends JFrame{
	/**Componentes**/
	JCheckBox check1,check2; //son independientes entre si
	 
	//Creamos la ventana con dos controles checkbox 
	public Ventana_CheckBox() {
		
		setLayout(null);//para que te deje posicionar donde quieres, si no te centra
		
		check1=new JCheckBox("Pulsa para marcar opción");
		check2=new JCheckBox("Pulsa para marcar otra opción",true);
		//le damos localización y tamaño
		check1.setBounds(60, 20, 150, 25);
		check2.setBounds(60, 60, 150, 25);
		
		//Añadimos a la ventana
		add(check1);
		add(check2);
	}
	
	public static void main(String[] args) {
		Ventana_CheckBox v=new Ventana_CheckBox();
		
		//Configuramos ventana 
		v.setTitle("Ejemplo CheckBox");
		v.setBounds(100, 100, 300, 150);
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		;

	}

}
