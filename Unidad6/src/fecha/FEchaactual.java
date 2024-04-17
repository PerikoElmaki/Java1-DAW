package fecha;

import java.util.GregorianCalendar;
import java.util.*;
public class FEchaactual {
	

	public static void main(String[] args) {
		Date d=new Date();
		GregorianCalendar c=new GregorianCalendar();
		c.setTime(d);// coge los parámetros de la fecha actual
		
		int dia=c.get(Calendar.DAY_OF_MONTH);
		int mes=c.get(Calendar.MONTH)+1; //Meses van del 0 al 11
		int ano=c.get(Calendar.YEAR);
		System.out.println("Fecha: "+dia+"-"+mes+"-"+ano);

	}

}
