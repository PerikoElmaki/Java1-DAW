package escrituraFicheros;

import java.io.*;
import java.util.Scanner;

public class Agenda {
	
	private static String rutaFichero="E:\\FicherosPR\\Agenda.txt"; //para no escribirlo tanto
	
	/**
	 * Procediimeitno que lee el archivo linea por linea
	 */
	private static void listarContactos() {
		File f=new File(rutaFichero);
		
		try {
			Scanner s=new Scanner(f);  //Se leen utilizando la clase escáner
			int conta=0; //para cntar si tiene lineas(o esta vacio)
			
			//Mientras tenga lineas el fichero, sigue leyendo 
			while(s.hasNextLine()) {
				String linea=s.nextLine(); //Guardamos el valor de la linea en variable
				System.out.println(linea);//mostramos por pantalla
				conta++;
			}
			s.close();
			if(conta==0)
				System.out.println("La agenda está vacía");
			
		} catch (FileNotFoundException e) {
			System.out.println("Agenda vacía o no se ha creado aún");
		}
	}
	
	/**
	 * Imprime menu
	 */
	private static void Menu() {
		System.out.println("*******************");
		System.out.println("AGENDA TELEFÓNICA");
		System.out.println("1. Añadir nuevo contacto \n2. Listar contactos \n3. Buscar contactos \n4. Salir");
		System.out.println("*******************");
	}
	
	/**
	 * Guarda en el fichero un nuevo contacto
	 * @param nom nombre del contacto 
	 * @param tlf telefono del contacto
	 */
	private static void newContacto(String nom,int tlf) {
		FileWriter fw = null;
		PrintWriter pw=null;
		try {
			
			fw=new FileWriter(rutaFichero,true);//El true para que sobreescriba, si no crea un nuevo archivo cada vez
			pw=new PrintWriter(fw);
			pw.println(nom+" > "+tlf);//añadimos contacto
	
		} catch (Exception e) {
			System.out.println("ERROR con el archivo de la agenda");
		}finally {//por si falla o no, se hace igual 
			try {
				if(fw!=null) { //si se ha abierto bien antes(no es null), se cierra
					fw.close();
					pw.close();
				}
			} catch (Exception e2) {
				System.out.println("Error al cerrar el archivo");
			}
		}
	}
	
	/**
	 * Busca un contacto por el nombre y devuelve el telefono
	 * @param nom nombre del contato 
	 * @return el telefono del contacto, si no existe devuelve 0
	 */
	private static int buscarContacto(String nom) {
		int res=0;
		boolean encontrado=false;
		File f=new File(rutaFichero);
		
		try {
			Scanner s=new Scanner(f);  
			while(s.hasNextLine() && !encontrado) {
				String linea=s.nextLine(); 
				String nameAgenda=linea.substring(0,linea.indexOf('>')).trim(); //coges subcadena del principio, hasta el caracter >
				
				if(nameAgenda.compareToIgnoreCase(nom)==0){//si el nombre coincide
					String telefono=linea.substring(linea.indexOf('>')+1).trim(); 
					res=Integer.parseInt(telefono); //convertimos a int
					encontrado=true;
				}		
			}
			s.close();
			
		} catch (FileNotFoundException e) {
			return 0; //si no encuentra, 0
		}
		return res;
	}

	public static void main(String[] args) {
		int opcion; //elegida por el usuario 
		String nombre; //del contacto
		int telefono; //del contacto
	
		Scanner sc=new Scanner(System.in);
		try {
			do {
				Menu();
				System.out.print("Elige una opción: ");
				opcion=Integer.parseInt(sc.nextLine());
				
				switch(opcion) {
					case 1:System.out.println("\n>>NUEVO CONTACTO"); 
							System.out.print(">Dime el nombre: ");
							nombre=sc.nextLine().trim();
							//COmprobamos buscando el contacto en la agenda antes de crearlo
							if(buscarContacto(nombre)==0){//si no se encuentra el contacto, lo crea
								System.out.print(">Dime el teléfono: ");
								telefono=Integer.parseInt(sc.nextLine());
								newContacto(nombre,telefono);
							}else
								System.out.println(">>El contacto ya existe");
							
							
							break;
					case 2:System.out.println("\n>>LISTAR CONTACTOS");
							listarContactos();
							break;
					case 3:System.out.println("\n>>BUSCAR CONTACTOS");
							System.out.print(">Dime el nombre a buscar: ");
							nombre=sc.nextLine().trim();
							int telf=buscarContacto(nombre); //devuelve 0 si no está en la agenda
							if(telf==0)
								System.out.println(">>No se ha encontrado el contacto en la agenda");
							else
								System.out.println(">>Teléfono: "+telf);
							break;
					case 4:System.out.println("\n>>SALIR");
							System.out.println("Bye");
						    break;
					default:System.out.println("Opcion incorrecta. Elige otra opción");
						
				}
				System.out.println("\n");
			}while(opcion!=4);
		} catch (Exception e) {
			System.err.println("ERROR en la introduccion del tipo de datos ");
		}
		sc.close();
	}

}
