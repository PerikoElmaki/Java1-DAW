package ejerciciosGUIs;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TablaMultiplicar2 extends JFrame implements ActionListener {
	//componentes 
	JLabel label;
	JTextField numero;
	JButton boton;
	JTextArea area;
	JScrollPane scp;
	JPanel panel1,panelarea;
	
	public TablaMultiplicar2() {
		setLayout(new FlowLayout());
		
		label=new JLabel("Número: ");
		add(label);
		
		numero=new JTextField();
		add(numero);

		boton=new JButton("Generar tablas");
		boton.setFont(new Font("Arial",Font.BOLD,12));
		boton.addActionListener(this);
		add(boton);
		
		area=new JTextArea();
		area.setLineWrap(true);
		add(area);
		
		//añadimos paneles a frame
		
	}
	
	
	public static void main(String[] args) {
		TablaMultiplicar2 v=new TablaMultiplicar2();
		v.setSize(400,300);
		v.setTitle("TABLAS Multiplicar");
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			try {
				int num=Integer.parseInt(numero.getText());
				if(num<1 || num>10) {
					area.setText("Debes introducir un nº entero entre 1 y 10");
				}else {
					String tabla="";
					for(int i=1; i<=10; i++) {
						tabla+=num+" x "+i+" = "+(num*i)+"\n";
					}
					area.setText(tabla);
				
				}
			} catch (Exception e2) {
				area.setText("Debes introducir un nº entero entre 1 y 10");
			}
		}
		
	}

}
