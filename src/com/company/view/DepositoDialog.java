package com.company.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DepositoDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	

	/**
	 * Create the dialog.
	 */
	public DepositoDialog() {
		setModal(true);
		setTitle("DEPOSITO A CUENTA");
		setBounds(300, 200, 560, 253);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 171, 546, 35);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JButton btnRegresar = new JButton("Regresar");
				btnRegresar.setFont(new Font("Lucida Sans", Font.BOLD, 13));
				btnRegresar.setActionCommand("OK");
				buttonPane.add(btnRegresar);
				getRootPane().setDefaultButton(btnRegresar);
			}
			{
				JButton btnCorregir = new JButton("Corregir");
				btnCorregir.setFont(new Font("Lucida Sans", Font.BOLD, 13));
				btnCorregir.setActionCommand("Cancel");
				buttonPane.add(btnCorregir);
			}
			{
				JButton btnAceptar = new JButton("Aceptar");
				btnAceptar.setFont(new Font("Lucida Sans", Font.BOLD, 13));
				buttonPane.add(btnAceptar);
			}
		}
		
		JLabel lblIntroduce = new JLabel("Introduce cantidad:");
		lblIntroduce.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		lblIntroduce.setBounds(204, 25, 145, 22);
		contentPanel.add(lblIntroduce);
		
		textField = new JTextField();
		textField.setBounds(186, 87, 180, 22);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		setVisible(true);
	}
}
