package pruebas;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.*;

public class FechaCumpleaños extends JFrame implements ActionListener{
	//COmponentes 
	JLabel enunciado;
	JTextField introducirfecha;
	JButton boton;
	JPanel panel1,panelboton;
	
	public FechaCumpleaños() {
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		
		enunciado=new JLabel("Introduce la fecha: ");
		enunciado.setFont(new Font("Arial",Font.BOLD,12));
		
		panel1=new JPanel(new GridLayout(2,1,10,10));
		panel1.add(enunciado);
		
		introducirfecha=new JTextField();
		introducirfecha.setToolTipText("Formato dd/mm/yyyy");
		panel1.add(introducirfecha);
		
		add(panel1);
		
		boton=new JButton("Comprobar");
		boton.addActionListener(this);
		panelboton=new JPanel(new GridLayout(0,1));
		panelboton.add(boton);
		add(panelboton);
	}
	
	public static Boolean FechaOk(String fechaletras) {
		int dia=Integer.parseInt(fechaletras.substring(0, 2));//del principio coge la siguiente posicion que pongas, pero el end es la que quieres dentro tb
		int mes=Integer.parseInt(fechaletras.substring(3,5));
		int año=Integer.parseInt(fechaletras.substring(6,fechaletras.length()));
		
		int diasmes;
		
		if(mes==4 || mes==6 || mes==9 || mes==11) {
			diasmes=30;
		}else if(mes==2) {
			if(año%4==0 && (año%100!=0  || año%400==0))
				diasmes=29;
			else
				diasmes=28;
		}else
			diasmes=31;
		
		if(dia>diasmes || dia<=0)
			return false;
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		FechaCumpleaños v=new FechaCumpleaños();
		v.setSize(300,250);
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton)
			JOptionPane.showMessageDialog(this, FechaOk("32/12/1998") );
	}

}
