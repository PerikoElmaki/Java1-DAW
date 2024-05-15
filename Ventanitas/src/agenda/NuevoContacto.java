package agenda;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NuevoContacto extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton boton;
	private JTextField textnombrecontacto,texttlfcontacto;
	
	final static String rutaArchivo="H:\\Mi unidad\\ProyectosJava\\agenda.txt";
	

	
	/**
	 * Create the panel.
	 */
	public NuevoContacto() {
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		JPanel panelprinc=new JPanel(new GridLayout(3,1,20,20));
		
		JPanel panel1=new JPanel(new GridLayout(2,1,10,10));
		JLabel label1=new JLabel("Introduce el nombre del nuevo contacto: ");
		textnombrecontacto=new JTextField(20);
		panel1.add(label1);
		panel1.add(textnombrecontacto);
		
		JPanel panel2=new JPanel(new GridLayout(2,1,10,10));
		JLabel label2=new JLabel("Introduce el número de teléfono: ");
		texttlfcontacto=new JTextField(20);
		panel2.add(label2);
		panel2.add(texttlfcontacto);
		
		
		JPanel panel3=new JPanel(new FlowLayout(FlowLayout.CENTER,20,20));
		boton=new JButton("Aceptar");
		boton.addActionListener(this);
		panel3.add(boton);
		
		panelprinc.add(panel1);
		panelprinc.add(panel2);
		panelprinc.add(panel3);
		
		add(panelprinc);
		
		
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == boton) {
	        try {
	        	
	            // Controlamos que se hayan rellenado ambos campos
	            if (textnombrecontacto.getText().isEmpty() || texttlfcontacto.getText().isEmpty()) {
	            	JOptionPane.showMessageDialog(null, "Rellena todos los campos para agregar el contacto","ERROR",JOptionPane.ERROR_MESSAGE);
	            } else {
	            	String nomNuevo = textnombrecontacto.getText();
	                int tlfNuevo = Integer.parseInt(texttlfcontacto.getText());
	                // Abrimos archivo
	                File f = new File(rutaArchivo);

	                // Primero comprobamos que el contacto no exista
	                boolean encontrado = false;

	            	try {
	        			Scanner s=new Scanner(f);  
	        			while(s.hasNextLine() && !encontrado) {
	        				String linea=s.nextLine(); 
	        				String nameAgenda=linea.substring(0,linea.indexOf(':')).trim(); //coges subcadena del principio, hasta el caracter >
	        				
	        				if(nameAgenda.compareToIgnoreCase(nomNuevo)==0){//si el nombre coincide
	        					encontrado=true;
	        				}		
	        			}
	        			s.close();
	        			
	        		} catch (FileNotFoundException e3) {
	        			JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo","ERROR",JOptionPane.ERROR_MESSAGE);
	        		}

	                if (encontrado==true) {
	                    // Obtener el componente de nivel superior (JFrame) y pasarlo como primer parámetro
	                    JOptionPane.showMessageDialog(null, "El contacto ya existe en la agenda", "Contacto Existente", JOptionPane.INFORMATION_MESSAGE);
	                } else {
	                    // Si no se encuentra el contacto, lo añadimos 
	                	FileWriter fw = null;
	            		PrintWriter pw=null;
	            		try {
	            			System.out.println("añadido");
	            			fw=new FileWriter(rutaArchivo,true);//El true para que sobreescriba, si no crea un nuevo archivo cada vez
	            			pw=new PrintWriter(fw);
	            			pw.println(nomNuevo+":"+tlfNuevo); //añadimos contacto
	            			
	            			JOptionPane.showMessageDialog(null,"Contacto añadido");
	            	
	            		} catch (Exception e3) {
	            			System.out.println("ERROR con el archivo de la agenda");
	            		}finally {//por si falla o no, se hace igual 
	            			try {
	            				if(fw!=null) { //si se ha abierto bien antes(no es null), se cierra
	            					fw.close();
	            					pw.close();
	            				}
	            			} catch (Exception e2) {
	            				System.out.println("Error al cerrar el archivo");
	            			}
	            		}
	                	
	                }
	               

	            }
	        } catch (Exception e2) {
	            // Manejar excepciones aquí
	        }
	    }
	}

	

}
