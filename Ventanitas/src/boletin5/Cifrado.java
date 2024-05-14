package boletin5;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Cifrado extends JFrame implements ActionListener {
	//Componentes 
	JLabel elige,labelclaro,labelcifrado,vacio;
	JRadioButton rcesar,rrot,rriel;
	ButtonGroup grupoBotones;
	JButton cifrar,borrar;
	JTextField tclaro,tcifrado;
	JPanel panelradio,paneltexto,panelprinc;
	
	public Cifrado() {
		elige=new JLabel("Elige una opción de cifrado: ");
		grupoBotones=new ButtonGroup();
		
		rcesar=new JRadioButton("Cifrado del César");
		rcesar.addActionListener(this);
		rrot=new JRadioButton("Cifrado ROT13");
		rrot.addActionListener(this);
		rriel=new JRadioButton("Transposición de Riel");
		rriel.addActionListener(this);
		
		grupoBotones.add(rcesar);
		grupoBotones.add(rrot);
		grupoBotones.add(rriel);
		
		panelradio=new JPanel(new GridLayout(5,1,10,19));
		panelradio.add(elige);
		panelradio.add(rcesar);
		panelradio.add(rrot);
		panelradio.add(rriel);
		
		cifrar=new JButton("Cifrar");
		cifrar.addActionListener(this);
		borrar=new JButton("Borrar");
		borrar.addActionListener(this);
		
		panelradio.add(cifrar);
		
		paneltexto=new JPanel(new GridLayout(6,1,5,10));
		labelclaro=new JLabel("Texto en claro: ");
		labelcifrado=new JLabel("Texto cifrado: ");
		vacio=new JLabel(" ");
		tclaro=new JTextField(20);
		tcifrado=new JTextField(20);
		
		paneltexto.add(labelclaro);
		paneltexto.add(tclaro);
	
		paneltexto.add(labelcifrado);
		paneltexto.add(tcifrado);
		paneltexto.add(vacio);
		paneltexto.add(borrar);
		
		
		panelprinc=new JPanel(new GridLayout(1,2,20,50));
		panelprinc.add(panelradio);
		panelprinc.add(paneltexto);
		
		
		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		add(panelprinc);
		
	}
	
	public static void main(String[] args) {
		Cifrado v=new Cifrado();
		v.setSize(600,300);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);
		v.setVisible(true);
		v.setTitle("Cifrado");
		

	}
	/**
	 * Cifrado por la transposición de Riel
	 * El mensaje se cifra alternando las letras en dos cadenas separadas y concatenando las dos cadenas
	 * @return criptograma que se obtiene
	 */
	public String trasposicion(String mensaje) {
		String criptograma="";
		String par="";
		String impar="";
		for(int i=0; i<mensaje.length(); i++) {
			if(i%2==0) {
				par+=mensaje.charAt(i);
			}
			if(i%2!=0) 
				impar+=mensaje.charAt(i);
			
		}
		criptograma=par+impar;
		return criptograma;
		
	}
	
	/**
	 * Cifrado por sustitución
	 * Sustituye cada carácter del mensaje a cifrar por el carácter que ocupa 'clave' posiciones en adelante
	 * en el alfabeto
	 * Cualquier otro carácter(incluidos espacios) se copiarán igual, sin cifrar.
	 * Considera el alfabeto circular, despues de la Z va la A 
	 * @param clave a aplicar en el cifrado por sustitución
	 * @return criptograma al que se le ha aplicado el cifrado por sustitución
	 */
	public String Sustitucion(int clave,String mensaje) {
		String cifrado="";
		for(int i=0; i<mensaje.length(); i++) {
			//Primero controlamos las mayúsculas, cambiarlas de pos
			if(mensaje.charAt(i)>='A'&& mensaje.charAt(i)<='Z') {
				int carac=mensaje.charAt(i)+clave;
				if((char)carac>'Z') //si es mayor a la Z, que de la vuelta 
					carac-=26;
				cifrado+=(char)carac;
			//Después las minúsculas 
			}else if(mensaje.charAt(i)>='a'&& mensaje.charAt(i)<='z') {
				int carac=mensaje.charAt(i)+clave;
				if((char)carac >'z')//si es mayor que la z
					carac-=26;
				cifrado+=(char)carac;
			//Ahora copiamos espacios tal cual
			}else
				cifrado+=mensaje.charAt(i);
				
		}
		return cifrado;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cifrar) {
			if(tclaro.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debes introducir el texto en claro","Aviso",JOptionPane.WARNING_MESSAGE);
			}else {
				try {
					String textoAcifrar=tclaro.getText();
					if(rriel.isSelected()) {
						tcifrado.setText(trasposicion(textoAcifrar));
					}else if(rcesar.isSelected()) {
						tcifrado.setText(Sustitucion(3, textoAcifrar));
					}else if(rrot.isSelected()) {
						tcifrado.setText(Sustitucion(13, textoAcifrar));
					}else
						JOptionPane.showMessageDialog(null, "Debes elegir una opción de cifrado","Aviso",JOptionPane.WARNING_MESSAGE);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error con el tipo de datos introducido","ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		if(e.getSource()==borrar) {
			tcifrado.setText(" ");
			tclaro.setText(" ");
		}
		
	}

}
