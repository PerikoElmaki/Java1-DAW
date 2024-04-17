package organizacion;

import java.awt.*;

import javax.swing.*;


public class EJ_GridLayout extends JFrame{
	
	//Lo vamos a usar bastante, para centrar formularios por ejemplo 
	//Organizamos Label con text field 
	public EJ_GridLayout() {
		
		setLayout(new GridLayout(2, 2, 10, 10));
		add(new JLabel("Nombre"));
		add(new JTextField());
		add(new JLabel("TLF"));
		add(new JTextField());
		
	}

	public static void main(String[] args) {
		EJ_GridLayout g=new EJ_GridLayout();
		g.setTitle("Ejemplo BorderLayout");
		g.setSize(300,100);
		g.setLocationRelativeTo(null);
		g.setVisible(true);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
