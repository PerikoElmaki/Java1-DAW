package Empleados;

public class Comercial extends Empleado {
	
	//Atributos de clase 
	private double comision;
	
	/**
	 * COnstruictor con todos los param
	 * @param comision
	 * @param n
	 * @param e
	 * @param sal
	 */
	public Comercial(double comision,String n,int e,double sal) {
		this.comision = comision;
		super.Edad=e;
		super.nombre=n;
		super.Salario=sal;
		//TODO implementar plus?
	}

	/**
	 * @param comision el comision a establecer
	 */
	public void setComision(double comision) {
		this.comision = comision;
	}
	/**
	 * Método que aumenta el salario del comercial si su edad es 30 
	 * y su comisión es mayor de 200
	 */
	public void Plus() {
		if(super.Edad>30 && comision>200)
			super.Salario+=PLUS;
	}
	
	
	

	
}
