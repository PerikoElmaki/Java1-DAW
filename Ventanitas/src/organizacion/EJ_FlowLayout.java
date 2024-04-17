package organizacion;

import javax.swing.*;
import java.awt.*;

public class EJ_FlowLayout extends JFrame {
	
	public EJ_FlowLayout() {
		
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		
		//no definimos tamaño para botón, se ajustará a layout y segun 
		for(int i=1; i<=10; i++)
			add(new JButton("Botón "+i));
	}

	public static void main(String[] args) {
		EJ_FlowLayout f=new EJ_FlowLayout();
		f.setTitle("Ejemplo FLowLayout");
		f.setSize(300,250);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
