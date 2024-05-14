package pruebaPaneles;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;

public class Prueba extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Prueba() {
		
		/*
		 * Creamos los paneles que serán visibles cuando se pulsen los botones 
		 */
		
		NuevoContacto n=new NuevoContacto();
		n.setBounds(181, 94, 451, 306);
		n.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBounds(5, 5, 159, 395);
		panelMenu.setBackground(new Color(0, 128, 192));
		
		JPanel panelTit = new JPanel();
		panelTit.setBounds(257, 5, 231, 40);
		
		
		
		
		
		JPanel panelContenido = new JPanel();
		panelContenido.setBounds(181, 94, 451, 306);
		panelContenido.setVisible(false);
		panelContenido.setBackground(new Color(192, 192, 192));
		GroupLayout gl_panelContenido = new GroupLayout(panelContenido);
		gl_panelContenido.setHorizontalGroup(
			gl_panelContenido.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 451, Short.MAX_VALUE)
		);
		gl_panelContenido.setVerticalGroup(
			gl_panelContenido.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 306, Short.MAX_VALUE)
		);
		panelContenido.setLayout(gl_panelContenido);
		
	
		
		JLabel TituloAgenda = new JLabel("AGENDA");
		TituloAgenda.setFont(new Font("Broadway", Font.PLAIN, 23));
		GroupLayout gl_panelTit = new GroupLayout(panelTit);
		gl_panelTit.setHorizontalGroup(
			gl_panelTit.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelTit.createSequentialGroup()
					.addContainerGap(65, Short.MAX_VALUE)
					.addComponent(TituloAgenda, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(44))
		);
		gl_panelTit.setVerticalGroup(
			gl_panelTit.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelTit.createSequentialGroup()
					.addContainerGap(13, Short.MAX_VALUE)
					.addComponent(TituloAgenda))
		);
		panelTit.setLayout(gl_panelTit);
		
		JButton botonNuevo = new JButton("Nuevo Contacto");
		
		JButton btnNewButton = new JButton("New button");
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		GroupLayout gl_panelMenu = new GroupLayout(panelMenu);
		gl_panelMenu.setHorizontalGroup(
			gl_panelMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelMenu.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
						.addComponent(botonNuevo, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
					.addGap(21))
		);
		gl_panelMenu.setVerticalGroup(
			gl_panelMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addGap(108)
					.addComponent(botonNuevo)
					.addGap(27)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addContainerGap(173, Short.MAX_VALUE))
		);
		panelMenu.setLayout(gl_panelMenu);
		contentPane.add(panelMenu);
		contentPane.add(panelTit);
		contentPane.add(panelContenido);
		
	
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Esbozo de método generado automáticamente
		
	}
}
