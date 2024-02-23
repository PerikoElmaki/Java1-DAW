package wrappers;

import java.util.Scanner;

public class Datos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Dime tu nombre: ");
		String nom=sc.nextLine();
		
		System.out.print("Edad: ");
		int edad=Integer.parseInt(sc.nextLine()); //se puede convertir directamente 
		
		System.out.println("Tu edad es: "+edad);
		sc.close();

	}

}
