package ahorcado;

import java.awt.geom.GeneralPath;

public class Ahorcado {
	final static int INTENTOS=10;
	/**
	 * Genera Palabra aleatoria de las guardadas en array
	 * @return
	 */
	public static String PalabraAleatoria() {
		String[] array={"Calvo","Perderor","Ahorcado","Suspendido","Aprobado","Sinopsis","Aleatorio"};
		String aleat=array[(int)(Math.random()*array.length)];
		return aleat;
	}
	
	/**
	 * Cifrado
	 * @param args
	 */
	public static String Cifrado(String palabra) {
		String cifrado="";
		for(int i=0; i<palabra.length(); i++) {
			cifrado+="*";
		}
		return cifrado;
	}
	
	public static String Descifrado(String palabra,char c) {
		
	}
	
	public static void main(String[] args) {
		//Variables
		int intentos=0;
		String palabraAcertar=PalabraAleatoria(); //palabra que se debe acertar 
		String palabraMostrar=""; 			//Palabra que mostramos al usuario(tiene *)
		String cadena; 					//Cadena que va a intrudocir el usuario 
		char letra; 					//letra a comprobar si esta en palabra acertada
		boolean acertada;          //TRUE si el usuario ha acertado la palabra,false si no 
		
		

	}

}
