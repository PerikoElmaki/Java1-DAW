package ejerciciosGUIs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TablaMultiplicar extends JFrame implements ActionListener {
	//componentes 
	JLabel label;
	JTextField numero;
	JButton boton;
	JTextArea area;
	JScrollPane scp;
	JPanel panel1,panelarea;
	
	public TablaMultiplicar() {
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		
		label=new JLabel("Número: ");
		label.setFont(new Font("Arial",Font.BOLD,12));
		
		panel1=new JPanel(new GridLayout(0,3,5,5));
		panel1.add(label);
		
		numero=new JTextField();
		panel1.add(numero);
		
		boton=new JButton("Generar tablas");
		boton.setFont(new Font("Arial",Font.BOLD,12));
		boton.addActionListener(this);
		panel1.add(boton);
		
		area=new JTextArea();
		area.setLineWrap(true);
		
		panelarea=new JPanel(new BorderLayout());
		panelarea.add(area);
		
		//añadimos paneles a frame
		add(panel1);
		add(panelarea,BorderLayout.CENTER);
	}
	
	
	public static void main(String[] args) {
		TablaMultiplicar v=new TablaMultiplicar();
		v.setSize(400,400);
		v.setTitle("TABLAS Multiplicar");
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			try {
				int num=Integer.parseInt(numero.getText());
				if(num<1 || num>10) {
					area.setText("Debes introducir un nº entero entre 1 y 10");
				}else {
					String tabla="";
					for(int i=1; i<=10; i++) {
						tabla+=num+" x "+i+" = "+(num*i)+"\n";
					}
					area.setText(tabla);
				
				}
			} catch (Exception e2) {
				area.setText("Debes introducir un nº entero entre 1 y 10");
			}
		}
		
	}

}
