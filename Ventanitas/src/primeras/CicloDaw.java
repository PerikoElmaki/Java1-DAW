package primeras;
import javax.swing.*;

public class CicloDaw extends JFrame{//para no crear un objeto nuevo, heredamos de clase
	
	/*
	 * Constructor
	 */
	public CicloDaw() {
		setTitle("VegaMedia");
		JLabel label=new JLabel("Desarrollo de Aplicaciones Web");
		add(label);
	}
	
	
	
	public static void main(String[] args) {
		CicloDaw app=new CicloDaw();
		
		app.pack();//ajusta tamaño al contenido, no hace falta Size
		app.setLocationRelativeTo(null);
		app.setVisible(true);
		app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
