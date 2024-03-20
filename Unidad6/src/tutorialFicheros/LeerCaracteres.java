package tutorialFicheros;
import java.io.*;
public class LeerCaracteres {

	
	public static void main(String[] args) {
		FileReader fr=null;
		
		try {
			//Apertura del fichero
			fr=new FileReader("E:\\FicherosPR\\quijote.txt");
			
			//leemos caracter a caracter 
			//La funcion devuelve un int(codigo ASCII)
			int valor=fr.read(); 
			
			//read devuelve -1 si no hay más caracteres
			while(valor!=-1) {
				System.out.print((char)valor); //casting para que muestre el carácter
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
