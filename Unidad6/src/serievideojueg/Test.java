package serievideojueg;

public class Test {

	public static void main(String[] args) {
		Serie[] s=new Serie[3];
		Videojuego[] j=new Videojuego[3];
		
		s[0]=new Serie("Juego de tronos","George RR Martin");
		s[1]=new Serie("Peaky Blinders",5,"Accion","Mi primo David");
		s[2]=new Serie("La caza de pape","Kiki");
		
		
		
		s[1].entregar();
		
		for(int i=0; i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
