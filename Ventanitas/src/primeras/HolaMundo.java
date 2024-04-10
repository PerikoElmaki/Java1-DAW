package primeras;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class HolaMundo {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ventana HolaMundo"); //crea la ventana, todo lo demás va dentro
		
		JLabel etiqueta=new JLabel("Hola Gay");//etiqueta
		ventana.getContentPane().add(etiqueta); //la añadimos a la parte de la ventana de contenido
		
		//Antes de hacerla visible, ajustamos parámetros
		ventana.setSize(300,100);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);//si esta false impedimos que modifique el tamaño de pantalla
		
		
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //le decimos que al cerrar ventana, acabe el programa
		
		

	}

}
