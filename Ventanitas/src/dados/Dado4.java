package dados;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dado4 extends JFrame implements ActionListener{
	//Componentes 
	private JButton boton;
	
	public Dado4() {
	
		//boton y listeener 
		boton=new JButton(new ImageIcon("E:\\FicherosPR\\dados\\dado1.png"));
		boton.addActionListener(this);
		
		//añadimos a ventana 
		setLayout(new GridLayout(1,1));
		add(boton);
	}
	
	public static void main(String[] args) {
		Dado4 v=new Dado4();
		v.setTitle("Dado");
		v.setVisible(true);
		v.setSize(325,325);
		v.setResizable(true);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);
		v.getContentPane().setBackground(Color.cyan);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			int n=(int)(Math.random()*6+1);
			switch(n) {
				case 1:boton.setIcon(new ImageIcon("E:\\FicherosPR\\dados\\dado1.png"));break;
				case 2:boton.setIcon(new ImageIcon("E:\\FicherosPR\\dados\\dado2.png"));break;
				case 3:boton.setIcon(new ImageIcon("E:\\FicherosPR\\dados\\dado3.png"));break;
				case 4:boton.setIcon(new ImageIcon("E:\\FicherosPR\\dados\\dado4.png"));break;
				case 5:boton.setIcon(new ImageIcon("E:\\FicherosPR\\dados\\dado5.png"));break;
				case 6:boton.setIcon(new ImageIcon("E:\\FicherosPR\\dados\\dado6.png"));
				boton.setIcon(new ImageIcon("E:\\FicherosPR\\baile.gif"));break;
			}
		}
		
	}

}
