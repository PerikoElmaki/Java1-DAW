package boletin;

import java.util.Scanner;

public class FechaTest {

	public static void main(String[] args) {
		//fecha del sistema
		Fecha f=new Fecha();
		System.out.println("Fecha actual del sistema: "+f);
		
		Fecha n=new Fecha();
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("\nIntroduce una fecha de nacimiento: ");
			System.out.print("\tDia: ");
			int d=sc.nextInt();
			System.out.print("\tMes: ");
			int m=sc.nextInt();
			System.out.print("\tAño: ");
			int a=sc.nextInt();
			
			n=new Fecha(d,m,a);
			
		} catch (Exception e) {
			System.err.println("ERROR en la introducción del tipo de datos");
		}
		sc.close();
		
		System.out.println("Fecha de nacimiento: "+n);
		if(!n.isValid())
			System.err.println("La fecha introducida no corresponde a una fecha correcta");
		else {
			boolean mayor=false;
			if(n.getYear()<2006)
				mayor=true;
			else if(n.getYear()==2006) {
				if(n.getMonth()<f.getMonth())
					mayor=true;
				else if(n.getMonth()==f.getMonth()) {
					if(n.getDay()<=f.getDay())
						mayor=true;
					else
						mayor=false;
				}else
					mayor=false;
			}else
				mayor=false;
			
			
			
			if(mayor==true)
				System.out.println("La persona nacida el "+n+" es MAYOR DE EDAD");
			else
				System.out.println("La persona nacida el "+n+" es MENOR DE EDAD");
		}
	

	
	}

}
