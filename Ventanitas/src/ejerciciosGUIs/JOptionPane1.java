package ejerciciosGUIs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class JOptionPane1 extends JFrame implements ActionListener{
	//Componentes 
	JPanel panel;
	JLabel enunciado;
	JTextField text;
	JButton boton;
	
	public JOptionPane1() {
		
		panel=new JPanel(new GridLayout(0,1,20,20));
		
		enunciado=new JLabel("Introduce un número: ");
		enunciado.setFont(new Font("Arial",Font.BOLD,12));
		panel.add(enunciado);
		
		text=new JTextField();
		panel.add(text);
		
		boton=new JButton("Comprobar");
		boton.addActionListener(this);
		panel.add(boton);
		
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		add(panel);
	}

	public static void main(String[] args) {
		JOptionPane1 v=new JOptionPane1();
		v.setSize(300,250);
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setTitle("POSITIVO O NEGATIVO");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			try {
				if(text.getText().isEmpty())
					JOptionPane.showMessageDialog(null, "Campo vacío, introduce los datos","AVISO",JOptionPane.WARNING_MESSAGE);
				else {
					int valor=Integer.parseInt(text.getText());
					if(valor<0)
						JOptionPane.showMessageDialog(null, "EL número es NEGATIVO","NEGATIVO",JOptionPane.PLAIN_MESSAGE);
					else if(valor>0)
						JOptionPane.showMessageDialog(null, "El número es POSITIVO","POSITIVO",JOptionPane.PLAIN_MESSAGE);
					else
						JOptionPane.showMessageDialog(null, "EL número es 0","CERO",JOptionPane.INFORMATION_MESSAGE);
				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "ERROR en la introducción de datos","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}

}
