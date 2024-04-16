package pruebas;
import javax.swing.*;
public class Comentarios extends JFrame{
	//Componentes 
	JLabel et;
	JTextArea text;
	JScrollPane scr;
	
	public Comentarios() {
		setLayout(null);
		et=new JLabel("Escribe tu comentario: ");
		et.setBounds(20,-60,150,150);
		
		
		text=new JTextArea();
		text.setLineWrap(true); //salta de linea 
		
		scr=new JScrollPane(text);
		scr.setBounds(20,20,225,150);
		
		add(et);
		add(scr);
		
	}
	public static void main(String[] args) {
		Comentarios v=new Comentarios();
		
		v.setTitle("Comentarios");
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		v.setBounds(10,10,300,250);
		v.setVisible(true);

	}

}
