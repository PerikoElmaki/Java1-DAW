package polimorfismo;

public class hijostest {

	public static void main(String[] args) {
		hijo h=new hijo();
		h.mostrar();   //muestra los dos porque en metodo del hijo incluimos el del padre(lo llamabamos)
		h.getDato();   //el get dato devuelve el super.dato
	}

}
