package ejerciciosGUIs;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

public class Translate extends JFrame implements ActionListener {
	
	//ruta text 
	private static String ruta="C:\\Users\\El Maki\\Mi unidad\\ProyectosJava\\dictionary.txt";

	//Componentes 
	JLabel ingles,español;
	JTextField textingles,textesp;
	JButton boton;
	JPanel panel1,panel2,panel3;
		
	public Translate() {
			
		//Panel 1 izquierda
		textingles=new JTextField(10);
		ingles=new JLabel("Inglés",JLabel.CENTER);

		panel1=new JPanel(new GridLayout(2,1,0,10));
		panel1.add(ingles);
		panel1.add(textingles);
			
			
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
		textesp=new JTextField(10);
		español=new JLabel("Español", JLabel.CENTER);
		panel3=new JPanel(new GridLayout(0,1,0,10));
		panel3.add(español);
		panel3.add(textesp);
			
		//AÑADIMOS LOS 3 PANELES A LA VENTANA 
		setLayout(new FlowLayout(FlowLayout.CENTER,20,40)); //el de ventana
		add(panel1);
		add(panel2);
		add(panel3);
			
			
	}
	
	/**
	 * Busca la palabra en español y devuelve en inglés
	 * @param pal en español
	 * @return en ingles
	 */
	private static String buscarPalabra(String esp) {
		String trans="";
		boolean encontrado=false;
		File f=new File(ruta);
		
		try {
			Scanner s=new Scanner(f);  
			while(s.hasNextLine() && !encontrado) {
				String linea=s.nextLine(); 
				String ingles=linea.substring(0, linea.indexOf('=')).trim(); //coges subcadena del principio, hasta el caracter >
				
				if(ingles.compareToIgnoreCase(esp)==0){//si el nombre coincide
					trans=linea.substring(linea.indexOf('=')+1).trim(); 
					encontrado=true;
				}else
					trans="No está en el diccionario";
			}
			s.close();
			
		} catch (FileNotFoundException e) {
			return "No se encuentra en el diccionario"; //si no encuentra
		}
		return trans;
	}
		
	public static void main(String[] args) {
		Translate v=new Translate();
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setSize(400,200);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setTitle("Google translate");
		
		ImageIcon icono=new ImageIcon("C:\\Users\\El Maki\\Mi unidad\\ProyectosJava\\g.png");
		v.setIconImage(icono.getImage());
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			try {
				String portraducir=textingles.getText();
				//aplicamos funcion y la insertamos en el otro textfield
				textesp.setText(buscarPalabra(portraducir));
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this,"ERROR en la traducción","ERROR",JOptionPane.ERROR_MESSAGE);// en vez de error, hay más 
			}
		}
		
	}

}
