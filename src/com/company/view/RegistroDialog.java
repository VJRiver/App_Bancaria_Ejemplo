package com.company.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtCuenta;
	private JTextField txtUsuario;
	private JTextField txtPassword;
	private JTextField txtCorreo;
	private JTextField txtDeposito;
	
	

	/**
	 * Create the dialog.
	 */
	public RegistroDialog(LoginWindow loginFrame) {
		setModal(true);
		setBounds(450, 250, 450, 300);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
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
		
		txtNombre = new JTextField();
		txtNombre.setBounds(146, 41, 233, 19);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(80);
		{
			txtCuenta = new JTextField();
			txtCuenta.setBounds(146, 73, 233, 19);
			contentPanel.add(txtCuenta);
			txtCuenta.setColumns(10);
		}
		{
			txtUsuario = new JTextField();
			txtUsuario.setColumns(10);
			txtUsuario.setBounds(146, 99, 233, 19);
			contentPanel.add(txtUsuario);
		}
		{
			txtPassword = new JTextField();
			txtPassword.setColumns(10);
			txtPassword.setBounds(146, 128, 233, 19);
			contentPanel.add(txtPassword);
		}
		{
			txtCorreo = new JTextField();
			txtCorreo.setColumns(10);
			txtCorreo.setBounds(146, 162, 233, 19);
			contentPanel.add(txtCorreo);
		}
		{
			txtDeposito = new JTextField();
			txtDeposito.setColumns(10);
			txtDeposito.setBounds(146, 188, 233, 19);
			contentPanel.add(txtDeposito);
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
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						loginFrame.setState(JFrame.NORMAL);
						//RegistroDialog.super.getClass().getSimpleName();
						dispose();
					}
				});
				cancelButton.setFont(new Font("Liberation Sans", Font.ITALIC, 13));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
