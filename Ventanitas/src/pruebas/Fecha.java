package pruebas;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Fecha extends JFrame{
	//Componentes 
	JLabel labelVentana;
	JButton boton;
	JPanel panel1,panel2;
	
	public Fecha() {
		
		
		labelVentana=new JLabel(fechaActual());
		labelVentana.setFont(new Font("JetBrains Mono", Font.ITALIC,50));
		labelVentana.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		//el border, sin espacios entre objetos 
		setLayout(new BorderLayout(0,0));
		add(labelVentana,BorderLayout.CENTER);
		
	}
	
	public static String fechaActual() {
		String fecha="";
		Date d=new Date();
		GregorianCalendar g=new GregorianCalendar();
		g.setTime(d);
		
		int dia=g.get(Calendar.DAY_OF_MONTH);
		int mes=g.get(Calendar.MONTH)+1; //Meses van del 0 al 11
		int ano=g.get(Calendar.YEAR);
		int diaweek=Calendar.DAY_OF_WEEK;
		
		String diasem="";
		//Dia de la semana letras
		switch(diaweek) {
			case 1: diasem="Lunes ";break;
			case 2: diasem="Martes ";break;
			case 3: diasem="Miercoles ";break;
			case 4: diasem="Jueves ";break;
			case 5: diasem="Viernes ";break;
			case 6: diasem="Sábado ";break;
			case 7: diasem="Domingo ";break;
		}
		
		fecha+=diasem;
		
		if(dia<10)
			fecha+=" 0";
		fecha+=dia+"/";
		
		if(mes<10)
			fecha+="0";
		fecha+=mes+"/";
		
		fecha+=ano;
	
		return fecha;
	}
	
	public static void main(String[] args) {
		Fecha f=new Fecha();
		f.setTitle("Fecha");
		f.setSize(700,150);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
