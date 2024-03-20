package tutorialFicheros;

import java.io.FileReader;

public class TodasMin {

	public static void main(String[] args) {
	FileReader fr=null;
		
		try {
			//Apertura del fichero
			fr=new FileReader("E:\\FicherosPR\\quijote.txt");
	
			int valor=fr.read(); 
			
			String mayus=String.valueOf((char)valor);
			
			while(valor!=-1) {
				System.out.print(mayus.toUpperCase());
				valor=fr.read();
				mayus=String.valueOf((char)valor);
			}
			//SE PUEDE HACER MAS FACIL LEYENDO LINEA POR LINEA CON SCANNER Y EL UPPER CASE
			
	
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
