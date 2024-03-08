package Empleados;

public abstract class Empleado {
	//COnstante 
	final protected int PLUS=300;
	//Atributos 
	protected String nombre;
	protected int Edad;
	protected double Salario;
	
	
	
	/**
	 * Constructor padre
	 * @param nombre
	 * @param edad
	 * @param salario
	 */
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		Edad = edad;
		Salario = salario;
	}
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el edad
	 */
	public int getEdad() {
		return Edad;
	}
	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		Edad = edad;
	}
	/**
	 * @return el salario
	 */
	public double getSalario() {
		return Salario;
	}
	/**
	 * @param salario el salario a establecer
	 */
	public void setSalario(double salario) {
		Salario = salario;
	}
	
	/**
	 * Método que se va a ampliar en las otras clases
	 */
	public abstract void Plus() ;
	
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Empleado nombre=" + nombre + ", Edad=" + Edad + ", Salario=" + Salario;
	}
		
	
		
	
	
}
