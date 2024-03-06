package ejer1electrodom;

public class Test {

	public static void main(String[] args) {
		Electrodomestico[] e={new Lavadora(200, 20),new Lavadora(),new Television(300,60),new Television()};
		
		double suma=0;
		System.out.println("-------Array de electrodomésticos------");
		for(int i=0; i<e.length; i++) {
			System.out.println(e[i]);
			suma+=e[i].precioFinal();
		}
		
		System.out.println("Precio total de electrodomésticos: "+suma);
	

	}

}
