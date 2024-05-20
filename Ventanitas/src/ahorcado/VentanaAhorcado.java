package ahorcado;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import ahorcadopoo.Ahorcado;

public class VentanaAhorcado extends JFrame implements ActionListener{
	
	public static String rutagif="C:\\Users\\El Maki\\Mi unidad\\ProyectosJava\\brain.gif";
	//Componentes 
	JLabel title,labelintentos,labelintroduce,labelpista,gif;
	JTextField resol,probar;
	JButton boton;
	JPanel panel1,panel2,panel3dentro2,panelrespuestas,panelbot,panelprinc;
	Ahorcado h=new Ahorcado();
	
	public VentanaAhorcado() {
		//Creamos clase ahorcado 
		
		
		title=new JLabel("AHORCADO");
		title.setFont(new Font("Pricedown Bl", Font.BOLD, 20));
		
		
		panel2=new JPanel(new GridLayout(1,2,10,10));
		labelpista=new JLabel(h.getPalabraMostrar());
		labelintentos=new JLabel("Intentos: "+h.getIntentos());
		panel2.add(labelpista);
		panel2.add(labelintentos);
		
		resol=new JTextField(10);
		probar=new JTextField(2);
		
		
		panel3dentro2=new JPanel(new GridLayout(2,1,10,10));
		boton=new JButton("Probar");
		boton.addActionListener(this);
		panelbot=new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		panelbot.add(boton);
		panel3dentro2.add(resol);
		panel3dentro2.add(panelbot);
		
		panelprinc=new JPanel(new GridLayout(3,1,5,5));
		panelprinc.add(title);
		panelprinc.add(panel2);
		panelprinc.add(panel3dentro2);
		
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		add(panelprinc);
		
	}
	public static void main(String[] args) {
		VentanaAhorcado v=new VentanaAhorcado();
		v.setSize(450,470);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);
		v.setVisible(true);
		v.setTitle("Jugar");
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			if(resol.getText().length()>1) {
				JOptionPane.showMessageDialog(null, "Introduce un carácter para comprobar o escribe RESUELVO para resolver","AVISO",JOptionPane.WARNING_MESSAGE);
			}else {
				String res=resol.getText();
				if(res.equalsIgnoreCase("resuelvo")) {
					boton.setText("RESOLVER");
				}
			}
		}
		
	}

}
