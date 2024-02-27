package fecha;

import java.util.Scanner;

public class FechaTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fecha actually=new Fecha();
		actually.setFechaActual();
		//Creamos objeto pero no iniciamos 
		Fecha f;
		
		try {
			
			System.out.println("Introduce una fecha: ");
			System.out.print("\tDia: ");
			int dia=sc.nextInt();
			System.out.print("\tMes: ");
			int mes=sc.nextInt();
			System.out.print("\tAño: ");
			int año=sc.nextInt();
			
			//aqui inicializa objeto 
			f=new Fecha(dia,mes,año);
			
		} catch (Exception e) {
			System.err.println("ERROR en la intro de datos ");
			f=new Fecha(); //si te equivocas poniendo otra cosa q no es int, coge el constructor por defecto 
			System.out.println("Tomaremos la fecha: "+f);
			
		}
		
		System.out.print("\nFecha actual: "+actually);
		if(f.esCorrecta())
			System.out.println("\nFecha introducida: "+f);
		else
			System.err.println("\nLa fecha no es correcta");
		/*
		 * HAY QUE CONTROLAR LOS BISIESTOS , SI el año es disivisble primero entre 400 y luego entre 4 
		 */
		
		//Para controlar si es futuro(1), pasado(2) o presente(3)
		int tiempo=2;
		//Controlamos año
		if(f.getAño()>actually.getAño()) {
			tiempo=1;
		}else if(f.getAño()==actually.getAño()){ //si es el mismo año 
			if(f.getMes()>actually.getMes())  //si el mes es mayor 
				tiempo=1;
			else if(f.getMes()==actually.getMes()) { //si es el mismo mes comprueba dias 
				if(f.getDia()>actually.getDia())     //si dia es mayor
					tiempo=1;
				else if(f.getDia()==actually.getDia())
					tiempo=3;
				else
					tiempo=2;
			}else
				tiempo=2;
		}else 
			tiempo=2;
			
		if(tiempo==1)
			System.out.println("La fecha introducida pertenece al futuro ");
		else if(tiempo==2)
			System.out.println("La fecha pertenece al pasado ");
		else
			System.out.println("Es la fecha actual");
		
		sc.close();
	}

}
