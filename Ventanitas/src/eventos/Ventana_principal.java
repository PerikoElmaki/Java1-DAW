package eventos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana_principal extends JFrame implements ActionListener{
	//Componentes 
	private JButton boton;
	private JLabel label;
	
	public Ventana_principal() {
		//Layout 
		setLayout(new BorderLayout(10,20));
		
		label=new JLabel("Esta es la ventana principal");
		add(label,BorderLayout.CENTER);
		
		boton=new JButton("Click para mostrar JDialog");
		add(boton,BorderLayout.CENTER);
		boton.addActionListener(this);
		
	}
	/*
	 * Metodo que implementa la accion de boton
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			Ventana_Secundaria sec = new Ventana_Secundaria(this,true);
			sec.setVisible(true);
		}
		
}

	public static void main(String[] args) {
		Ventana_principal v=new Ventana_principal();
		v.setTitle("Ventana principal");
		v.setSize(250,200);
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}



}
