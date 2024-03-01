package polimorfismo;

public class Empleado extends Persona { //Clase hija de Persona 
	
	protected int sueldoBase; //el protected solo es utilizable por clases del mismo paquete
	
	/**
	 * Devuelve el sueldo base del empleado 
	 * @return sueldo base 
	 */
	public int getSueldoBase() {
		return sueldoBase;
	}

	/**
	 * Establece el sueldo base del empleado
	 * @param sueldoBase
	 */
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	
}
