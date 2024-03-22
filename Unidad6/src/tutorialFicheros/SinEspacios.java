package tutorialFicheros;

import java.io.FileReader;

public class SinEspacios {

	public static void main(String[] args) {
	FileReader fr=null;
		
		try {
			//Apertura del fichero
			fr=new FileReader("E:\\FicherosPR\\quijote.txt");
	
			int valor=fr.read(); 
			
		
			while(valor!=-1) {
				if((char)valor!=' ')
					System.out.print((char)valor);
				valor=fr.read();
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
