package dados;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dado3 extends JFrame implements ActionListener{
	//Componentes 
	private JButton boton;
	
	public Dado3() {
		//boton y listeener 
		boton=new JButton("?");
		boton.addActionListener(this);
		boton.setFont(new Font("Comic Sans MS",Font.BOLD,100));
		
		//añadimos a ventana 
		setLayout(new GridLayout(1,1));
		add(boton);
	}
	
	public static void main(String[] args) {
		Dado3 v=new Dado3();
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
			boton.setText(String.valueOf(n));
		}
		
	}

}
