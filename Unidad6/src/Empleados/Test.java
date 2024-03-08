package Empleados;

public class Test {

	public static void main(String[] args) {
		Comercial c=new Comercial(250.0,"Atno",32,2300);
		Comercial c2=new Comercial(100.2,"Pringao",28,1500);
		
		Repartidor r1=new Repartidor("zona 3","DAVID",22,1000);
		Repartidor r2=new Repartidor("patio", "KK", 25, 900);
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println("\n");
		c.Plus(); c2.Plus(); r1.Plus(); r2.Plus();
		System.out.println(c);
		System.out.println(c2);
		System.out.println(r1);
		System.out.println(r2);
		

	}

}
