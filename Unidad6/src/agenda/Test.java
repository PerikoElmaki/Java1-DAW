package agenda;


import java.util.Scanner;

public class Test {
	public static void Menu() {
		System.out.println("AGENDA TELEFÓNICA");
		System.out.println("-------------------");
		System.out.println("1. Añadir nuevo contacto \n2. Listar contactos \n3. Buscar contactos \n4. Eliminar contacto \n5. Estado de la agenda \n6. Salir");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion=0; //cuando  sea 6 que pare 
	
		do {
			Menu();
			System.out.print("Elige una opción: ");
			opcion=sc.nextInt();
			
			switch (opcion) {
			case 1: System.out.println(">> Introducir un nuevo contacto---");
					System.out.print("Dime el nombre del contacto: ");
					String nombre=sc.nextLine();
					System.out.print("Dime el número de telefono");
					int num=Integer.parseInt(sc.nextLine());
					
					Contacto c=new Contacto(nombre,num);
					
					break;
			case 2: System.out.println(">> Listar contactos----");
					break;
			case 3: System.out.println(">> Buscar contactos----");
					break;
			case 4: System.out.println(">> Eliminar contactos----");
					break;
			case 5:System.out.println(">> Estado de la agenda----");
					break;
			case 6:System.out.println(">> Bye Bye....");
					break;
			default:System.out.println("No has introducido una opción valida");
				break;
			}
		}while(opcion!=6);
		
		
		
		sc.close();
	}

}
