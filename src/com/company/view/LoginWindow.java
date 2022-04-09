package com.company.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JLabel lblError;
	/*
	 * Guardan usuario y password -- cambiarlo después para que su valor
	 * lo obtengan de una base de datos --
	 */
	private String password = "Grupo";
	private String user = "Neurotico";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow frame = new LoginWindow();
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
	public LoginWindow() {
		JFrame.setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
		setBackground(Color.LIGHT_GRAY);
		setForeground(SystemColor.control);
		setTitle("Login Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 797, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("Usuario");
		lblUserName.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		lblUserName.setBounds(224, 118, 92, 24);
		contentPane.add(lblUserName);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(341, 122, 262, 19);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a");
		lblPassword.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		lblPassword.setBounds(224, 171, 115, 13);
		contentPane.add(lblPassword);
		
		JLabel lblTitulo = new JLabel("Acceso");
		lblTitulo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblTitulo.setBounds(341, 43, 79, 13);
		contentPane.add(lblTitulo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 317, 763, 4);
		contentPane.add(separator);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsuario.setText("");
				txtPassword.setText("");
			}
		});
		btnBorrar.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		btnBorrar.setBounds(224, 361, 101, 21);
		contentPane.add(btnBorrar);
		
		JButton btnAceptar = new JButton("Aceptar");
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean aceptado = validar(txtUsuario.getText(), txtPassword.getPassword().toString());
				if(aceptado == true) {
					MainMenu menuPrincipal = new MainMenu();
					setVisible(false);
					
				}
			}
		});
		btnAceptar.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		btnAceptar.setBounds(341, 361, 107, 21);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Warning", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
					System.out.println("Hasta luego!");
					System.exit(0);
				}
			}
		});
		btnCancelar.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		btnCancelar.setBounds(468, 361, 135, 21);
		contentPane.add(btnCancelar);
		
		lblError = new JLabel("");
		lblError.setFont(new Font("Liberation Sans", Font.ITALIC, 14));
		lblError.setBounds(341, 238, 262, 13);
		contentPane.add(lblError);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(341, 169, 262, 19);
		contentPane.add(txtPassword);
	}
	
	/*
	 * Valida contraseña y password
	 * cambiarlo para que obtenga los datos de una base de datos
	 */
	public boolean validar(String User, String pass) {
		boolean acceso = false;
		if(password.contains(pass) || user.contains(User)) {
			lblError.setText("Iniciando servicio");
			acceso = true;
			}
		else {
			
			lblError.setText("Usuario y/o contrasena invalidos");
			acceso = false;
		}
		return acceso;
	}
}














