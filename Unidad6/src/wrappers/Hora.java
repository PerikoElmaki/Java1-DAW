package wrappers;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class Hora {

	public static void main(String[] args) {
		
		//Ponemos otra hora
		GregorianCalendar hora=new GregorianCalendar(2000,11,31,9,5,9);
		
		System.out.print(hora.get(Calendar.HOUR)+":");
		
		if(hora.get(Calendar.MINUTE)<10)
			System.out.print("0"+hora.get(Calendar.MINUTE)+":");
		else
			System.out.print(hora.get(Calendar.MINUTE)+":");
		if(hora.get(Calendar.SECOND)<10)
			System.out.print("0"+hora.get(Calendar.SECOND));
		else	
			System.out.print(hora.get(Calendar.SECOND));
		
	}

}
