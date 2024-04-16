package componentes;
import javax.swing.*;
public class Ventana_JRadioButton extends JFrame{
	//Componentes 
	JRadioButton radio1,radio2;
	ButtonGroup grupoBotones; //para enlazarlos
	
	//Creamos constructor de ventana con controles checkbox
	public Ventana_JRadioButton() {
		setLayout(null);
		
		//Creamos grupo de botones
		grupoBotones=new ButtonGroup();
		
		//Creamos radio buton y añadimos a grupo 
		radio1=new JRadioButton("Hombre");
		radio1.setBounds(50,20,100,25);
		grupoBotones.add(radio1);
		
		radio2=new JRadioButton("Mujer");
		radio2.setBounds(50,60,100,25);
		grupoBotones.add(radio2);
		
		//añadimos a ventana
		add(radio1); add(radio2);
	}
	
	public static void main(String[] args) {
		Ventana_JRadioButton v=new Ventana_JRadioButton();
		v.setTitle("EJEmplo RadioButton");
		v.setBounds(10,10,330,150);
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
