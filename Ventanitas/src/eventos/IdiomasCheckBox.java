package eventos;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;

public class IdiomasCheckBox extends JFrame implements ChangeListener {
	//Componentes 
	JLabel label;
	JCheckBox eng,fr,ita;
	
	public IdiomasCheckBox() {
		setLayout(null);
		
		label=new JLabel();
		label.setText("Selecciona uno o varios idiomas: ");
		label.setBounds(40,20,300,30);
		add(label);
		
		eng=new JCheckBox("Inglés");
		eng.setBounds(40,70,100,30);
		add(eng);
		
		fr=new JCheckBox("Francés");
		fr.setBounds(140,70,100,30);
		add(fr);
		
		ita=new JCheckBox("Italiano");
		ita.setBounds(240,70,100,30);
		add(ita);
		
		//añadmos al metodo change
		eng.addChangeListener(this);
		fr.addChangeListener(this);
		ita.addChangeListener(this);
		
	}
	
	public static void main(String[] args) {
		IdiomasCheckBox v=new IdiomasCheckBox();
		v.setTitle("Idiomas");
		v.setSize(370,180);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setVisible(true);
		v.setLocationRelativeTo(null);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		String cad="Idiomas: ";
		if(eng.isSelected()) 
			cad+="Inglés, ";
		if(fr.isSelected())
			cad+="Francés, ";
		if(ita.isSelected())
			cad+="Italiano, ";
		
		//quitamos la coma final 
		cad=cad.substring(0,cad.length()-2);
		label.setText(cad);
		
	}

}
