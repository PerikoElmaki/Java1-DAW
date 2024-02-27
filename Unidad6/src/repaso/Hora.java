package repaso;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Hora {
	private int hora;
	private int min;
	private int sec;
	
	/**
	 * Constructor Hora por defecto
	 */
	public Hora() {
		hora=10;
		min=0;
		sec=0;
	}
	/**
	 * Constructor con param
	 * @param h hora
	 * @param m min
	 * @param s sec
	 */
	public Hora(int h,int m,int s) {
		hora=h;
		min=m;
		sec=s;
		
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	
	/**
	 * Método que imprime los atributos del objeto 
	 */
	@Override
	public String toString() {
		String hora="";
		if(this.hora<10)
			hora+=0;
		
		hora+=this.hora+":";
		
		/**
		 * SI hay que controlar que salgan las horas 10(de la noche) en vez de 22
		 * if(this.hora>12)
		 * 	hora+=(this.hora-12);      le restas 12 horas cuando sean más de las 12 
		 */
		
		// Si hay que controlar que las 24 sean 00 
		/*
		 * if(this.hora==24)
		 * 	hora+=00+":"
		 */
		 
		if(min<10)
			hora+=0;
		hora+=min+":";
		
		if(sec<10)
			hora+=0;
		hora+=sec;
			
		return hora;
	}
	/**
	 * Método que determina si la hora del objeto es correcta 
	 * @return true si lo es, false si no
	 */
	public boolean esCorrecta() {
		if(hora<0 || hora>24)
			return false;
		if(min<0 || min>59)
			return false;
		if(sec<0 || sec>59)
			return false;
		
		return true;
	}
	
	/**
	 * Procedimiento que suma un segundo al objeto Hora
	 */
	public void sigSec() {
		sec++;
		if(sec>59) {
			sec=0;
			min++;
			if(min>59) {
				min=0;
				hora++;
				if(hora>23) { //para que salga 00
					hora=0;
				}
			}
		}
			
	}
	
	public void horaActual() {
		Date d=new Date();
		GregorianCalendar c=new GregorianCalendar();
		c.setTime(d);
		hora=c.get(Calendar.HOUR);
		min=c.get(Calendar.MINUTE);
		sec=c.get(Calendar.SECOND);
	}
	/**
	 * Función que devuelve los minutos pasados del día hasta la hora del objeto
	 * @return
	 */
	public int contaMin() {
		return (hora*60)+min;
	}
	
	
	

}
