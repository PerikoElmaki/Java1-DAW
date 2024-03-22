package escrituraFicheros;

import java.io.*;

public class EScrituraBasica {

	public static void main(String[] args) {
		FileWriter fw=null;
		PrintWriter pw=null;
		try {
			fw=new FileWriter("C:\\Programacion\\prueba.txt");
			pw=new PrintWriter(fw);
			
			//Escritura en el fichero
			pw.println("PRueba de escritura en un fichero");
			for(int i=0; i<10; i++) {
				pw.println("Linea "+i);
			}
		} catch (Exception e) {
			System.out.println("Se ha producido un error con el archivo especificado");
		}finally {
			try {
				if(fw!=null)
					fw.close();
			} catch (Exception e2) {
				System.out.println("ERROR en el ciere del archivo");
			}
		}

	}

}
