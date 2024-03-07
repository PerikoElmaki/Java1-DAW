package serievideojueg;


public class Serie implements Entregable{
	//Constantes 
	private final static int N_TEMP=3;
	
	//Atributos 
	private String titulo;
	private int numtemporadas;
	private String genero;
	private String creador;
	private boolean prestado;
	
	/**
	 * Constructor por defecto 
	 */
	public Serie() {
		titulo="";
		numtemporadas=N_TEMP;
		genero="";
		creador="";
		prestado=false;
	}
	
	/**
	 * Constructor con dos parámetros
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		numtemporadas=N_TEMP;
		genero="";
		prestado=false;
	}

	/**
	 * Constructor con todos los parámetros 
	 * @param titulo
	 * @param numtemporadas int 
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int numtemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numtemporadas = numtemporadas;
		this.genero = genero;
		this.creador = creador;
		this.prestado = false;
	}

	
	
	
	
	/**
	 * Devuelve el titulo de la serie 
	 * @return el titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Establece titulo de serie 
	 * @param titulo el titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Devuelve el numero de temporadas 
	 * @return el numtemporadas
	 */
	public int getNumtemporadas() {
		return numtemporadas;
	}

	/**
	 * Establece el numero de temporadas
	 * @param  el numtemporadas a establecer
	 */
	public void setNumtemporadas(int numtemporadas) {
		this.numtemporadas = numtemporadas;
	}

	/**
	 * Devuelve el genero de la serie 
	 * @return el genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Establece el genero de la serie 
	 * @param genero el genero a establecer
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Devuelve el creador de la serie 
	 * @return el creador
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * Establece el creador de la serie 
	 * @param el creador a establecer
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	/**
	 * Cambia el estado de prestado a true
	 */
	public void entregar() {
		prestado=true;
	}

	/**
	 * Cambia el estado de prestado a false
	 */
	public void devolver() {
		prestado=false;
		
	}

	/**
	 * Indica el estado de prestado(true o false)
	 */
	public boolean isPrestado() {
		return prestado;
	}
	
	/**
	 * Método toString que imprime los atributos 
	 */
	@Override
	public String toString() {
		if(titulo.equals(""))
			return "Serie sin información registrada";
		else
			return "Serie '"+ titulo +"', ("+ creador + "), numtemporadas=" + numtemporadas + ", genero=" + genero + ", creador="
			 + ", prestado=" + prestado + "]";
	}
	
}
