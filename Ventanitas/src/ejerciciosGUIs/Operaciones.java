package ejerciciosGUIs;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Operaciones  extends JFrame implements ActionListener{
	//Componentes 
	JPanel panel1,panel2;
	JLabel operandos,result,operaciones;
	JTextField op1,op2,res;
	ButtonGroup grupoBotones;
	JRadioButton suma,resta,multi,div,resto;
	
	public Operaciones() {
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		
		panel1=new JPanel(new GridLayout(5,1,35,35));
		operandos=new JLabel("Operandos: ");
		panel1.add(operandos);
		
		op1=new JTextField();
		op2=new JTextField();
		panel1.add(op1);
		panel1.add(op2);
		
		result=new JLabel("Resultado: ");
		panel1.add(result);
		
		res=new JTextField();
		panel1.add(res);
		
		panel2=new JPanel(new GridLayout(6,1,20,20));
		operaciones=new JLabel("Operaciones: ");
		panel2.add(operaciones);
		
		grupoBotones=new ButtonGroup();
		suma=new JRadioButton("Suma");
		suma.addActionListener(this);
		grupoBotones.add(suma);
		
		resta=new JRadioButton("Resta");
		resta.addActionListener(this);
		grupoBotones.add(resta);
		
		multi=new JRadioButton("Multi");
		multi.addActionListener(this);
		grupoBotones.add(multi);
		
		div=new JRadioButton("Division");
		div.addActionListener(this);
		grupoBotones.add(div);
		
		resto=new JRadioButton("Resto");
		resto.addActionListener(this);
		grupoBotones.add(resto);
		
		panel2.add(suma);
		panel2.add(resta);
		panel2.add(multi);
		panel2.add(div);
		panel2.add(resto);
		
		add(panel1);
		add(panel2);
		
	}
	
	public static void main(String[] args) {
		Operaciones v=new Operaciones();
		v.setSize(400,400);
		v.setTitle("Introduce Operandos");
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int n1=Integer.parseInt(op1.getText());
			int n2=Integer.parseInt(op2.getText());
			if(e.getSource()==suma) {
				res.setText(String.valueOf(n1+n2));
				setTitle("Introduce Operandos");
			}
			if(e.getSource()==resta) {
				res.setText(String.valueOf(n1-n2));
				setTitle("Introduce Operandos");
			}
			if(e.getSource()==multi) {
				res.setText(String.valueOf(n1*n2));
				setTitle("Introduce Operandos");
			}
			if(e.getSource()==div) {
				if(n2==0 || n1==0) {
					res.setText("");
					setTitle("ERROR");
				
				}else {
					setTitle("Introduce Operandos");
					res.setText(String.valueOf(n1/n2));
					
				}
			}
				
			if(e.getSource()==resto) {
				if(n2==0 || n1==0) {
					setTitle("ERROR");
					res.setText("");
				
				}else {
					res.setText(String.valueOf(n1%n2));
					setTitle("Introduce Operandos");
				}
			}
			
		} catch (Exception e2) {
			setTitle("ERROR");
			res.setText("");
		}
	
		
	}

}
