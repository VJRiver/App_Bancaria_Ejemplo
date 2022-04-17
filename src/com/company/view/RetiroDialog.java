package com.company.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class RetiroDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;


	/**
	 * Create the dialog.
	 */
	public RetiroDialog() {
		setModal(true);
		setTitle("RETIRO DE CUENTA");
		setBounds(100, 100, 602, 268);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCantidadRetiro = new JLabel("Introduce cantidad a retirar:");
			lblCantidadRetiro.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			lblCantidadRetiro.setBounds(194, 33, 219, 26);
			contentPanel.add(lblCantidadRetiro);
		}
		
		textField = new JTextField();
		textField.setBounds(194, 86, 207, 32);
		contentPanel.add(textField);
		textField.setColumns(15);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(10, 150, 588, 31);
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
				JButton btnNewButton = new JButton("Aceptar");
				btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 13));
				buttonPane.add(btnNewButton);
			}
		}
	}
}
