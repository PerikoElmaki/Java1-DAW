package primeras;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class CicloDaw extends JFrame{//para no crear un objeto nuevo, heredamos de clase
	
	/*
	 * Constructor
	 */
	public CicloDaw() {
		setTitle("VegaMedia");
		JLabel label=new JLabel("Desarrollo de Aplicaciones Web");
		JButton bot=new JButton("aaaaaaa");
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(2,1,15,5));
		p.add(label,JLabel.CENTER);
		p.add(bot);
		add(p);
		
		setLayout(new FlowLayout(FlowLayout.CENTER,40,20));
		
	}
	
	
	
	public static void main(String[] args) {
		CicloDaw app=new CicloDaw();
		app.setSize(300,150);
		app.setLocationRelativeTo(null);
		app.setVisible(true);
		app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
