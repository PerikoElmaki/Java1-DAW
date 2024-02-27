package repaso;

import java.util.*;


public class Fecha {	
	//Atributos 
	private int dia;
	private int mes;
	private int año;
	
	/*
	 * COnstructor  por defecto 
	 */
	public Fecha() {
		dia=1;
		mes=1;
		año=2000;
	}
	/**
	 * Constructor con `parámetros 
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	/**
	 * Devuelve el n del dia
	 * @return
	 */
	public int getDia() {
		return dia;
	}
	
	/**
	 * Establece el n del dia
	 * @param dia a establecer
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	/**
	 * Devuelve el n del mes
	 * @return n mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * Establece el n del mes
	 * @param mes a establecer
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	/**
	 * Devuelve el n del dia
	 * @return
	 */
	public int getAño() {
		return año;
	}
	/**
	 * Establece el año
	 * @param año a establecer
	 */
	public void setAño(int año) {
		this.año = año;
	}
	
	/**
	 * Devuelve un String que contiene la fecha, controlando los 0 si son menores que 10
	 * Formato dd/mm/aaaa
	 */
	@Override
	public String toString() {
		String fecha="";
		
		if(dia<10)
			fecha+=0;
		
		fecha+=dia+"/";
		
		if(mes<10)
			mes+=0;
		
		fecha+=mes+"/";
		
		fecha+=año;
		
		return fecha;
	}
	/**
	 * Función que determina si un año es bisiesto o no
	 * @return true si lo es,false si no 
	 */
	private boolean esBisiesto() {
		if(año%4==0 && (año%400==0 || año%100!=0))
			return true;
		return false;
	}
	
	/**
	 * Indica si una fecha es correcta 
	 * Tiene en cuenta años bisiestos 
	 * @return true si lo es, false si no 
	 */
	public boolean esCorrecta() {
		//Controlamos que no sea año 0
		if(año==0)
			return false;
		//meses
		if(mes<1 || mes>12)
			return false;
		//dias del mes, según mes y año 
		int diasdelmes;
		
		if(mes==4 || mes==6 || mes==9 || mes==11)
			diasdelmes=30;
		else if(mes==2) {
			if(esBisiesto()) //febrero en año bisiesto
				diasdelmes=29;
			else
				diasdelmes=28;
		}else //resto de meses
			diasdelmes=31;
		
		//controlamos finalmente 
		if(dia>diasdelmes)
			return false;
		
		//Si no ha devuelto anteriormente false, ahora si
		return true;
	}


	/**
	 * Establece como fecha la fecha actual del sistema 
	 */
	public void fechaActual() {
		Date d=new Date();
		GregorianCalendar c=new GregorianCalendar();
		c.setTime(d);
		dia=c.get(Calendar.DAY_OF_MONTH);
		mes=c.get(Calendar.MONTH)+1; //calendar.month devuelve del 0 al 11
		año=c.get(Calendar.YEAR);
	}
	
	/**
	 * Función que devuelve el número de días transcurridos en el año introducido hasta la fecha
	 * @return número de días hasta la fecha introducida
	 */
	public int contaDias() {
		int suma=0;
		for(int i=1; i<mes; i++) {
			if(i==4 || i==6 || i==9 ||i==11)
				suma+=30;
			else if(i==2) {
				if(esBisiesto())
					suma+=29;
				else
					suma+=28;
			}else
				suma+=31;
		}
			
		return suma+dia;
	}


}
