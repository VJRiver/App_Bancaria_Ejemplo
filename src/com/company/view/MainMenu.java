package com.company.view;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import java.awt.Font;

public class MainMenu extends JDialog{
	
	/*
	 * Botones de las opciones del men�
	 */
	JLabel lblTitulo;

	JButton btnOpciones, btnATM, btnPerfil, btnSalir, btnApp;

	private JButton btnAyuda;
	
	public MainMenu() {
		
		JPanel firstPanel = new JPanel();

		setTitle("MENÚ PRINCIPAL");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(450, 200, 650, 405);

		
		firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.PAGE_AXIS));
	
		
		/*
		 * Inicializamos y a�adimos componentes al panel principal
		 */
		
		firstPanel.add(Box.createGlue());
		lblTitulo = new JLabel("Escoja la opción:");
		lblTitulo.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 14));
		lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(lblTitulo);
		firstPanel.add(Box.createGlue());
		
		btnApp = new JButton("App");
		btnApp.setFont(new Font("Lucida Sans", Font.ITALIC, 12));
		btnApp.setAlignmentX(0.5f);
		firstPanel.add(btnApp);
		firstPanel.add(Box.createGlue());
		
		btnOpciones = new JButton("Mas Opciones...");
		btnOpciones.setFont(new Font("Lucida Sans", Font.ITALIC, 12));
		btnOpciones.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(btnOpciones);
		firstPanel.add(Box.createGlue());
		
		btnATM = new JButton("Cajero Automático");
		btnATM.setFont(new Font("Lucida Sans", Font.ITALIC, 12));
		btnATM.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(btnATM);
		firstPanel.add(Box.createGlue());
		
		btnPerfil = new JButton("Perfil de usuario");
		btnPerfil.setFont(new Font("Lucida Sans", Font.ITALIC, 12));
		btnPerfil.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(btnPerfil);
		firstPanel.add(Box.createGlue());
		
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
				try {
					AtmDialog cuadroAtm = new AtmDialog();
					setVisible(false);
					dispose();
				}catch(Exception ex) {
					ex.getMessage();
					ex.printStackTrace();
				}
				
			}
		});
		
		btnAyuda = new JButton("Ayuda");
		btnAyuda.setFont(new Font("Lucida Sans", Font.ITALIC, 12));
		btnAyuda.setAlignmentX(0.5f);
		firstPanel.add(btnAyuda);
		firstPanel.add(Box.createGlue());
		
		btnSalir = new JButton("Cerrar sesi�n");
		btnSalir.setFont(new Font("Lucida Sans", Font.ITALIC, 12));
		btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(btnSalir);
		
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
		firstPanel.add(Box.createGlue());
		
		setContentPane(firstPanel);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				LoginWindow ventanaLogin = new LoginWindow();
				ventanaLogin.setVisible(true);
			}
		});
	
	/*
	 * A�adimos eventos a cada bot�n (btnApp, btnATM, btnPerfil, btnSalir)
	 */
	
		btnOpciones.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				OpcionesDialog ventanaOpciones = new OpcionesDialog();
			}
		});
		

	}
}



























