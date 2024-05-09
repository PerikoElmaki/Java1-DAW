package ejemploVisual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ejemplo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
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
	public Ejemplo() {
		setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 50, 50);
		getContentPane().setLayout(flowLayout);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
		flowLayout_1.setVgap(100);
		flowLayout_1.setHgap(120);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 1, 10, 10));
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setVgap(50);
		flowLayout_2.setHgap(50);
		panel.add(panel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"OPcion 1", "Opcion 2", "Opcion 3"}));
		panel_2.add(comboBox);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_3.getLayout();
		flowLayout_3.setVgap(50);
		flowLayout_3.setHgap(50);
		panel.add(panel_3);

	}

}
