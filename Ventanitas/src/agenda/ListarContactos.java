package agenda;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ListarContactos extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JTextArea area;
	private JButton boton;
	private JPanel panel,panelbot;
	

	/**
	 * Create the panel.
	 */
	public ListarContactos() {
		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		
		panel=new JPanel(new GridLayout(2,1,20,20));
		area=new JTextArea(20,30);
		panel.add(area);
		
		add(panel);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Esbozo de método generado automáticamente
		
	}

}
