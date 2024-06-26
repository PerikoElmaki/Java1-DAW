package agenda;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;


import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class Principal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane,panelBackgr ;
	private JButton btnNuevoCont,btnListarContactos;
	private NuevoContacto n;
	private ListarContactos l;
	
	public final static String rutaArchivo="C:\\Users\\El Maki\\Mi unidad\\ProyectosJava";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelBackgr = new JPanel();
		
		panelBackgr.setBounds(0, 0, 784, 462);
		contentPane.add(panelBackgr);
		panelBackgr.setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(32, 33, 29));
		panelMenu.setBounds(0, 0, 211, 462);
		panelBackgr.add(panelMenu);
		panelMenu.setLayout(null);
		
		btnNuevoCont = new JButton("Nuevo Contacto");
		btnNuevoCont.addActionListener(this);
		btnNuevoCont.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNuevoCont.setBounds(35, 140, 144, 23);
		panelMenu.add(btnNuevoCont);
		
		btnListarContactos = new JButton("Listar Contactos");
		btnListarContactos.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnListarContactos.setBounds(35, 199, 144, 23);
		panelMenu.add(btnListarContactos);
		btnListarContactos.addActionListener(this);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBounds(291, 35, 409, 43);
		panelBackgr.add(panelTitle);
		
		JLabel Labeltitle = new JLabel("AGENDA");
		Labeltitle.setFont(new Font("Dialog", Font.BOLD, 26));
		GroupLayout gl_panelTitle = new GroupLayout(panelTitle);
		gl_panelTitle.setHorizontalGroup(
			gl_panelTitle.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelTitle.createSequentialGroup()
					.addContainerGap(148, Short.MAX_VALUE)
					.addComponent(Labeltitle, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addGap(97))
		);
		gl_panelTitle.setVerticalGroup(
			gl_panelTitle.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTitle.createSequentialGroup()
					.addComponent(Labeltitle)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelTitle.setLayout(gl_panelTitle);
		
		setLocationRelativeTo(null);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnNuevoCont) {
			NuevoContacto n = new NuevoContacto();
			l.setVisible(false);
			n.setBounds(211, 139, 574, 323);
			panelBackgr.validate();
			n.setVisible(true);
			panelBackgr.add(n);
			
			
		}
		if(e.getSource()==btnListarContactos) {
			n.setVisible(false);
			ListarContactos l=new ListarContactos();
			System.out.println("ke pasa");
		
			
			l.setBounds(211, 139, 574, 323);
		
			l.setVisible(true);
			panelBackgr.add(l);
		}
		
			
	}
}
