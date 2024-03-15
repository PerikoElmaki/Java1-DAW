package ultimosrepasos;

public abstract class Empleado {

	//Constante 
	final protected int PLUS=300;

	//atributos 
	protected String nombre;
	protected int edad;
	protected double salario;
	protected String fechaCobro;
	
	/**
	 * COnstructor 
	 * @param nombre
	 * @param edad
	 * @param salario
	 */
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		fechaCobro="";
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
		return edad;
	}


	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * @return el salario
	 */
	public double getSalario() {
		return salario;
	}


	/**
	 * @param salario el salario a establecer
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract void Plus();
	


	/**
	 * @return el fechaCobro
	 */
	public String getFechaCobro() {
		return fechaCobro;
	}


	/**
	 * @param fechaCobro el fechaCobro a establecer
	 */
	public void setFechaCobro(String fechaCobro) {
		this.fechaCobro = fechaCobro;
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario +"Fecha de pagamenta: "+fechaCobro+"]";
	}
	
	

}
