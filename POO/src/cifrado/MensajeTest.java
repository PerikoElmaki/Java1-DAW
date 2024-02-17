package cifrado;

public class MensajeTest {

	public static void main(String[] args) {
		Mensaje m=new Mensaje("TE AMO MI ESPOSA");
		
		System.out.println(m.Sustitucion(3));
		System.out.println(m.getMensaje());
		System.out.println(m.descifradoSusti(m.Sustitucion(7), 7));
	}

}
