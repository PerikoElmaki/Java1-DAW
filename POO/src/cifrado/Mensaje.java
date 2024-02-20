package cifrado;

public class Mensaje {
	public final int CESAR=3;//cifrado cesar
	public final int ROT13=13; //rot 13
	
	private String mensaje;

	/**
	 * Constructor con parámetro que establece valor de mensaje 
	 * @param mensaje contenido del atributo 
	 */
	public Mensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * Devuelve el mensaje sin cifrar
	 * @return
	 */
	public String getMensaje() {
		return mensaje;
	}
	/**
	 * Establece el mensaje que se quiere guardar 
	 * @param mensaje 
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	/**
	 * Cifrado por sustitución
	 * Sustituye cada carácter del mensaje a cifrar por el carácter que ocupa 'clave' posiciones en adelante
	 * en el alfabeto
	 * Cualquier otro carácter(incluidos espacios) se copiarán igual, sin cifrar.
	 * Considera el alfabeto circular, despues de la Z va la A 
	 * @param clave a aplicar en el cifrado por sustitución
	 * @return criptograma al que se le ha aplicado el cifrado por sustitución
	 */
	public String Sustitucion(int clave) {
		String cifrado="";
		for(int i=0; i<mensaje.length(); i++) {
			int carac=mensaje.charAt(i);
			//Primero controlamos las mayúsculas, cambiarlas de pos
			if((char)carac>='A'&& (char)carac<='Z') {
				if(carac+clave>90) //si es mayor a la Z, que de la vuelta 
					cifrado+=(char)(carac+clave-25);
				else
					cifrado+=(char)(carac+clave);
			//Después las minúsculas 
			}else if((char)carac>='a'&& (char)carac<='z') {
				if(carac+clave>122)//si es mayor que la z
					cifrado+=(char)(carac+clave-25);
				else
					cifrado+=(char)(carac+clave);
			//Ahora copiamos espacios tal cual
			}else
				cifrado+=(char)(carac);
				
		}
		return cifrado;
	}
	
	public String descifradoSusti(String cifrado,int clave) {
		String descifrado="";
		for(int i=0; i<cifrado.length(); i++) {
			int carac=cifrado.charAt(i);
			if((char)carac>='A'&& (char)carac<='Z') {
				if((carac-clave)<60)
					descifrado+=(char)(carac-clave+25);
				else
					descifrado+=(char)(carac-clave);
			}else if((char)carac>='a'&& (char)carac<='z') {
				if((carac-clave)<97)
					descifrado+=(char)(carac-clave+25);
				else
					descifrado+=(char)(carac-clave);
			}else
				descifrado+=(char)(carac);
		}
		return descifrado;
	}
	/**
	 * Cifrado por la transposición de Riel
	 * El mensaje se cifra alternando las letras en dos cadenas separadas y concatenando las dos cadenas
	 * @return criptograma que se obtiene
	 */
	public String trasposicion() {
		String criptograma="";
		String par="";
		String impar="";
		for(int i=0; i<mensaje.length(); i++) {
			if(i%2==0)
				par+=mensaje.charAt(i);
			else
				impar+=mensaje.charAt(i);
		}
		criptograma=par+impar;
		return criptograma;
		
	}
	
	
}
