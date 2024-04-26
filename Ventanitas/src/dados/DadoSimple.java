package dados;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DadoSimple extends JFrame implements ActionListener{
	//Componentes 
	private JLabel tirada;
	private JButton boton;
	
	/*
	 * Constructor 
	 */
	public DadoSimple() {
		//Creamos etiqueta 
		tirada=new JLabel("?");
		tirada.setHorizontalAlignment(SwingConstants.CENTER);
		tirada.setFont(new Font("Comic Sans MS",Font.BOLD,100));
		
		//boton y listener 
		boton=new JButton("Tirar dado");
		boton.addActionListener(this);
		
		//Añadimos componentes a ventana 
		setLayout(new BorderLayout(0,0));
		add(tirada,BorderLayout.CENTER);
		add(boton,BorderLayout.SOUTH);
		
		
	}
	
	public static void main(String[] args) {
		DadoSimple v=new DadoSimple();
		v.setTitle("Dado");
		v.setVisible(true);
		v.setSize(200,200);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			int n=(int)(Math.random()*6+1);
			tirada.setText(String.valueOf(n));
		}
		
	}

}
