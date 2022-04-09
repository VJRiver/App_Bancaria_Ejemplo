package com.company.view;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainMenu extends JFrame{
	
	public MainMenu() {
		JPanel firstPanel = new JPanel();
		/*
		 * Botones de las opciones del menú
		 */
		JLabel lblTitulo;
		JButton btnApp, btnATM, btnPerfil, btnSalir;
		
		
		setTitle("MENÚ PRINCIPAL");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 100, 650, 350);
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.PAGE_AXIS));
		
		/*
		 * Inicializamos y añadimos componentes al panel principal
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
		
		/*
		 * Añadimos eventos a cada botón (btnApp, btnATM, btnPerfil, btnSalir)
		 */
		
		btnApp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		
		setContentPane(firstPanel);
		
		setVisible(true);
	}

}



























