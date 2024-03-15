package ultimosrepasos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Comercial extends Empleado{
	
	//Atributo de clase
	private double comision;
	

	/**
	 * @param nombre
	 * @param edad
	 * @param salario
	 * @param comision
	 */
	public Comercial(String nombre, int edad, double salario,double comision) {
		super(nombre, edad, salario);
		this.comision=comision;
		fechaSueldo();
	}


	public void fechaSueldo() {
		Date d=new Date();
		GregorianCalendar g=new GregorianCalendar();
		g.setTime(d);
		
		int dia=g.get(Calendar.DAY_OF_MONTH);
		int m=g.get(Calendar.MONTH)+1;
		int a=g.get(Calendar.YEAR);
	
		String fecha="";
		if(dia<10)
			fecha+="0";
		fecha+=dia+"/";
		
		if(m<10)
			fecha+="0";
		
		fecha+=m+"/"+a;
		
		super.setFechaCobro(fecha);
		
		
	}


	public void Plus() {
		if(super.edad>30 && comision>200)
			super.salario+=PLUS;
	
		
	}


	@Override
	public String toString() {
		return super.toString()+"\nPuesto: Comercial [comision=" + comision + "$]";
	}

	
	
	
}
