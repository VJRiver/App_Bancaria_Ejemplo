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
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;


public class LoginWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JLabel lblError;
	private static LoginWindow frame;
	
	
	
	/*
	 * Guardan usuario y password -- cambiarlo despu�s para que su valor
	 * lo obtengan de una base de datos --
	 */
	private char[] password = {'G','r','u','p','o'};
	private String user = "Neurotico";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginWindow();
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
		
		setBounds(250, 150, 797, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblUserName = new JLabel("Usuario");
		lblUserName.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		lblUserName.setBounds(224, 138, 92, 24);
		contentPane.add(lblUserName);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(341, 142, 262, 19);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a");
		lblPassword.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		lblPassword.setBounds(224, 191, 115, 13);
		contentPane.add(lblPassword);
		
		JLabel lblTitulo = new JLabel("Acceso");
		lblTitulo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblTitulo.setBounds(351, 43, 79, 13);
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
		btnBorrar.setBounds(146, 361, 101, 21);
		contentPane.add(btnBorrar);
		
		JButton btnAceptar = new JButton("Aceptar");
		
		
		
		btnAceptar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
							
				boolean aceptar = validar(txtUsuario.getText(), password);
				System.out.println("Valor de la fx validar: " + aceptar);
				if(aceptar) {
					
					MainMenu menuPrincipal = new MainMenu();
					
					dispose();
									
				}
				
				
			}
		});
		btnAceptar.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		btnAceptar.setBounds(265, 361, 107, 21);
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
		btnCancelar.setBounds(392, 361, 135, 21);
		contentPane.add(btnCancelar);
		
		lblError = new JLabel("");
		lblError.setFont(new Font("Liberation Sans", Font.ITALIC, 14));
		lblError.setBounds(341, 238, 262, 13);
		contentPane.add(lblError);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(341, 189, 262, 19);
		contentPane.add(txtPassword);
		
		JButton btnNuevoUsuario = new JButton("Nuevo Usuario");
		btnNuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(JFrame.ICONIFIED);
				RegistroDialog ventanaRegistro = new RegistroDialog(frame);
				ventanaRegistro.setVisible(true);
				
				
			}
		});
		btnNuevoUsuario.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
		btnNuevoUsuario.setBounds(541, 361, 160, 21);
		contentPane.add(btnNuevoUsuario);
	}
	
	/*
	 * Valida contrase�a y password
	 * cambiarlo para que obtenga los datos de una base de datos
	 */
	public boolean validar(String User, char[] pass) {
		
		//System.out.println("Valor de argumento User: " + User);
		//System.out.println("Valor de argumento pass: " + pass);
		if(user.contains(User) && Arrays.equals(txtPassword.getPassword(), pass)) {
			lblError.setText("Iniciando servicio");
			return true;
			}
		else {
			
			lblError.setText("Usuario y/o contrasena invalidos");
			return false;
		}
		
	}
}














