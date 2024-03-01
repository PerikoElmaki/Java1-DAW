package polimorfismo;

public class Encargado extends Empleado{
	
	/**
	 * Devuelve el sueldo base del encargado, puede acceder al atributo sueldoBase porque es protected y no private
	 * los encargados cobran un 10% más del sueledo base
	 * 
	 */
	public int getSueldoBase() {
		return (int)(sueldoBase*1.1);
	}
}
