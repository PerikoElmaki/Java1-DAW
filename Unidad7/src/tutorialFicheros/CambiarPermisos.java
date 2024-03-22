package tutorialFicheros;

import java.io.File;

public class CambiarPermisos {

	public static void main(String[] args) {
		File f=new File("E:\\FicherosPR\\quijote.txt");
		
		if(!f.exists()) {
			System.out.println("EL fichero "+f.getPath()+" no existe");
		}else {
			if(f.canWrite())
				System.out.println("El fichero existe y se puede escribir");
			
			//Deshabilitamos escritura
			if(f.setWritable(false))
				System.out.println("Deshabilitamos el permiso de escritura de "+f.getName());
			else {
				System.out.println("La operaciçon ha fallado");
				System.out.println("EL usuario no tiene los permisos para realizar esta operación");
			}
			
			if(f.canWrite())
				System.out.println("Podemos escribir en el fichero");
			else
				System.out.println("Ya no podemos escribir en "+f.getName());
		}

	}

}
