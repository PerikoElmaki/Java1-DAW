package ejerciciosGUIs;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Pais extends JFrame implements ItemListener{
	//COmponentes 
	JComboBox<String> combo;
	
	/**
	 * Constructor 
	 */
	public Pais() {
		setLayout(null);
		
		combo=new JComboBox<String>();
		combo.setBounds(50,20,150,25);
		combo.addItem(" ");
		combo.addItem("España");
		combo.addItem("Francia");
		combo.addItem("Italia");
		combo.addItem("Portugal");
		
		add(combo);
		combo.addItemListener(this);
	}
	
	public static void main(String[] args) {
		Pais v=new Pais();
		v.setVisible(true);
		v.setSize(250,200);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setTitle("Elige un país");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==combo) {
			String opcion=(String)combo.getSelectedItem();
			
			if(opcion.equals("España"))
				setTitle("España");
			if(opcion.equals("Francia")) {
				setTitle("Francia");
			}
			if(opcion.equals("Italia")) {
				setTitle("Italia");
			}
			if(opcion.equals("Portugal")) {
				setTitle("Portugal");
			}
			if(opcion.equals(" "))	
				setTitle(" ");
		}
		
	}

	

}
