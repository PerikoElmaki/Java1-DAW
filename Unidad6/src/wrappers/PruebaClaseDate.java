package wrappers;
import java.util.*;

public class PruebaClaseDate {

	public static void main(String[] args) {
		Date fecha1=new Date(); //Fecha actual del sistema
		Date fecha2= new Date(0); //Milisegundo 0
		Date fecha3=new Date(1000); //El 1er segundo a partir del inicio
		System.out.println(fecha1.toString());
		System.out.println(fecha2.toString());
		System.out.println(fecha3.toString());
		System.out.println(fecha2.after(fecha3)); //Mostrara false 
		System.out.println(fecha1.before(fecha1)); //true
	}

}
