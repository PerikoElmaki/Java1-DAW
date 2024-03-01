package padres;

public class hijo extends padre{
	private int dato1,dato2;
	
	hijo(int x,int y){
		super(2,2);  //aqui das valores al padre
		dato1=x;
		dato2=y;
	}
	
	hijo(){
		dato1=3;
		dato2=3;
	}
	
	public void getDato() {
		System.out.println("Padre dato1: "+super.dato1);
		System.out.println("Padre dato2: "+super.dato2);
		System.out.println("HIjo dato1: "+this.dato1);
		System.out.println("Hijo dato2: "+this.dato2);
	}
}
