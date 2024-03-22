package tutorialFicheros;
import java.io.File;
public class PermisosFicheros {

	public static void main(String[] args) {
		File f=new File("E:\\FicherosPR\\quijote.txt");
		
		if(!f.exists()) {
			System.out.println("EL fichero "+f.getPath()+" no existe"); //Path devuelve la ruta 
		}else {
			System.out.println("Pathname: "+f.getPath());
			System.out.println("Permisos del fichero "+f.getName()+"-----");
			
			//Comprobamos si la lectura está permitida 
			System.out.print("  Lectura: ");
			if(f.canRead())
				System.out.println("PERMITIDA");
			else
				System.out.println("DENEGADA");
			
			System.out.print("  ESCRITURA: ");
			if(f.canWrite())
				System.out.println("PERMITIDA");
			else
				System.out.println("DENEGADA");
			
			
			System.out.print("  EJECUCIÓN: ");
			if(f.canExecute())
				System.out.println("PERMITIDA");
			else
				System.out.println("DENEGADA");
		}

	}

}
