package com.company.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class RegistroDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroDialog dialog = new RegistroDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
			lblNombre.setBounds(27, 44, 62, 13);
			contentPanel.add(lblNombre);
		}
		{
			JLabel lblNuevoUsuario = new JLabel("Nuevo Usuario");
			lblNuevoUsuario.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 15));
			lblNuevoUsuario.setBounds(170, 12, 122, 13);
			contentPanel.add(lblNuevoUsuario);
		}
		{
			JLabel lblNumeroCuenta = new JLabel("Numero de cuenta:");
			lblNumeroCuenta.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
			lblNumeroCuenta.setBounds(27, 76, 122, 13);
			contentPanel.add(lblNumeroCuenta);
		}
		{
			JLabel lblUsuario = new JLabel("Usuario:");
			lblUsuario.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
			lblUsuario.setBounds(27, 102, 62, 13);
			contentPanel.add(lblUsuario);
		}
		{
			JLabel lblPassword = new JLabel("Password:");
			lblPassword.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
			lblPassword.setBounds(27, 131, 74, 13);
			contentPanel.add(lblPassword);
		}
		{
			JLabel lblCorreo = new JLabel("Correo:");
			lblCorreo.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
			lblCorreo.setBounds(27, 165, 53, 13);
			contentPanel.add(lblCorreo);
		}
		{
			JLabel lblDeposito = new JLabel("Deposito Inicial:");
			lblDeposito.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
			lblDeposito.setBounds(27, 191, 102, 13);
			contentPanel.add(lblDeposito);
		}
		
		textField = new JTextField();
		textField.setBounds(146, 41, 233, 19);
		contentPanel.add(textField);
		textField.setColumns(80);
		{
			textField_1 = new JTextField();
			textField_1.setBounds(146, 73, 233, 19);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(146, 99, 233, 19);
			contentPanel.add(textField_2);
		}
		{
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(146, 128, 233, 19);
			contentPanel.add(textField_3);
		}
		{
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(146, 162, 233, 19);
			contentPanel.add(textField_4);
		}
		{
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(146, 188, 233, 19);
			contentPanel.add(textField_5);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JButton okButton = new JButton("OK");
				okButton.setFont(new Font("Liberation Sans", Font.ITALIC, 13));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setFont(new Font("Liberation Sans", Font.ITALIC, 13));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
