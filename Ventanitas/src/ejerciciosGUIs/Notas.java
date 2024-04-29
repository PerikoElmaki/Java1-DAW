package ejerciciosGUIs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class Notas extends JFrame implements ActionListener{
	//Componentes 
	JLabel enunciado;
	JTextField texto;
	JButton boton;
	JPanel panel;
	
	public Notas() {
		
		enunciado=new JLabel("Introduce tu nota: ");
		enunciado.setFont(new Font("JetBrains Mono",Font.BOLD,13));
		
		texto=new JTextField();
		
		boton=new JButton("COMPROBAR");
		boton.setFont(new Font("JetBrains Mono",Font.BOLD,13));
		boton.addActionListener(this);
		
		panel=new JPanel(new GridLayout(3,1,15,15));
		panel.add(enunciado);
		panel.add(texto);
		panel.add(boton);
		panel.setBackground(Color.LIGHT_GRAY);
		
		//Layout de ventana 
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		add(panel);
		
	}
	
	public static void main(String[] args) {
		Notas v=new Notas();
		v.setVisible(true);
		v.setSize(400,300);
		v.setResizable(false);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==boton) {
				JDialog s=new JDialog();
				s.setSize(300,200);
				s.setVisible(true);
				s.setDefaultCloseOperation(HIDE_ON_CLOSE);
				s.setLocationRelativeTo(null);
				s.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
				JLabel m=new JLabel();
				
				if(Integer.parseInt(texto.getText())<5){
					s.getContentPane().setBackground(Color.pink);
					s.setTitle("SUSPENSO");
					m.setText("Estás suspenso jefe");
					
					s.add(m);
				}else {
					s.getContentPane().setBackground(Color.green);
					s.setTitle("APROBAOOOO");
					m.setText("");
				}
			}
		} catch (Exception e2) {
			setTitle("ERROR");
			getContentPane().setBackground(Color.red);
		}
		
	}

}
