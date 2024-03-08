package agenda;

public class Contacto {
	//Atributos 
	protected String nombre;
	protected int telefono;
	
	/**C
	 *COnstructor con parámetros
	 * @param nombre
	 * @param telefono
	 */
	public Contacto(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	/**
	 * Constructor vacio 
	 */
	public Contacto() {
		this.nombre="";
		this.telefono=0;
	}

	/**
	 * Devuelve el atributo nombre
	 * @return el nombre String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el atributo nombre
	 * @param  el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el atributo telefono
	 * @return el telefono int
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Establece el telefono 
	 * @param el telefono a establecer- int
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	/**
	 * Método que indica si un contacto es igual a otro 
	 * teniendo en cuenta su nombre(si son iguales)
	 * @param n nombre a comparar
	 * @return true si son iguales, false si no 
	 */
	public boolean nombreIgual(String n) {
		if(nombre.equals(n))
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
}
