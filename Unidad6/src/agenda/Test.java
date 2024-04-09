package agenda;

import java.util.Scanner;

public class Test {
	public static void Menu() {
		System.out.println("\nAGENDA TELEFÓNICA");
		System.out.println("-------------------");
		System.out.println("1. Añadir nuevo contacto \n2. Listar contactos \n3. Buscar contactos \n4. Eliminar contacto \n5. Estado de la agenda \n6. Salir");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nombre; //para no declarar en todos los casos
		int num; //telefomo
		int opcion=0; //cuando  sea 6 que pare 
		Agenda a=new Agenda(5);
		do {
			Menu();
			System.out.print("Elige una opción: ");
			opcion=Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1: if(a.agendaLlena())
						System.err.println("La agenda está llena");
					else {
						System.out.println(">> Introducir un nuevo contacto---");
						System.out.print("Dime el nombre del contacto: ");
						nombre=sc.nextLine();
						System.out.print("Dime el número de telefono: ");
						num=Integer.parseInt(sc.nextLine());
						a.addContacto(new Contacto(nombre,num));
					}
				
					break;
			case 2: System.out.println(">> Listar contactos----");
					a.listarContactos();
					break;
			case 3: System.out.println(">> Buscar contactos----");
					System.out.print("Nombre a buscar: ");
					nombre=sc.nextLine();
					a.mostrarContacto(nombre);
					break;
			case 4: System.out.println(">> Eliminar contactos----");
					System.out.print("Dime nombre: ");
					nombre=sc.nextLine();
					a.eliminarContacto(new Contacto(nombre));
					break;
			case 5:System.out.println(">> Estado de la agenda----");
					if(a.agendaLlena())
						System.err.println("-La agenda está llena");
					else {
						System.out.println("Se pueden introducir "+a.huecosLibres()+" contactos más");
					}
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
