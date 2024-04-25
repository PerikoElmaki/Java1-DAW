package ejerciciosGUIs;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NRomanos extends JFrame implements ActionListener{
	
	//Componentes 
	JLabel decimal,romano;
	JTextField enteroAconvertir,romanoConvertido;
	JButton boton;
	JPanel panel1,panel2,panel3;
	
	public NRomanos() {
		
		//Panel 1 izquierda
		enteroAconvertir=new JTextField(10);
		decimal=new JLabel("Nº decimal",JLabel.CENTER);

		panel1=new JPanel(new GridLayout(2,1,0,10));
		panel1.add(decimal);
		panel1.add(enteroAconvertir);
		
		
		//Panel 2 boton imagen 
		boton=new JButton(new ImageIcon("C:\\Users\\El Maki\\Mi unidad\\ProyectosJava\\flecha.png"));
		//boton transparente 
		boton.setContentAreaFilled(false);  //quitamos relleno
		boton.setBorder(null); 				//quitamos bordes
		boton.addActionListener(this);
		//añadimos panel boton 
		panel2=new JPanel();
		panel2.setLayout(new GridLayout(0,1,5,5));
		panel2.add(boton);
		
		//Tercer panel con label y conversion
		romanoConvertido=new JTextField(10);
		romano=new JLabel("Nº romano", JLabel.CENTER);
		panel3=new JPanel(new GridLayout(0,1,0,10));
		panel3.add(romano);
		panel3.add(romanoConvertido);
		
		//AÑADIMOS LOS 3 PANELES A LA VENTANA 
		setLayout(new FlowLayout(FlowLayout.CENTER,20,40)); //el de ventana
		add(panel1);
		add(panel2);
		add(panel3);
		
		
		
	}
	/**
	 * Funcionalidad de convertir 
	 * @param dato numerop a convertir
	 * @return string con numero romano
	 */
	private String decimalRomano(int dato) {
		int  d=dato;
		String s="";
		while (d>0) {
			while (d>=1000) {d-=1000; s+="M"; } 
			while (d>=900) {d-=900; s+="CM"; }
			while (d>=500) {d-=500; s+="D"; }
			while (d>=400) {d-=400; s+="CD"; }
			while (d>=100) {d-=100; s+="C"; }
			while (d>=90) {d-=90; s+="XC"; }
			while (d>=50) {d-=50; s+="L"; }
			while (d>=40) {d-=40; s+="XL"; }
			while (d>=10) {d-=10; s+="X"; }
			while (d>=9) {d-=9; s+="IX"; }
			while (d>=5) {d-=5; s+="V"; }
			while (d>=4) {d-=4; s+="IV"; }
			while (d>=1) {d-=1; s+="I"; }
		}
		return s;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			try {
				//cogemos dato de textfield(lo da en String)
				int numeroPaconvertir=Integer.parseInt(enteroAconvertir.getText());
				romanoConvertido.setText(decimalRomano(numeroPaconvertir));
			} catch (Exception e2) {
				romanoConvertido.setText("ERROR");
			}
		}
		
	}
	public static void main(String[] args) {
		NRomanos v=new NRomanos();
		v.setTitle("Conversor decimal > Numero romano");
		v.setLocationRelativeTo(null);
		v.setSize(400,200);
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	

}
