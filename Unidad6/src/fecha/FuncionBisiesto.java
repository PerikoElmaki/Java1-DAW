package fecha;

import java.util.Date;

public class FuncionBisiesto {
	/**
	 * Función que determina si un año pasádo por parámetro es bisiesto o no
	 * @param año-numero entero 
	 * @return true si es bisiesto, false si no
	 */
	public static boolean esBisiesto(int año) {
		if(año%4==0 && (año%100!=0  || año%400==0)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(esBisiesto(2024));
		System.out.println(d);
	}

}
