package boletin5;

import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.*;



public class MayorEdad extends JFrame implements ActionListener{

	//Componentes 
	JLabel dia,mes,año;
	JTextField td,tm,tñ;
	JPanel panelPrinc,panel1,panelbot;
	JButton botn;
	
	/*
	 * COnstructor de la ventana 
	 */
	public MayorEdad() {
	
		
		dia=new JLabel("Día", (int) CENTER_ALIGNMENT);
		dia.setFont(new Font("Arial",Font.BOLD,12));
		
		mes=new JLabel("Mes", (int) CENTER_ALIGNMENT);
		mes.setFont(new Font("Arial",Font.BOLD,12));
		año=new JLabel("Año", (int) CENTER_ALIGNMENT);
		año.setFont(new Font("Arial",Font.BOLD,12));
		
		panel1=new JPanel(new GridLayout(2,3,30,10));
		panel1.add(dia);
		panel1.add(mes);
		panel1.add(año);
		
		td=new JTextField(5);
		tm=new JTextField(5);
		tñ=new JTextField(5);
		
		panel1.add(td);
		panel1.add(tm);
		panel1.add(tñ);
		
		
		botn=new JButton("Comprobar");
		botn.addActionListener(this);
		panelbot=new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		panelbot.add(botn);
		
		panelPrinc=new JPanel(new GridLayout(2,1,30,30));
		panelPrinc.add(panel1);
		panelPrinc.add(panelbot);
		
		setLayout(new FlowLayout(FlowLayout.CENTER,20,40));
		add(panelPrinc);
		
		
	}
	/*
	 * Función que determina si la fecha introducida es correcta
	 */
	public static boolean FechaOk(int dia,int mes,int año) {
		
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
		if(mes==0)
			return false;
		if(año==0)
			return false;
		
		return true;
	}
	
	
	public static void main(String[] args) {
		MayorEdad v=new MayorEdad();
		v.setSize(430,240);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);
		v.setVisible(true);
		v.setTitle("Introduce una fecha de nacimiento: ");
		v.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==botn) {
			if(td.getText().isEmpty() || tm.getText().isEmpty() || tñ.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos","ERROR",JOptionPane.ERROR_MESSAGE);
			}else {
				try {
					int dia=Integer.parseInt(td.getText());
					int mes=Integer.parseInt(tm.getText());
					int año=Integer.parseInt(tñ.getText());
					
					String fecha="";
					if(dia<10)
						fecha+="0";
					fecha+=dia+"/";
					if(mes<10)
						fecha+=0;
					fecha+=mes+"/";
					fecha+=año;
					
					
					if(!FechaOk(dia, mes, año)) {
						JOptionPane.showMessageDialog(null, "la fecha "+fecha+" no es correcta","ERROR",JOptionPane.ERROR_MESSAGE);
					}else {
						int day,month,year;
						Date d=new Date();
						GregorianCalendar c=new GregorianCalendar();
						c.setTime(d);
						day=c.get(Calendar.DAY_OF_MONTH);
						month=c.get(Calendar.MONTH)+1; //calendar.month devuelve del 0 al 11
						year=c.get(Calendar.YEAR);
						
						boolean mayor=false;
						//años
						if((year-año)>18)
							mayor=true;
						else {
							if((year-año)==18) {
								if(mes<month) {
									mayor=true;
								}else if(mes==month) {
									if(dia<=day)
										mayor=true;
									else
										mayor=false;
								}else
									mayor=false;
							}else
								mayor=false;
						}
						
						
						
						if(mayor) {
							JOptionPane.showMessageDialog(null, "La persona nacida el "+fecha+" es MAYOR DE EDAD"," ",JOptionPane.INFORMATION_MESSAGE);
						}else {
							
							JOptionPane.showMessageDialog(null, "La persona nacida el "+fecha+" es MENOR DE EDAD"," ",JOptionPane.INFORMATION_MESSAGE);
						}
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "No has introducido una fecha correcta \nFormato: dd/mm/aaaa","ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
	}

}
