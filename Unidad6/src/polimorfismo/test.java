package polimorfismo;

public class test {

	public static void main(String[] args) {
		//Persona no puede usar métodos de la clase hija, SOLO CONSTRUCTOR 
		Persona p1=new Empleado();  
		p1.setNombre("Pedro");
		//p1.setSueldoBase no dejaria usarlo, necesitamos casting 
		
		((Empleado)p1).setSueldoBase(100);  //convertimos p1 a empleado para este caso.
		System.out.println(p1.getNombre()+" ");
		
		Empleado e1;
		e1=new Encargado(); //usamos constructor de Encargado 
		e1.setSueldoBase(500);  //va a sobreescribir y coger el de Encargado, no el de empleado
		System.out.println(e1.getSueldoBase());
		
		

	}

}
