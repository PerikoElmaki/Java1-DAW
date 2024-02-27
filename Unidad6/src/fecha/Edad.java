package fecha;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Date d=new Date();
		GregorianCalendar hoy=new GregorianCalendar();
		hoy.setTime(d);
		
		
		//Mostramos hoy
		System.out.println(d);
	
		
		int dia; int m; int a;
		System.out.println("Dime tu fecha de nacimiento: ");
		System.out.print("Dia: ");
		dia=sc.nextInt();
		System.out.print("Mes: ");
		m=sc.nextInt();
		System.out.print("Año: ");
		a=sc.nextInt();
		
		
		int edad=hoy.get(Calendar.YEAR)-a;
													//El MONTH VA DEL 0 al 11
		if(dia>hoy.get(Calendar.DAY_OF_MONTH) && m>=(hoy.get(Calendar.MONTH+1)))
			edad--;
		
		System.out.println("Tienes: "+edad+" años");
		
		sc.close();
	}

}
