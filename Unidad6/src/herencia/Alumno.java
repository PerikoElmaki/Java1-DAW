package herencia;

public abstract class Alumno {
	//Constante
	public final int horaslectivas=30;
	
	//Atributos 
	private String nombre; //Nombre del almuno 
	private int horas; //horas lectivas 
	private String curso; //al que asiste el alumno 
	
	/**
	 * COnstructor con tres parámetros
	 * @param n nombre 
	 * @param h horas lectivas
	 * @param c cruso 
	 */
	public Alumno(String n,int h, String c) {
		this.nombre=n;
		this.horas=h;
		this.curso=c;
	}
	
	/**
	 * COnstructor con nombre y curso, horas lectivas por defecto
	 * @param nombre 
	 * @param curso
	 */
	public Alumno(String nombre, String curso) {
		this.nombre = nombre;
		this.horas = horaslectivas;
		this.curso = curso;
	}
	/**
	 * Devuelve el nombre del alumno
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Establece el nombre del almuno 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * DEvuelve el n de horas del alumno 
	 * @return numero horas 
	 */
	public int getHoras() {
		return horas;
	}
	/**
	 * Establece horas lectivas 
	 * @param horas
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}
	/**
	 * Devuelve el nombre del curso 
	 * @return nombre curso 
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * Establece nombre del curso 
	 * @param curso
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	/**
	 * Método toString que muestra el valor de todos los atributos del objeto
	 */
	@Override
	public String toString() {
		return "\nAlumno : "+ nombre + "\nCurso: " + curso +" (" + horas +"horas lectivas)\n";
	}
	
	//Método abstracto
	public abstract int horasTotales();
	
	
}
