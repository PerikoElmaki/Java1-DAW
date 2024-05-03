package ejerciciosGUIs;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Salir extends JFrame implements ActionListener, ChangeListener{
	//Componentes 
	JCheckBox check;
	JButton boton;
	JPanel panel;
	
	public Salir() {
		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		panel=new JPanel(new GridLayout(2,1,10,10));
		
		check=new JCheckBox("Acepta antes de salir");
		panel.add(check);
		check.addChangeListener(this);
		check.setFont(new Font("Arial",Font.CENTER_BASELINE,12));
		
		boton=new JButton("Salir");
		boton.addActionListener(this);
		panel.add(boton);
		
		add(panel);
		
		
		
	}
	public static void main(String[] args) {
		Salir v=new Salir();
		v.setVisible(true);
		v.setSize(400,180);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(check.isSelected()) {
			if(e.getSource()==boton)
				setVisible(false);
			
			
		}else 
			setTitle("Debes aceptar antes de salir");
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource()==check) {
			setTitle(" ");
		}
			
		
	}

}
