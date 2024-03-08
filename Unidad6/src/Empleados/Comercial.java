package Empleados;

public class Comercial extends Empleado {
	
	//Atributos de clase 
	private double comision;
	
	/**
	 * Constructor comercial, utilizando param de empleado
	 * @param nombre
	 * @param edad
	 * @param salario
	 */
	public Comercial(Double com,String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		comision=com;
		
	}

	/**
	 * Establecela comision
	 * @param comision el comision a establecer
	 */
	public void setComision(double comision) {
		this.comision = comision;
	}

	/**
	 * Devuelve la comisiion
	 * @return el comision
	 */
	public double getComision() {
		return comision;
	}
	
	/**
	 * Método que aumenta el salario del comercial si su edad es 30 
	 * y su comisión es mayor de 200
	 */
	public void Plus() {
		if(super.Edad>30 && comision>200)
			super.Salario+=PLUS;
	}

	/**
	 * Aprovecha el toString de empleado
	 */
	@Override
	public String toString() {
		return "Comercial: "+super.toString()+", comision="+ comision ;
	}

	
	
	

	
}
