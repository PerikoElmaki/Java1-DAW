package Empleados;

public class Repartidor extends Empleado{

	//Atributo 
	private String zona;
	
	
	/**
	 * Constructor utilizando los parámetros de Empleado
	 * @param nombre
	 * @param edad
	 * @param salario
	 */
	public Repartidor(String zona,String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		this.zona=zona;
	}

	/**
	 * Devuleve el atributo zona
	 * @return el zona
	 */
	public String getZona() {
		return zona;
	}


	/**
	 * Establece la zona
	 * @param zona el zona a establecer
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}

	/**
	 * Ampliamos de clase abstract, si tiene mas de 25 años y reparte 
	 * en la zona 3, recibirá plus
	 */
	public void Plus() {
		if(super.Edad<25 && zona.equalsIgnoreCase("zona 3"))
			super.Salario+=PLUS;
		
	}

	/**
	 * Aprovecha el Tostring de empleado
	 */
	@Override
	public String toString() {
		return "Repartidor: "+super.toString()+",zona= "+ zona ;
	}
	
	
	
}
