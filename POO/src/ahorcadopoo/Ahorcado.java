package ahorcadopoo;

public class Ahorcado {
	//Constantes 
	public final int Totalintentos=10;
	//Atributos
	private String palabraAcertar;  //Palabra que debe acertar usuario
	private char[] palabraMostrar; 	//Palabra que se va mostrando al usuario,según acierte letras se eliminan *
	private int intentos; 			//Intentos hasta ahora
	private boolean acertada;		//True si el usuario acierta la palabra, false si no
	
	//--Constructor
	public Ahorcado() {
		this.palabraAcertar=PalabraAleatoria(); //Generamos palabra que debe acertar
		this.palabraMostrar=PalabraMostrar(); //Genera palabra para mostrar
		this.intentos=0;
		this.acertada=false;
	}
	
	/**
	 * Genera Palabra aleatoria de las guardadas en array
	 * @return
	 */
	private String PalabraAleatoria() {
		String[] array={"caca","perdedor","ahorcado","suspendido","aprobado","sinopsis","aleatorio"};
		String aleat=array[(int)(Math.random()*array.length)];
		return aleat;
	}
	/**
	 * Genera un array de carácteres con valores *
	 * @return array char
	 */
	private char[] PalabraMostrar() {
		char[] Mostrar=new char[palabraAcertar.length()];
		for(int i=0; i<palabraAcertar.length(); i++) {
			Mostrar[i]='*';
		}
		return Mostrar;
	}

	public int getTotalintentos() {
		return Totalintentos;
	}

	public String getPalabraAcertar() {
		return palabraAcertar;
	}
	/**
	 * Devuelve un string de lo que contiene el array de PalabraMostrar
	 * @return String cpn Palabra Mostrar
	 */
	public String getPalabraMostrar() {
		String Mostrar="";
		for(int i=0; i<palabraAcertar.length();i++) {
			Mostrar+=palabraMostrar[i];
		}
		return Mostrar;
	}

	public int getIntentos() {
		return intentos;
	}
	
	public boolean intentar(char letra) {
		
	}

	public boolean isAcertada() {
		return acertada;
	}
	
	
	

}
