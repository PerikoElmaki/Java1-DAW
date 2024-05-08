package menu;


import java.awt.GridLayout;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class EditorTexto extends JFrame implements ActionListener{
	//Componentes 
	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem nuevo,abrir,guardar,salir;
	private JTextArea area;
	private JScrollPane scpanel;
	
	/*
	 * Constructor 
	 */
	public EditorTexto() {
		
		menubar=new JMenuBar(); 
		setJMenuBar(menubar);
		menu=new JMenu("Archivo"); //creamos menu archivo 
		menubar.add(menu);
		
		nuevo=new JMenuItem("Nuevo");
		menu.add(nuevo);
		nuevo.addActionListener(this);
		
		abrir=new JMenuItem("Abrir");
		menu.add(abrir);
		abrir.addActionListener(this);
		
		guardar=new JMenuItem("Guardar");
		menu.add(guardar);
		guardar.addActionListener(this);
		
		salir=new JMenuItem("Salir");
		menu.add(salir);
		salir.addActionListener(this);
		
		area=new JTextArea();
		area.setLineWrap(true);           //para que salte de linea
		scpanel=new JScrollPane(area);
		
		setLayout(new GridLayout(1,0));
		add(scpanel);
	}
	
	public static void main(String[] args) {
		EditorTexto v=new EditorTexto();
		v.setTitle("Editor de texto");
		v.setLocationRelativeTo(null);
		v.setSize(500,300);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==salir)
			System.exit(0);
		if(e.getSource()==nuevo)
			area.setText("");
		if(e.getSource()==abrir)
			abrir();
		if(e.getSource()==guardar)
			guardar();
		
	}
	
	public void guardar() {
		JFileChooser fileChooser=new JFileChooser("H:\\Mi unidad\\ProyectosJava");
		fileChooser.showSaveDialog(fileChooser);
		FileWriter fw=null;
		PrintWriter pw=null;
		
		try {
			fw=new FileWriter(fileChooser.getSelectedFile().getAbsolutePath());
			pw=new PrintWriter(fw);
			
			//escritura del fichero 
			pw.println(area.getText());
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error con el archivo especificado","Error",JOptionPane.ERROR_MESSAGE);
		}finally {
			try {
				if(fw!=null)
					fw.close();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Error en el cierre del archivo","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public void abrir() {
		
		JFileChooser filechooser=new JFileChooser("C:\\Users\\Juanma R\\Documents\\DAW\\Programación");
		
		FileNameExtensionFilter filtro=new FileNameExtensionFilter("Archivos de texto (.txt)","txt");
		filechooser.setFileFilter(filtro);
		
		filechooser.showOpenDialog(filechooser);
		
		try {
			
			String ruta=filechooser.getSelectedFile().getAbsolutePath();
			File f=new File(ruta);
			Scanner sc=new Scanner(f);
			area.setText("");
			while(sc.hasNextLine()) {
				area.append(sc.nextLine());
				area.append("\n");
			}
			sc.close();
			
		}catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo", "Error", JOptionPane.ERROR_MESSAGE);
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "No se ha selecionado ningún archivo", "Message", JOptionPane.ERROR_MESSAGE);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha podido cargar el arhivo especificado", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
}
