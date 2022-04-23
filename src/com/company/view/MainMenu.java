package com.company.view;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class MainMenu extends JDialog{
	
	/*
	 * Botones de las opciones del men�
	 */
	JLabel lblTitulo;
	JButton btnApp, btnATM, btnPerfil, btnSalir;
	
	public MainMenu() {
		
		JPanel firstPanel = new JPanel();
				
		setTitle("MENÚ PRINCIPAL");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(300, 100, 650, 350);
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.PAGE_AXIS));
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				LoginWindow ventanaLogin = new LoginWindow();
				ventanaLogin.setVisible(true);
				dispose();
			}
		});
		
		/*
		 * Inicializamos y a�adimos componentes al panel principal
		 */
		
		firstPanel.add(Box.createGlue());
		lblTitulo = new JLabel("Escoja la opción:");
		lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(lblTitulo);
		firstPanel.add(Box.createGlue());
		
		btnApp = new JButton("App");
		btnApp.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(btnApp);
		firstPanel.add(Box.createGlue());
		
		btnATM = new JButton("Cajero Automático");
		btnATM.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(btnATM);
		firstPanel.add(Box.createGlue());
		
		btnPerfil = new JButton("Perfil de usuario");
		btnPerfil.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(btnPerfil);
		firstPanel.add(Box.createGlue());
		
		btnSalir = new JButton("Cerrar sesión");
		btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(btnSalir);
		firstPanel.add(Box.createGlue());
		
		
		setContentPane(firstPanel);
		
		setVisible(true);
	
	/*
	 * A�adimos eventos a cada bot�n (btnApp, btnATM, btnPerfil, btnSalir)
	 */
	
		btnApp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		btnATM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AtmDialog cuadroAtm = new AtmDialog();
				cuadroAtm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				try {
					
				}catch(Exception ex) {
					ex.getMessage();
					ex.printStackTrace();
				}
				
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				try {
					addWindowListener(new WindowAdapter() {
						
						public void windowClosed(WindowEvent ev){
							LoginWindow ventanaLogin = new LoginWindow();
							ventanaLogin.setVisible(true);
						}
					});
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		
		
	}
		
	
}



























