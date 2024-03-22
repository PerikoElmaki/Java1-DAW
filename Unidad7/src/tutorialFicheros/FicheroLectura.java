package tutorialFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FicheroLectura {

	public static void main(String[] args) {
		File f=new File("E:\\FicherosPR\\quijote.txt");
		
		try {
			Scanner s=new Scanner(f);  //Se leen utilizando la clase escáner
			//COn ella podemos tratar lineas del fichero 
			
			//Mientras tenga lineas el fichero, sigue leyendo 
			while(s.hasNextLine()) {
				String linea=s.nextLine(); //Guardamos el valor de la linea en variable
				System.out.println(linea);//mostramos por pantalla
			}
			s.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("El sistema no puede encontrar el archivo especificado");
		}

	}

}
