package componentes;
import javax.swing.*;
public class Ventana_JDialogSuelta {

	public static void main(String[] args) {
		JDialog v=new JDialog();
		v.setTitle("Ejemplo JDialog");
		
		v.setSize(300,150);
		v.setLocationRelativeTo(null);
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

	}

}
