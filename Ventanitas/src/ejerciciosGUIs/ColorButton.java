package ejerciciosGUIs;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ColorButton extends JFrame implements ActionListener {
	//Componentes 
	ButtonGroup grupo;
	JRadioButton rojo,azul,verde,amarillo;
	JLabel eleccion;
	JPanel panel;
	/*
	 * Constructor 
	 */
	public ColorButton() {
		setLayout(new FlowLayout(FlowLayout.LEFT,30,30));
		panel=new JPanel(new GridLayout(5,1,40,20));
		
		
		rojo=new JRadioButton("Rojo");
		grupo=new ButtonGroup();
		grupo.add(rojo);
		rojo.addActionListener(this);
		panel.add(rojo);
		
		azul=new JRadioButton("Azul");
		grupo.add(azul);
		azul.addActionListener(this);
		panel.add(azul);
		
		verde=new JRadioButton("Verde");
		grupo.add(verde);
		verde.addActionListener(this);
		panel.add(verde);
		
		amarillo=new JRadioButton("Amarillo");
		grupo.add(amarillo);
		amarillo.addActionListener(this);
		panel.add(amarillo);
		
		eleccion=new JLabel(" ");
		panel.add(eleccion);
		
		add(panel);
		
	}
	public static void main(String[] args) {
		ColorButton v=new ColorButton();
		v.setVisible(true);
		v.setSize(290,320);
		v.setResizable(false);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setTitle("Elige un color");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rojo) {
			eleccion.setText("Color elegido: Rojo");
		}
		if(e.getSource()==azul) {
			eleccion.setText("Color elegido: Azul");
		}
		if(e.getSource()==verde) {
			eleccion.setText("Color elegido: Verde");
		}
		if(e.getSource()==amarillo) {
			eleccion.setText("Color elegido: Amarillo");
		}
		
		

		
	}

}
