package wrappers;

public class PruebaWrappers {

	public static void main(String[] args) {
		/* VAMOS A UTILIZAR LOS WRAPPERS PARA USAR LOS MËTODOS DE CLASE COMO CON STRINGS */
		
		//Probamos la creacion de un tipo primitivo int a partir de un String 
		
		int x= Integer.parseInt("100");  //con esto podemos pedir por teclado string y luego convertir
		System.out.println(x); 
		
		//Creamos un wrapper Integer utilizando un valor de un int normal 
		Integer y=Integer.valueOf(200); //como un set valor 
		System.out.println(y); //Se puede imprimir porque el Wrapper tiene un método toString en su clase
		//es como poner y.toString()
		
		Double z=Double.valueOf(3.8);
		System.out.println(z);
	}

}
