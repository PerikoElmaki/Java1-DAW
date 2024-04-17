package pruebas;
import javax.swing.*;
public class Acceso extends JFrame {
	//Componentes 
	JTextField t1,t2;
	JLabel usuario,contraseña;
	JCheckBox r;
	JButton b;
	
	public Acceso() {
		setLayout(null);
		
		usuario=new JLabel("Usuario: ");
		usuario.setBounds(20, 40, 100, 25);
		add(usuario);
		
		contraseña=new JLabel("Contraseña: ");
		contraseña.setBounds(20, 80, 100, 25);
		add(contraseña);
		
		
		t1=new JTextField();
		t1.setBounds(90,40, 175, 25);
		add(t1);
		
		t2=new JTextField();
		t2.setBounds(90,80,175,25);
		add(t2);
	}
	
	
	public static void main(String[] args) {
		Acceso v=new Acceso();
		
		v.setTitle("Acceso");
		v.setVisible(true);
		v.setSize(300,250);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
