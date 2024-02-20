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
			//Primero controlamos las mayúsculas, cambiarlas de pos
			if(mensaje.charAt(i)>='A'&& mensaje.charAt(i)<='Z') {
				int carac=mensaje.charAt(i)+clave;
				if((char)carac>'Z') //si es mayor a la Z, que de la vuelta 
					carac-=26;
				cifrado+=(char)carac;
			//Después las minúsculas 
			}else if(mensaje.charAt(i)>='a'&& mensaje.charAt(i)<='z') {
				int carac=mensaje.charAt(i)+clave;
				if((char)carac >'z')//si es mayor que la z
					carac-=26;
				cifrado+=(char)carac;
			//Ahora copiamos espacios tal cual
			}else
				cifrado+=mensaje.charAt(i);
				
		}
		return cifrado;
	}

	public String DescifrarSustitucion(int clave) {

		String criptograma="";
		for (int i = 0; i < mensaje.length(); i++) {
			if (mensaje.charAt(i)>='A' && mensaje.charAt(i)<='Z') {
				int caracter=mensaje.charAt(i)-clave;
				if ((char)caracter<'A') 
					caracter+=26; //sumando A la a para volver a emprezar
				criptograma+=(char)caracter;
			}
			//controlar de la 'a' a la 'z' y que sea circular 
			else if (mensaje.charAt(i)>='a' && mensaje.charAt(i)<='z') {
				int caracter=mensaje.charAt(i)-clave;
				if ((char)caracter<'a') 
					caracter+=26; //sumando a la a para volver a emprezar
				criptograma+=(char)caracter;
			}
			else
				criptograma+=mensaje.charAt(i);		// dejar los otros caracteres fuera del rango igual

		}
		return criptograma;

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
