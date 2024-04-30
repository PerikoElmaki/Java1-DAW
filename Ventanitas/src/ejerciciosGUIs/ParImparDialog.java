package ejerciciosGUIs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ParImparDialog extends JFrame implements ActionListener{
	//Componentes 
	JLabel enunciado;
	JTextField texthueco;
	JButton botonDo;
	JPanel panelText,panelboton;
	
	public ParImparDialog() {
		
		enunciado=new JLabel("Introduce un nº entero: ");
		enunciado.setFont(new Font("Arial",Font.BOLD,12));
		texthueco=new JTextField();
		
		panelText=new JPanel(new GridLayout(2,1,0,10));
		panelText.add(enunciado);
		panelText.add(texthueco);
		panelText.setBackground(Color.GRAY); //estilo
		
		
		botonDo=new JButton("Par o Impar");
		botonDo.setFont(new Font("JetBrains Mono",Font.BOLD,12));
		botonDo.addActionListener(this);
		
		panelboton=new JPanel(new GridLayout(1,1,0,0));
		panelboton.add(botonDo);
		
		//Seteamos layout para ventana 
		setLayout(new FlowLayout(FlowLayout.CENTER,40,40));
		add(panelText);
		add(panelboton);
		
		//estilo 
		getContentPane().setBackground(Color.GRAY);
		
		
	}
	
	public static boolean esPar(int num) {
		if(num%2!=0)
			return false;
		return true;
	}
	public static void main(String[] args) {
		ParImparDialog v=new ParImparDialog();
		v.setTitle("Par Impar");
		v.setSize(300,300);
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setResizable(false);
		v.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==botonDo) {
				if(esPar(Integer.parseInt(texthueco.getText()))) {
					getContentPane().setBackground(Color.GREEN);
					JOptionPane.showMessageDialog(this,"PAR" );
					
					
				}else {
					getContentPane().setBackground(Color.MAGENTA);
					JOptionPane.showMessageDialog(this,"IMPAR" );
				}
			}
		} catch (Exception e2) {
			setTitle("ERROR");
			getContentPane().setBackground(Color.RED);
		}
		
	}

}
