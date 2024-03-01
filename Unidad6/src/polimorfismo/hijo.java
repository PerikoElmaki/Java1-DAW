package polimorfismo;

public class hijo extends padre{
	private int dato;
	
	//Utilizamos super para acceder a atributo protected de padre
	public void m() {
		System.out.println("Método clase hijo");
		super.dato=10;
		dato=20;
	}
	
	public void getDato() { //del padre 
		System.out.println(super.dato);
	}

	public void mostrar() {
		this.m();
		m(); //si no pones nada coge el de esta clase 
		super.m();   //coge procedimiento de padre 
	}
	
	
}
