package tutorialFicheros;

import java.io.FileReader;

public class CambioMinMayus {

	public static void main(String[] args) {
	FileReader fr=null;
		
		try {
			//Apertura del fichero
			fr=new FileReader("E:\\FicherosPR\\quijote.txt");
			
			int valor=fr.read();
			while(valor!=-1) {
				
				if(valor>=65 && valor<=90)
					valor+=32; //la distancia que hay entre minus y mayus
				else if(valor>=97 && valor<=122)
					valor-=32;
				
				System.out.println((char)valor);
				valor=fr.read();
			}
			
			//OTRA FORMA
			/*
			int valor=fr.read(); 
			char c=(char)valor;
			String caracter=String.valueOf(c);
		
			
			while(valor!=-1) {
				if(c>='A' && c<='Z') {
					caracter=String.valueOf(c).toLowerCase();
					
				}else if(c>='a' && c<='z')
					caracter=String.valueOf(c).toUpperCase();
				else
					caracter=String.valueOf(c);
				
				System.out.print(caracter);
				valor=fr.read();
				c=(char)valor;
				
			}
			*/
			
			
	
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
