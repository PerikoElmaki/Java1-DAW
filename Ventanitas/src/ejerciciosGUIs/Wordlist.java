package ejerciciosGUIs;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JPanel;


public class Wordlist  extends JFrame implements ActionListener  {

	JPanel panel1,panel2;
	JTextField textpalabra;
	JLabel label;
	JButton boton;
	
	public Wordlist() {
		
		
		label=new JLabel("Enter a word to search: ");
		panel1=new JPanel(new BorderLayout());
		panel1.add(label);
		
		textpalabra=new JTextField();
		panel2=new JPanel(new FlowLayout(FlowLayout.CENTER,2,2));
		
		
		boton=new JButton(new ImageIcon("H:\\Mi unidad\\ProyectosJava\\lupa01.png"));
		boton.addActionListener(this);
		panel2.add(boton);
		
		setLayout(new GridLayout(2,1,10,10));
		add(panel1);
		add(panel2);
		
	}
	public static void main(String[] args) {
		Wordlist v=new Wordlist();
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setSize(300,200);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setTitle("Wordlist");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Esbozo de método generado automáticamente
		
	}

}
