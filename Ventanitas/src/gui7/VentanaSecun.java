package gui7;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class VentanaSecun extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6;
	JButton btnNewButton ;
	public VentanaSecun() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(31, 27, 359, 248);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("La CONTRASEÑA: ");
		
		JLabel lblNewLabel_1 = new JLabel("- Debe tener, al menos, 8 caracteres de longitud.");
		
		JLabel lblNewLabel_2 = new JLabel("- No puede tener más de 24 caracteres de longitud.");
		
		JLabel lblNewLabel_3 = new JLabel("- No puede contener el login del usuario.");
		
		JLabel lblNewLabel_4 = new JLabel("- Debe contener, al menos, una letra mayúscula.");
		
		JLabel lblNewLabel_5 = new JLabel("- Debe contener, al menos, una letra minúscula.");
		
		JLabel lblNewLabel_6 = new JLabel("- Debe contener, al menos, un número.");
		
		btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(this);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
									.addComponent(lblNewLabel)
									.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(107)
							.addComponent(btnNewButton)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(33)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_6)
					.addGap(18)
					.addComponent(btnNewButton)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnNewButton) {
			setVisible(false);
		}
		
	}
}
