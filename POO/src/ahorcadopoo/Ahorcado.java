package ahorcadopoo;

public class Ahorcado {
	//Constantes 
	public final int Totalintentos=10;
	//Atributos
	private String palabraAcertar;  //Palabra que debe acertar usuario
	private char[] palabraMostrar; 	//Palabra que se va mostrando al usuario,según acierte letras se eliminan *
	private int intentos; 			//Intentos hasta ahora
	private boolean palabraAcertada;		//True si el usuario acierta la palabra, false si no
	
	//--Constructor
	public Ahorcado() {
		this.palabraAcertar=PalabraAleatoria().toUpperCase(); //Generamos palabra que debe acertar
		this.palabraMostrar=PalabraMostrar(); //Genera palabra para mostrar
		this.intentos=0;
		this.palabraAcertada=false;
	}
	
	/**
	 * Genera Palabra aleatoria de las guardadas en array
	 * @return
	 */
	private String PalabraAleatoria() {
		String[] array={"caca","restantes","cumpleaños","acertado"};
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


	/**
	 * Devuelve la palabra a acertar
	 * @return
	 */
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
	
	
	/**
	 * Que devuelva si acertada es true o false(si ha ganado)
	 * @return
	 */
	public boolean isAcertada() {
		return palabraAcertada;
	}
	/**
	 * Intenta si letra está en palabra acertar y tambien cambia el mostrar
	 * @param letra
	 * @return
	 */
	public boolean intentar(char letra) {
		intentos++;
		//Para controlar si cambia la palabra mostrar y que no pare el bucle (que revele todas las letras)
		//Creo una variable q almacene valor anterior y luego comparo
		String anterior=getPalabraMostrar();
		for(int i=0; i<palabraAcertar.length(); i++) {
			if(palabraAcertar.charAt(i)==letra) {
				palabraMostrar[i]=letra;
			}
		}
		if(anterior.equals(getPalabraMostrar())==false)
			return true; //si ha cambiado, entonces devuelve true
		
		//comprobamos también si están todas las palabras y hemos acertado todas 
		if(palabraAcertar.equals(palabraMostrar.toString()))
			palabraAcertada=true;
	
		return false;
	}
	
	public boolean resolver(String palabra) {
		intentos++;
		if(palabraAcertar.equals(palabra))
			palabraAcertada=true;
		return palabraAcertada;
	}
	
	

}
