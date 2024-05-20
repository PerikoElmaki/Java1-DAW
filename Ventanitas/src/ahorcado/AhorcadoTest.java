package ahorcado;

import java.util.Scanner;

public class AhorcadoTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ahorcado h=new Ahorcado();
		System.out.println("------------------AHORCADO----------------");
		System.out.println("Numero de letras de la palabra a acertar: "+h.getPalabraAcertar().length());
		String pedir="";
		
		char letra;
		
		while(!h.isAcertada() && h.getIntentos()<h.Totalintentos) {
			System.out.print("\nPalabra a acertar: "+h.getPalabraMostrar());
			System.out.println("\nIntentos realizados: "+h.getIntentos());
			System.out.println("Intentos restantes: "+(h.Totalintentos-h.getIntentos()));
			System.out.print("Introduce una letra: ");
			pedir=sc.nextLine().toUpperCase();
			
			if(pedir.length()>7 && pedir.substring(0,8).equals("RESUELVO")){
				if(h.resolver(pedir.substring(9)))
					System.out.println("HAS GANADOOOOO LA palñabra era"+h.getPalabraAcertar());
			}else {
				letra=pedir.charAt(0);
				if(h.intentar(letra))
					System.out.println("ACERTASTE, "+letra+" se encuentra en la palabra a acertar");
				else
					System.out.println("Tas colao sigue intentandolo");
			}
					
		}
		
		
		
		
		sc.close();

	}

}
