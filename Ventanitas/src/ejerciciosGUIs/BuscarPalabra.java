package ejerciciosGUIs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BuscarPalabra extends JFrame implements ActionListener{
	//Componentes 
	JLabel escribe,palabra;
	JTextArea area;
	JScrollPane scp;
	JTextField text;
	JButton boton;
	
	public BuscarPalabra() {
		setLayout(null);
		
		escribe=new JLabel("Escribe el texto: ");
		escribe.setBounds(20,15,120,25);
		add(escribe);
		
		area=new JTextArea();
		area.setLineWrap(true);
		scp=new JScrollPane(area);
		scp.setBounds(20,45,380,100);
		add(scp);
		
		palabra=new JLabel("Palabra a buscar: ");
		palabra.setBounds(20,170,120,25);
		add(palabra);
		
		text=new JTextField(16);
		text.setBounds(130,170,160,25);
		add(text);
		
		boton=new JButton("Buscar");
		boton.setBounds(300,170,100,25);
		add(boton);
		boton.addActionListener(this);
	}
	
	public static void main(String[] args) {
		BuscarPalabra v=new BuscarPalabra();
		v.setSize(430,250);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);
		v.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
