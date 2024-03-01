package herencia;

public class Doctorado extends Alumno {
	//constantes
	public final int hsemanalesdoc=10;
	//Atributos 
	private int horas_tesis;
	private String nombretesis;
	/**
	 * Constructor utilizando 5 parámetros
	 * @param n param clase padre
	 * @param h param clase padre
	 * @param c param clase padre 
	 * @param hsemanales
	 * @param nombretesis
	 */
	public Doctorado(String n, int h, String c, int hsemanales, String nombretesis) {
		super(n, h, c);
		this.horas_tesis = hsemanales;
		this.nombretesis = nombretesis;
	}
	/**
	 * Devuelve el n de horas semanales 
	 * @return
	 */
	public int getHorastesis() {
		return horas_tesis;
	}
	/**
	 * Establece horas tesis
	 * @param hsemanales
	 */
	public void setHorastesis(int hsemanales) {
		this.horas_tesis = hsemanales;
	}
	/**
	 * DEvuelve nombre de tesis 
	 * @return nombre tesis 
	 */
	public String getNombretesis() {
		return nombretesis;
	}
	/**
	 * Establece nombre tesis
	 * @param nombretesis
	 */
	public void setNombretesis(String nombretesis) {
		this.nombretesis = nombretesis;
	}
	
	
	
}
