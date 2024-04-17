import java.util.*;

public class ejresueltos {
	
	/**
	 * Función que determina si un año es bisiesto o no
	 * @return true si lo es,false si no 
	 */
	private boolean esBisiesto(int año) {
		if(año%4==0 && (año%400==0 || año%100!=0))
			return true;
		return false;
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
		System.out.println(fechaActual());

	}

}
