package agenda;

import java.awt.FlowLayout;
import java.awt.GridLayout;


import javax.swing.*;

public class ListarContactos extends JPanel{

	
	private JTextArea area;
	
	private JPanel panel;
	

	/**
	 * Create the panel.
	 */
	public ListarContactos() {
		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		
		panel=new JPanel(new GridLayout(2,1,20,20));
		area=new JTextArea(20,20);
		panel.add(area);
		
		add(panel);
		area.setText("hola");
		
		
	}

	

}
