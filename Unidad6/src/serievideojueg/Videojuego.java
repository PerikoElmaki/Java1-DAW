package serievideojueg;

public class Videojuego implements Entregable{
	//Constantes 
	final static private int HORAS=100;
	
	//Atributos 
	private String titulo;
	private int horas_estimadas;
	private String genero;
	private String desarrollador;
	private boolean prestado;
	
	/**
	 * Constructor por defecto 
	 */
	public Videojuego() {
		titulo="";
		genero="";
		desarrollador="";
		horas_estimadas=HORAS;
		prestado=false;
	}
	
	
	/**
	 * Constructor con dos parámetros 
	 * @param titulo
	 * @param desarrollador
	 */
	public Videojuego(String titulo, String desarrollador) {
		this.titulo = titulo;
		this.desarrollador = desarrollador;
		genero="";
		horas_estimadas=HORAS;
		prestado=false;
	}


	/**
	 * Constructor con todos los parámetros 
	 * @param titulo
	 * @param horas_estimadas
	 * @param genero
	 * @param desarrollador
	 */
	public Videojuego(String titulo, int horas_estimadas, String genero, String desarrollador) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.genero = genero;
		this.desarrollador = desarrollador;
	}


	

	/**
	 * Devuelve el titulo
	 * @return el titulo
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * Establece titulo
	 * @param titulo el titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * Devuelve el n de horas estimadas
	 * @return el horas_estimadas
	 */
	public int getHoras_estimadas() {
		return horas_estimadas;
	}


	/**
	 * Establece horas estimadas
	 * @param horas_estimadas el horas_estimadas a establecer
	 */
	public void setHoras_estimadas(int horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}


	/**
	 * Devuelve el genero del videojuego
	 * @return el genero
	 */
	public String getGenero() {
		return genero;
	}


	/**
	 * Establece genero 
	 * @param genero el genero a establecer
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}


	/**
	 * DEvielve el desarrolador
	 * @return el desarrollador
	 */
	public String getDesarrollador() {
		return desarrollador;
	}


	/**
	 * Establece el desarrollador
	 * @param desarrollador el desarrollador a establecer
	 */
	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}


	/**
	 * 
	 */
	public void entregar() {
		prestado=true;
		
	}

	
	public void devolver() {
		prestado=false;
		
	}

	
	public boolean isPrestado() {
		
		return prestado;
	}


	@Override
	public String toString() {
		if(titulo.equals(""))
			return "Videojuego sin información registrada";
		else
			return "Videojuego '"+ titulo +"', ("+ desarrollador+ "), horas estimadas=" + horas_estimadas + ", genero=" + genero + ", creador="
			 + ", prestado=" + prestado + "]";
	}
	
	
	
}
