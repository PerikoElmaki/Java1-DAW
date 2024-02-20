package cifrado;

import java.util.Scanner;

public class Ahorcado {
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
	public static void muestraAcertados(String a,char c) {
		
		for(int i=0; i<a.length(); i++){
			if(encontrado(a, c.charAt(i)))
				cifrado+=c;
			else
				cifrado+="*";
		}
	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tries=10;
		String palabraAcertar="holaa";
		String muestraAcertados;
		boolean win=false;
		String c="";
		try {
			
			do {
				for(int i=0;i<tries; i++) {
					muestraA
					System.out.println("Palabra a acertar: "+muestraAcertados);
					System.out.println("Intentos: "+tries);
					System.out.print("Dime un caracter: ");
					String cc=sc.nextLine();
					if(encontrado(palabraAcertar, c))
						System.out.println("ACERTADO");
					else
						System.out.println("Error, carácter no encontrado");
					tries--;
						
				}
			}while(tries>0 || win==false );
		} catch (Exception e) {
			System.err.println("ERROR");
		}
	
		
		sc.close();

	}

}
