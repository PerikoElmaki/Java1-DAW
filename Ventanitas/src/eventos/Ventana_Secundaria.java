package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana_Secundaria extends JDialog implements ActionListener{

	private JLabel label;
	private JButton boton;
	
	/**
	 * Le pasamos el JFrame ventana principal como padre, para que JDialog sea visible por encima
	 * La flag modal quiere decir que el JDialog impedirá el acceso a la otra ventana hasta
	 *  que se cierre
	 */
	public Ventana_Secundaria(Ventana_principal parent, boolean modal) {
		//Invocamos constructor de clase padre
		super(parent,modal);
		
		setLayout(null);
		setBounds(300,250,250,200);
		
		label=new JLabel("ESta es la ventana secundaria");
		label.setBounds(35,30,200,30);
		add(label);
		
		boton=new JButton("Volver");
		boton.setBounds(40,80,150,30);
		add(boton);
		boton.addActionListener(this);
	}

	/**
	 * Implementa la accion del boton
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton)
			setVisible(false);
		
	}
}
