package gui7;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Fortaleza extends JFrame implements ActionListener{
	//componentes 
	JMenuBar menubar;
	JMenu menu;
	JMenuItem mrequis,msalir;
	JLabel usu,contra,cofirm;
	JTextField textusu;
	JPasswordField textcontra,textconfirm;
	JButton comprobar,limpiar;
	JPanel panelgrid,panelbot;
	
	public Fortaleza() {
		//Menu 
		menubar=new JMenuBar();
		setJMenuBar(menubar); 
		menu=new JMenu("Menú");
		menubar.add(menu);
		
		mrequis=new JMenuItem("Requisitos");
		menu.add(mrequis);
		mrequis.addActionListener(this);
		
		msalir=new JMenuItem("Salir");
		menu.add(msalir);
		msalir.addActionListener(this);
		
		//ventana
		
		panelgrid=new JPanel(new GridLayout(8,1,10,10));
		
		usu=new JLabel("Usuario: ");
		panelgrid.add(usu);
		textusu=new JTextField(18);
		panelgrid.add(textusu);
		
		contra=new JLabel("Contraseña: ");
		panelgrid.add(contra);
		textcontra=new JPasswordField(18);
		panelgrid.add(textcontra);
		
		cofirm=new JLabel("Confirmar contraseña: ");
		panelgrid.add(cofirm);
		textconfirm=new JPasswordField(18);
		panelgrid.add(textconfirm);
		JLabel labelvac=new JLabel(" ");
		panelgrid.add(labelvac);
		
		panelbot=new JPanel(new GridLayout(1,2,20,50));
		comprobar=new JButton("Comprobar");
		comprobar.addActionListener(this);
		limpiar=new JButton("Limpiar");
		limpiar.addActionListener(this);
		
		panelbot.add(comprobar);
		panelbot.add(limpiar);
		panelgrid.add(panelbot);
		
		
		
		setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
		add(panelgrid);
		
	}
	
	
	public static void main(String[] args) {
		Fortaleza v=new Fortaleza();
		v.setVisible(true);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setSize(400,450);
		v.setLocationRelativeTo(null);

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comprobar) {
			String login=textusu.getText();
			String contraseña=new String(textcontra.getPassword());
			String confirm=String.valueOf(textconfirm.getPassword());
			
			String avisovacio="";
			if(login.isEmpty())
				avisovacio="introducir un login de usuario";
			else if(contraseña.isEmpty())
				avisovacio="introducir una contraseña";
			else if(confirm.isEmpty())
				avisovacio="confirmar la contraseña";
			
			if(!avisovacio.isEmpty())
				JOptionPane.showMessageDialog(null, "Debes "+avisovacio,"Aviso",JOptionPane.WARNING_MESSAGE);
			else {
				//COntraseña no coincide 
				if(!contraseña.equals(confirm))
					JOptionPane.showMessageDialog(null, "No coinciden las contraseñas","Error",JOptionPane.ERROR_MESSAGE);
				else {
					//Comprobaciones 
					//Caracteres 
					if(contraseña.length()<9)
						JOptionPane.showMessageDialog(null, "La contraseña debe tener más de 8 caracteres","Contraseña no válida",JOptionPane.WARNING_MESSAGE);
					else if(contraseña.length()>23)
						JOptionPane.showMessageDialog(null, "La contraseña debe tener un máximo de 24 caracteres","Contraseña no válida",JOptionPane.WARNING_MESSAGE);
					else if(contraseña.indexOf(login)> -1)
						JOptionPane.showMessageDialog(null, "La contraseña no puede contener el login del usuario","Contraseña no válida",JOptionPane.WARNING_MESSAGE);
					else {
						int contamin,contamay,contanum;
						contamin=contamay=contanum=0;
						
						for(int i=0; i<contraseña.length(); i++) {
							char c=contraseña.charAt(i);
						
							if(c>='a'&&c<='z')
								contamin++;
							if(c>='A'&&c<='Z')
								contamay++;
							if((int)c>=0 && c>=9)
								contanum++;
						}
						
						if(contamin<1)
							JOptionPane.showMessageDialog(null, "La contraseña debe tener contener al menos una letra minúscula","Contraseña no válida",JOptionPane.WARNING_MESSAGE);
						else if(contamay<1)
							JOptionPane.showMessageDialog(null, "La contraseña debe tener contener al menos una letra mayúscula","Contraseña no válida",JOptionPane.WARNING_MESSAGE);
						else if(contanum<1)
							JOptionPane.showMessageDialog(null, "La contraseña debe tener contener al menos un número","Contraseña no válida",JOptionPane.WARNING_MESSAGE);
						else {
							JOptionPane.showMessageDialog(null, "La contraseña cumple los requisitos","Contraseña válida",JOptionPane.INFORMATION_MESSAGE);
						}
					}
					
				}
			}
		}
		if(e.getSource()==limpiar) {
			textconfirm.setText("");
			textcontra.setText("");
			textusu.setText("");
		}
		
		
		if(e.getSource()==mrequis) {
			VentanaSecun v2=new VentanaSecun();
			v2.setVisible(true);
			v2.setSize(400,450);
			v2.setLocationRelativeTo(null);
		}
		if(e.getSource()==msalir)
			System.exit(0);
	}

}
