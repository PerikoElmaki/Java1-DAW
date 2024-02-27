package fecha;

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
		String d=""; String m=""; 
		if(dia<10)
			d+="0"+dia;
		else
			d+=dia;
		if(mes<10)
			m+="0"+mes;
		else
			m+=mes;
		
		String fecha=d+"/"+m+"/"+año;
		return fecha;
	}
	/**
	 * Indica si una fecha es correcta 
	 * No tiene en cuenta años bisiestos 
	 * @return true si lo es, false si no 
	 */
	public boolean isValid() {
		int diasdelmes;
		if(año==0)
			return false;
		if(mes<1 || mes>12)
			return false;
		
		//Controlamos dias del mes 
		if(mes==4 || mes==6 || mes==9 || mes==11)
			diasdelmes=30;
		else if(mes==2)
			diasdelmes=28;
		else     //los que quedan 
			diasdelmes=31;
		
		//Probamos 
		if(dia<1 || dia>diasdelmes)
			return false;
		
		//Si no da false antes, entonces true
		return true;
	}
	/**
	 * Establece como fecha la fecha actual del sistema 
	 */
	public void setFechaActual() {
		Date f=new Date(); // coge todo de fecha actual, incluido segundos 
		GregorianCalendar c=new GregorianCalendar();
		c.setTime(f);
		dia=c.get(Calendar.DAY_OF_MONTH);
		mes=c.get(Calendar.MONTH)+1;
		año=c.get(Calendar.YEAR);
	}
	


}
