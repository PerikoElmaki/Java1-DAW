package organizacion;
import javax.swing.*;
import java.awt.*;
public class EJ_JPanel extends JFrame{
	
	JPanel panel1,panel2;
	
	public EJ_JPanel() {
		//Creamos primer panel 
		panel1=new JPanel();
		//le damos disposicion que queramos 
		panel1.setLayout(new GridLayout(2,2,10,10));
		panel1.add(new JLabel("Nombre"));
		panel1.add(new JTextField());
		panel1.add(new JLabel("TLF"));
		panel1.add(new JTextField());
		
		
		//Metemos panel 1 en el 2, que va a ir en otra dispociion para centrar 
		panel2=new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		panel2.add(panel1);
		add(panel2);
	}

	public static void main(String[] args) {
		EJ_JPanel e=new EJ_JPanel();
		
		e.setTitle("EjEMplo JPanel");
		e.setSize(300,250);
		e.setLocationRelativeTo(null);
		e.setVisible(true);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
