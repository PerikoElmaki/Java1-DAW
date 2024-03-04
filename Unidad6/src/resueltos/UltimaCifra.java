package resueltos;


import java.util.Scanner;

public class UltimaCifra {
	public static int ultimaCifra(int N) {
		String cadena=String.valueOf(N);
		int ultima=Integer.parseInt(cadena.substring(cadena.length()-1,cadena.length())); 
		return ultima;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Dime numero: ");
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("Ultima cifra: "+ultimaCifra(num));
		sc.close();

	}

}
