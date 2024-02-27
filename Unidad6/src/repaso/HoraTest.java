package repaso;

import java.util.Scanner;

public class HoraTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hora h;
		try {
			System.out.println("Dime una hora: ");
			System.out.print("\tHora: ");
			int hora=Integer.parseInt(sc.nextLine());
			System.out.print("\tMinutos: ");
			int min=Integer.parseInt(sc.nextLine());
			System.out.print("\tSegundos: ");
			int sec=Integer.parseInt(sc.nextLine());
			
			h=new Hora(hora,min,sec);
		} catch (Exception e) {
			System.err.println("ERROR en la intro de datos");
			System.out.println("Vamos a usar la hora por defecto");
			h=new Hora();
		}
		
		
		Hora a=new Hora();
		a.horaActual();
		System.out.println("\nHora actual: "+a);
		System.out.println("Hora introducida: "+h);
		if(!h.esCorrecta())//si no es correcta
			System.err.print(" La hora introducida es incorrecta");
		
		//Controlamos si la hora es futura,pasada o la actual 
		int tiempo=0;
		
		if(h.getHora()>a.getHora())
			tiempo=1; //futuro
		else if(h.getHora()==a.getHora()) {
			if(h.getMin()>a.getMin())
				tiempo=1;
			else if(h.getMin()==a.getMin()) {
				if(h.getSec()>a.getSec())
					tiempo=1;
				else if(h.getSec()==a.getSec())
					tiempo=3;
				else
					tiempo=2;
			}else
				tiempo=2;
		}else
			tiempo=2; //pasado
		
		//Mostramos el tiempo
		if(tiempo==1)
			System.out.println("La fecha introducida es futura");
		else if(tiempo==2)
			System.out.println("La fecha es pasada");
		else //si es 3
			System.out.println("La fecha introducida es la actual");
		
		h.sigSec();
		System.out.println("\nHora un segundo más tarde: "+h);
		
		
		
		sc.close();
	}

}
