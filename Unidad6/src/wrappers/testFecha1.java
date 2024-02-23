package wrappers;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class testFecha1 {

	public static void main(String[] args) {
		// Creamos f con la fecha 31 de diciembre de 2000, a las 23:55:59
											//formato: año,mes,dia,hora,minutos,segundo
		GregorianCalendar f=new GregorianCalendar(2000,11,31,23,55,59); //poner todos los parámetros
		System.out.println(f.get(Calendar.YEAR)); //2000
		System.out.println(f.get(Calendar.MONTH)); //11
		System.out.println(f.get(Calendar.DAY_OF_YEAR));// 366(bisiesto)

		System.out.println(f.get(Calendar.HOUR));  //mostrará 11
		System.out.println(f.get(Calendar.MINUTE)); 
		System.out.println(f.get(Calendar.SECOND));
	}

}
