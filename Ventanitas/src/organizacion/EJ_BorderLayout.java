package organizacion;

import javax.swing.*;
import java.awt.*;

public class EJ_BorderLayout extends JFrame{
	
	public EJ_BorderLayout() {
		
		setLayout(new BorderLayout(5, 10));
		
		add(new JButton("Uno"),BorderLayout.CENTER);
		add(new JButton("Dos"),BorderLayout.SOUTH);
		add(new JButton("Tres"),BorderLayout.NORTH);
		add(new JButton("Cuatro"),BorderLayout.EAST);
		add(new JButton("Cinco"),BorderLayout.WEST);
	}

	public static void main(String[] args) {
		EJ_BorderLayout b=new EJ_BorderLayout();
		b.setTitle("Ejemplo BorderLayout");
		b.pack();
		b.setLocationRelativeTo(null);
		b.setVisible(true);
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
