package tutorialFicheros;
import java.io.*;
public class LectorFileReader {

	
	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;  //lo usamos para leer linea a linea
		
		try {
			//Apertura del fichero y creacion de Buffered
			fr=new FileReader("E:\\FicherosPR\\quijote.txt");
			br=new BufferedReader(fr);
			
			//Lectura del fichero 
			String linea=br.readLine();//el buffered es el que tiene readline
			while(linea!=null) {
				System.out.println(linea);
				linea=br.readLine();
			}
		} catch (Exception e1) {
			System.out.println("Se ha producido un error con el archivo especificado");
		}finally {
			try {
				if(fr!=null)
					fr.close();
			}catch(Exception e2) {
				System.out.println("Error en el cierre del archivo");
			}
		}

	}

}
