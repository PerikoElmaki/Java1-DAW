package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Multiplicar extends JFrame implements ActionListener {
	
	//Componentes 
	private JTextField multi1,multi2,resultado;
	private JLabel x,igual;
	private JButton boton;
	
	public Multiplicar() {
		
		//absoluto 
		setLayout(null);
		
		multi1=new JTextField();
		multi1.setBounds(32, 75, 113, 20);
		add(multi1);
		
		multi2=new JTextField();
		multi2.setBounds(182,75, 113,20);
		add(multi2);
		
		resultado=new JTextField();
		resultado.setBounds(332,75,113,20);
		add(resultado);
		
		x=new JLabel("x");
		x.setBounds(160, 75, 27, 14);
		add(x);
		
		igual=new JLabel("=");
		igual.setBounds(310,75,27,14);
		add(igual);
		
		boton=new JButton("Multiplicar");
		boton.setBounds(190,110,100,31);
		boton.addActionListener(this);
		add(boton);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			setTitle("Multiplicación");
			if(e.getSource()==boton) {
				int x1=Integer.parseInt(multi1.getText());
				int x2=Integer.parseInt(multi2.getText());
				resultado.setText(String.valueOf(x1*x2));
			}
		}catch(Exception ex) {
			setTitle("Error");
		}
		
	}

	public static void main(String[] args) {
		Multiplicar v=new Multiplicar();
		v.setVisible(true);
		v.setTitle("Multi");
		v.setSize(485, 220);
		v.setResizable(false);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


}
