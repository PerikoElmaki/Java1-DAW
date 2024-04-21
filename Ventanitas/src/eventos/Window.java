package eventos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField t1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
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
	public Window() {
		setSize(485, 220);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(157, 78, 120, 31);
		getContentPane().add(btnNewButton);
		
		t1 = new JTextField();
		t1.setBounds(27, 83, 106, 20);
		getContentPane().add(t1);
		t1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(298, 83, 106, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel x = new JLabel("New label");
		x.setBounds(41, 44, 69, 28);
		getContentPane().add(x);

	}
}
