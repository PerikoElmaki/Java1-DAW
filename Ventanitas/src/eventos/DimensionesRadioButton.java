package eventos;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class DimensionesRadioButton extends JFrame implements ChangeListener{
	//Componentes 
	private JRadioButton r1,r2,r3;
	private ButtonGroup grupob;
	
	public DimensionesRadioButton() {
		setLayout(null);
		
		grupob=new ButtonGroup();
		
		r1=new JRadioButton("640x480");
		r1.setBounds(50,50,100,25);
		grupob.add(r1);
		r1.addChangeListener(this);
		add(r1);
		
		r2=new JRadioButton("800x600");
		r2.setBounds(50,100,100,25);
		r2.addChangeListener(this);
		grupob.add(r2);
		add(r2);
		
		r3=new JRadioButton("1024x768");
		r3.setBounds(50,150,100,25);
		r3.addChangeListener(this);
		grupob.add(r3);
		add(r3);
	}
	public static void main(String[] args) {
		DimensionesRadioButton v=new DimensionesRadioButton();
		v.setTitle("Dimensiones");
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setSize(300,250);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(r1.isSelected())
			setSize(640,480);
		if(r2.isSelected())
			setSize(800,600);
		if(r3.isSelected())
			setSize(1024,768);
		
	}

}
