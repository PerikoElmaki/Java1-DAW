package fecha;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HoraActual {

	public static void main(String[] args) {
		Date d=new Date();
		GregorianCalendar ahora=new GregorianCalendar();
		ahora.setTime(d);
		
		int h=ahora.get(Calendar.HOUR_OF_DAY);
		int m=ahora.get(Calendar.MINUTE);
		int s=ahora.get(Calendar.SECOND);
		
		System.out.print(h+":");
		if(m<10)
			System.out.print("0");
		System.out.print(m+":");
		if(s<10)
			System.out.print("0");
		System.out.println(s);
	}

}
