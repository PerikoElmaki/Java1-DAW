package cifrado;

import java.util.Scanner;

public class Ahorcado2 {
	/**
	 * Devuelve un string aleatorio almacenado en el array 
	 * @return
	 */
	public static String palabra() {
		String[] a= {"Ahorcado","Chulisima","Suspendido","Amorfo","Merychirismas"};
		return a[(int)(Math.random()*a.length)];
	}
	public static boolean encontrado(String a,char c) {
		for(int i=0; i<a.length(); i++){
			if(a.charAt(i)==c)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tries=10;
		String palabra=palabra();
		char[] acertadas=new char[palabra.length()];
		for(int i=0; i<palabra.length(); i++) {
			acertadas[i]='*';
		}
		boolean win=false;
		char c;
		try {
			while(win==false || tries>0){
				System.out.print("Palabra: ");
				for(int io=0; io<acertadas.length; io++) {
					System.out.print(acertadas[io]);
				}
				System.out.println("\nIntentos: "+tries);
				System.out.print("Dime carácter: ");
				String pedir=sc.nextLine();
				c=pedir.charAt(0);
				if(pedir=="RESUELVE:") {
					System.out.print("Prueba: ");
					String prueba=sc.nextLine();
					if(prueba.compareTo(palabra)==0)
						win=true;
				}else {
					boolean acierto = false;
					for(int j=0; j<palabra.length(); j++) {
						if(palabra.charAt(j)==c) {
							acertadas[j]=c;
							acierto=true;
						}
					}
					tries--;
					if(acierto)
						System.out.println("ACERTASTE");
					if(acertadas.toString().compareTo(palabra)==0)
						win=true;
					
					}
				}
				if(win==true)
					System.out.println("HAS GANADOOOOOOOOOOO LA PALABRA ERA "+palabra);
				else
					System.out.println("Has perdido, la palabra era "+palabra);
		} catch (Exception e) {
			System.err.println("ERROR");
		}
			
	
		sc.close();

	}

}
