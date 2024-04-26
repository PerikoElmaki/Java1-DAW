package dados;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dado2 extends JFrame implements ActionListener{
	//Componentes 
	private JLabel tirada;
	private JButton boton;
	
	public Dado2() {
		//Creamos etiqueta 
		tirada=new JLabel(new ImageIcon("E:\\FicherosPR\\dados\\uno.png"));
		
		//boton y listeener 
		boton=new JButton("Tirar dado");
		boton.addActionListener(this);
		
		//añadimos a ventana 
		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		add(tirada);
		add(boton);
	}
	
	public static void main(String[] args) {
		Dado2 v=new Dado2();
		v.setTitle("Dado");
		v.setVisible(true);
		v.setSize(250,250);
		v.setResizable(false);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);
		v.getContentPane().setBackground(Color.cyan);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			int n=(int)(Math.random()*6+1);
			switch(n) {
				case 1:tirada.setIcon(new ImageIcon("E:\\FicherosPR\\dados\\uno.png"));break;
				case 2:tirada.setIcon(new ImageIcon("E:\\FicherosPR\\dados\\dos.png"));break;
				case 3:tirada.setIcon(new ImageIcon("E:\\FicherosPR\\dados\\tres.png"));break;
				case 4:tirada.setIcon(new ImageIcon("E:\\FicherosPR\\dados\\cuatro.png"));break;
				case 5:tirada.setIcon(new ImageIcon("E:\\FicherosPR\\dados\\cinco.png"));break;
				case 6:tirada.setIcon(new ImageIcon("E:\\FicherosPR\\dados\\seis.png"));break;
			}
		}
		
	}

}
