package componentes;
import javax.swing.*;
public class Ventana_ComboBox extends JFrame{
	//Componentes
	JComboBox combo;
	
	public Ventana_ComboBox() {
		setLayout(null);
		
		combo=new JComboBox();
		combo.setBounds(10,10,120,20);
		combo.addItem("Rojo");
		combo.addItem("Verde");
		combo.addItem("Azul");
		add(combo);
	}
	public static void main(String[] args) {
		Ventana_ComboBox v=new Ventana_ComboBox();
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		v.setTitle("Ejemplo ComboBox");
		v.setBounds(10,10,320,150);
		v.setVisible(true);

	}

}
