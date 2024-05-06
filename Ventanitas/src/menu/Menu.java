package menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu extends JFrame implements ActionListener{
	//COmponentes 
	JMenuBar menubar;
	JMenu menu;
	JMenuItem mitem1,mitem2,mitem3;
	
	public Menu() {
		setLayout(null);
		
		//Creamos el menubar y asociamos con JFrame
		menubar=new JMenuBar();
		setJMenuBar(menubar); //añadirlo a ventana
		
		//Creamos el menu y añadimos a menubar 
		//puede haber un menu dentro de otro menu 
		menu=new JMenu("Colores");
		menubar.add(menu);
		
		//Creamos item y asociamos a menu
		mitem1=new JMenuItem("Rojo");
		menu.add(mitem1);
		mitem1.addActionListener(this);
		
		mitem2=new JMenuItem("Verde");
		menu.add(mitem2);
		mitem2.addActionListener(this);
		
		mitem3=new JMenuItem("Azul");
		menu.add(mitem3);
		mitem3.addActionListener(this);
	}
	public static void main(String[] args) {
		Menu v=new Menu();
		v.setSize(280,200);
		v.setVisible(true);
		v.setResizable(false);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mitem1)
			getContentPane().setBackground(Color.red);
		if(e.getSource()==mitem2)
			getContentPane().setBackground(Color.green);
		if(e.getSource()==mitem3)
			getContentPane().setBackground(Color.blue);
		
	}

}
