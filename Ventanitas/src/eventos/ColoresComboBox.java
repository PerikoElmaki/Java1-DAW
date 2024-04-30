package eventos;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class ColoresComboBox extends JFrame implements ItemListener {
private JComboBox<String> combo;
	
	public ColoresComboBox() {
		setLayout(null);
		
		combo = new JComboBox<String>();
		combo.setBounds(50,20,150,25);
		combo.addItem("");
		combo.addItem("rojo");
		combo.addItem("azul");
		combo.addItem("verde");
		combo.addItem("amarillo");
		add(combo);
		combo.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==combo) {
			String seleccionado = (String)combo.getSelectedItem();
			
			if (seleccionado.equals("rojo"))
				getContentPane().setBackground(Color.red);
			if (seleccionado.equals("azul"))
				getContentPane().setBackground(Color.blue);
			if (seleccionado.equals("verde"))
				getContentPane().setBackground(Color.green);
			if (seleccionado.equals("amarillo"))
				getContentPane().setBackground(Color.yellow);
			
		}
	}
	public static void main(String[] args) {
		ColoresComboBox c = new ColoresComboBox();
		c.setTitle("Colores");
		c.setSize(280, 200);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
		c.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
