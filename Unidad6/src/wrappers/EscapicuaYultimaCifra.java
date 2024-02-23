package wrappers;

import java.util.Scanner;

public class EscapicuaYultimaCifra {

	public static boolean esCapicua(int num) {
		Integer numm=Integer.valueOf(num);
		String n=Integer.toString(numm);
		String inverso=new StringBuffer(n).reverse().toString();//con esto usamos la clase sbuffer le damos la vuelta y convertimos a string
		//el equals ya va a devolver true o false
		return n.equals(inverso);
		
		
	}
	
	public static int getUltimaCifra(int num) {
		String numero=String.valueOf(num);
		int n=Integer.parseInt(numero.substring(numero.length()-1, numero.length())); //empieza en el penúltimo y muestra el último
		return n;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Dime un número: ");
		int num=Integer.parseInt(sc.nextLine());
		if(num<10)
			System.out.println("Los capicuas son  partir de dos cifras");
		else
			if(esCapicua(num))
				System.out.println(num+" es capicua");
			else
				System.out.println(num+" no es capicua");
		System.out.println(getUltimaCifra(num)+" la ultima cifra");
		sc.close();

	}

}
