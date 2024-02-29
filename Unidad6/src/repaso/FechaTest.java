package repaso;


import java.util.Scanner;

public class FechaTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fecha f;
		try {
			System.out.println("Introduce una fecha: ");
			System.out.print("\tDia: ");
			int d=Integer.parseInt(sc.nextLine());
			System.out.print("\tMes: ");
			int m=Integer.parseInt(sc.nextLine());
			System.out.print("\tAño: ");
			int a=Integer.parseInt(sc.nextLine());
			
			//Indicamos finalmente la fecha que vamos a guardar
			f=new Fecha(d,m,a);
		} catch (Exception e) {
			System.err.println("ERROR en la introducción del tipo de datos ");
			System.out.println("Tomaremos la fecha por defecto");
			f=new Fecha();
		}
		sc.close();
		
		//Creamos fecha actual
		Fecha actual=new Fecha();
		actual.fechaActual();
		//La mostramos 
		System.out.println("\nFecha actual: "+actual);
		System.out.println("Fecha introducida: "+f);
		if(!f.esCorrecta())
			System.err.print("La fecha es incorrecta");
		
		//Contar los dias hata la fecha 
		System.out.println("\nDias hasta la fecha actual: "+actual.contaDias());
		System.out.println("Dias del año hasta fecha introducida: "+f.contaDias());
		
		
		
		
		
		

	}

}
