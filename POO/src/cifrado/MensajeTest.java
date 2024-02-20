package cifrado;

public class MensajeTest {

	public static void main(String[] args) {
		Mensaje m=new Mensaje("UVWXYZ");
		
		String cifrado=m.Sustitucion(3);
		System.out.println(m.getMensaje());
		System.out.println(cifrado);
	}

}
