package ejerciciosGUIs;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TecladoNumerico extends JFrame implements ActionListener {
	//Componentes
	private JButton[] numeros;
	
	public TecladoNumerico() {
		numeros=new JButton[10];
		//creamos botones
		for(int i=0; i<10; i++) {
			numeros[i]=new JButton(String.valueOf(i));
			numeros[i].setFont(new Font ("Arial",Font.BOLD,25));
			numeros[i].addActionListener(this);
		}
		
		//Le damos layout a ventana, solo usamos grid
		setLayout(new GridLayout(4,3,2,2));
		add(numeros[7]);
		add(numeros[8]);
		add(numeros[9]);
		add(numeros[4]);
		add(numeros[5]);
		add(numeros[6]);
		add(numeros[1]);
		add(numeros[2]);
		add(numeros[3]);
		add(new JLabel(" "));
		add(numeros[0]);
		add(new JLabel(" "));
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==numeros[0])
				setTitle("CERO");
			if(e.getSource()==numeros[1])
				setTitle("UNO");
			if(e.getSource()==numeros[2])
				setTitle("DOS");
			if(e.getSource()==numeros[3])
				setTitle("TRES");
			if(e.getSource()==numeros[4])
				setTitle("CUATRO");
			if(e.getSource()==numeros[5])
				setTitle("CINCO");
			if(e.getSource()==numeros[6])
				setTitle("SEIS");
			if(e.getSource()==numeros[7])
				setTitle("SIETE");
			if(e.getSource()==numeros[8])
				setTitle("OCHO");
			if(e.getSource()==numeros[9])
				setTitle("NUEVE");
		} catch (Exception e2) {
			setTitle("ERROR");
		}
		
	}
	
	public static void main(String[] args) {
		TecladoNumerico v=new TecladoNumerico();
		v.setVisible(true);
		v.setTitle("Selecciona un boton");
		v.setSize(300,400);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setResizable(false);
	}


	

}
