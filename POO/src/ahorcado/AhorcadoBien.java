package ahorcado;

import java.util.Scanner;

public class AhorcadoBien {
	/**
	 * Genera Palabra aleatoria de las guardadas en array
	 * @return
	 */
	public static String PalabraAleatoria() {
		String[] array={"calvo","perdedor","ahorcado","suspendido","aprobado","sinopsis","aleatorio"};
		String aleat=array[(int)(Math.random()*array.length)];
		return aleat;
	}
	
	public static void main(String[] args) {
		final int TOTALintentos=10;
		int intentos=0;
		String palabraAcertar="HOLA"; //palabra que se debe acertar 
		char[] palabraMostrar =new char[palabraAcertar.length()]; 			//Palabra que mostramos al usuario(tiene *)
		String cadena; 					//Cadena que va a intrudocir el usuario 
		char letra; 					//letra a comprobar si esta en palabra acertada
		boolean acertada=false;          //TRUE si el usuario ha acertado la palabra,false si no 	

		
		for(int i=0;i<palabraAcertar.length(); i++) {
			palabraMostrar[i]='*';
		}
		System.out.println("Numero de letras de la palabra a acertar: "+palabraAcertar.length());
		Scanner sc=new Scanner(System.in);
		try {
			while(intentos<TOTALintentos && !acertada) {
				//Mostramos mensajes
				System.out.print("\nPalabra a acertar: ");
				for(int i=0;i<palabraAcertar.length(); i++) {
					System.out.print(palabraMostrar[i]);
				}
				
				System.out.println("\nIntentos realizados: "+intentos);
				System.out.println("Intentos restantes: "+(TOTALintentos-intentos));
				
				//PEdimos usuario que introduzca 
				System.out.print("Introduce una letra: ");
				cadena=sc.nextLine().toUpperCase();
				if(cadena.compareTo("RESUELVO:")==0) {
					System.out.print("\nPrueba: ");
					String prueba=sc.nextLine().toUpperCase();
					if(prueba.compareTo(palabraAcertar)==0)
						acertada=true;
					else
						intentos++;
				}else {
					letra=cadena.charAt(0);
					//para controlar si hay mas de una acertada
					boolean letrabien=false;
					//comprobamos si está la letra 
					for(int i=0;i<palabraAcertar.length(); i++) {
						if(palabraAcertar.charAt(i)==letra) {
							palabraMostrar[i]=letra;
							letrabien=true;
						}
					}
					if(letrabien)
						System.out.println("ACERTASTE ");
					else
						System.out.println("Sigue intentandolo");
					
					//aumentan los intentos 
					intentos++;
				}
				
			}
			if(acertada)
				System.out.println("HAS ACERTADOOOOOOOOOOOOOOOOOOOOOOO LA PLABRA ERA "+palabraAcertar);
			else
				System.out.println("HAS PERDIDO MAMARRACHO, LA PALABRA ERA "+palabraAcertar);
			
			
			
			
		} catch (Exception e) {
			System.err.println("ERROR en la intro de datos ");
		}
		sc.close();
	}

}
