package boletin;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
	//Atributos 
	private int day;
	private int month;
	private int year;
	
	/*
	 * COnstructor por defecto que establece la fecha actual del sistema
	 */
	public Fecha() {
		fechaActual();
	}
	/**
	 * Constructor con parámetros para los atributos de la calse
	 * @param d dia 
	 * @param m mes 
	 * @param y año 
	 */
	public Fecha(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}
	/**
	 * Procedimiento que establece la fecha actual del sistema
	 */
	public void fechaActual() {
		Date d=new Date();
		GregorianCalendar c=new GregorianCalendar();
		c.setTime(d);
		day=c.get(Calendar.DAY_OF_MONTH);
		month=c.get(Calendar.MONTH)+1; //calendar.month devuelve del 0 al 11
		year=c.get(Calendar.YEAR);
	}
	
	/**
	 * Devuelve el valor del atributo day
	 * @return dia int
	 */
	public int getDay() {
		return day;
	}
	/**
	 * Establece el valor del atributo day
	 * @param day
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * Devuelve el valor del atributo month
	 * @return int mes 
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * Establece el valor del atributo month
	 * @param month int 
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * Devuelve el valor del atributo year
	 * @return int year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * Establece el valor del atributo year
	 * @param year 
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * Método que devuelve un String con el contenido de los atributos del objeto, y el mes con su nombre
	 */
	@Override
	public String toString() {
		String fecha="";
		fecha+=day+" de ";
		
		switch (month) {
			case 1:fecha+="enero";break;
			case 2:fecha+="febrero";break;
			case 3:fecha+="marzo";break;
			case 4:fecha+="abril";break;
			case 5:fecha+="mayo";break;
			case 6:fecha+="junio";break;
			case 7:fecha+="julio";break;
			case 8:fecha+="agosto";break;
			case 9:fecha+="septiembre";break;
			case 10:fecha+="octubre";break;
			case 11:fecha+="noviembre";break;
			case 12:fecha+="diciembre";break;
			default:fecha+="¿¿??";break;
		}
		
		fecha+=" de "+year;
		
		return fecha;
	}
	
	/**
	 * Función que determina si un año es bisiesto o no, para utilizarla en isValid
	 * @return true si lo es,false si no 
	 */
	private boolean esBisiesto() {
		if(year%4==0 && (year%400==0 || year%100!=0))
			return true;
		return false;
	}
	/**
	 * Función que establece si la fecha del objeto es correcta, controlando años bisiestos 
	 * @return true si es correcta,false si no
	 */
	public boolean isValid() {
		
		if(year==0)
			return false;
		
		if(month<1 || month>12)
			return false;
		
		
		int diasdelmes;
		
		if(month==4 || month==6 || month==9 || month==11)
			diasdelmes=30;
		else if(month==2) {
			if(esBisiesto()) 
				diasdelmes=29;
			else
				diasdelmes=28;
		}else 
			diasdelmes=31;
		
		
		if(day>diasdelmes)
			return false;
		
	
		return true;
	}
	
	
	
	
}
