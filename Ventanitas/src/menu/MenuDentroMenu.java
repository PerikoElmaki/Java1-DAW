package menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuDentroMenu extends JFrame implements ActionListener{
	//COmponentes 
	JMenuBar menubar;
	JMenu menuprinc,menuColor,menuTam;
	JMenuItem mitemC1,mitemC2,mitemT1,mitemT2;
	
	/*
	 * Constructor 
	 */
	public MenuDentroMenu() {
		setLayout(null);
		
		menubar=new JMenuBar();
		setJMenuBar(menubar);
		
		//Barra opciones
		menuprinc=new JMenu("Opciones");
		menubar.add(menuprinc);
		
		//lo añadimos a menu opciones
		menuColor=new JMenu("Color");
		menuprinc.add(menuColor);
		
		menuTam=new JMenu("Tamaño");
		menuprinc.add(menuTam);
		
		mitemC1=new JMenuItem("Rojo");
		mitemC1.addActionListener(this);
		menuColor.add(mitemC1);
		
		mitemC2=new JMenuItem("Azul");
		mitemC2.addActionListener(this);
		menuColor.add(mitemC2);
		
		mitemT1=new JMenuItem("640x680");
		mitemT2=new JMenuItem("1024x768");
		mitemT2.addActionListener(this);
		mitemT1.addActionListener(this);
		menuTam.add(mitemT1);
		menuTam.add(mitemT2);
		
		
	}
	
	public static void main(String[] args) {
		MenuDentroMenu v=new MenuDentroMenu();
		
		v.setSize(300,200);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setVisible(true);
		v.setResizable(false);
		
		v.setTitle("Menu2");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mitemC1) {
			getContentPane().setBackground(Color.red);
		}
		if(e.getSource()==mitemC2)
			getContentPane().setBackground(Color.blue);
		if(e.getSource()==mitemT1)
			setSize(640,480);
		if(e.getSource()==mitemT2)
			setSize(1024,768);
		
	}

}
