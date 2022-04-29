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
	JButton btnOpciones, btnATM, btnPerfil, btnSalir;
	private JButton btnAyuda;
	
	public MainMenu() {
		
		JPanel firstPanel = new JPanel();
				
<<<<<<< HEAD
		setTitle("MENÚ PRINCIPAL");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(300, 100, 650, 350);
=======
		setTitle("MEN� PRINCIPAL");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(450, 200, 650, 405);
>>>>>>> 6174a6e8e18d81a893f20f418b9ba7e2f0ee167c
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
<<<<<<< HEAD
		lblTitulo = new JLabel("Escoja la opción:");
=======
		lblTitulo = new JLabel("Escoja la opci�n:");
		lblTitulo.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 14));
>>>>>>> 6174a6e8e18d81a893f20f418b9ba7e2f0ee167c
		lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(lblTitulo);
		firstPanel.add(Box.createGlue());
		
		btnOpciones = new JButton("Mas Opciones...");
		btnOpciones.setFont(new Font("Lucida Sans", Font.ITALIC, 12));
		btnOpciones.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(btnOpciones);
		firstPanel.add(Box.createGlue());
		
<<<<<<< HEAD
		btnATM = new JButton("Cajero Automático");
=======
		btnATM = new JButton("Cajero Autom�tico");
		btnATM.setFont(new Font("Lucida Sans", Font.ITALIC, 12));
>>>>>>> 6174a6e8e18d81a893f20f418b9ba7e2f0ee167c
		btnATM.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(btnATM);
		firstPanel.add(Box.createGlue());
		
		btnPerfil = new JButton("Perfil de usuario");
		btnPerfil.setFont(new Font("Lucida Sans", Font.ITALIC, 12));
		btnPerfil.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(btnPerfil);
		firstPanel.add(Box.createGlue());
		
<<<<<<< HEAD
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
=======
		btnAyuda = new JButton("Ayuda");
		btnAyuda.setFont(new Font("Lucida Sans", Font.ITALIC, 12));
		btnAyuda.setAlignmentX(0.5f);
		firstPanel.add(btnAyuda);
		firstPanel.add(Box.createGlue());
		
		btnSalir = new JButton("Cerrar sesi�n");
		btnSalir.setFont(new Font("Lucida Sans", Font.ITALIC, 12));
		btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
		firstPanel.add(btnSalir);
>>>>>>> 6174a6e8e18d81a893f20f418b9ba7e2f0ee167c
		
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
		
		btnATM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AtmDialog cuadroAtm = new AtmDialog();
				setVisible(false);
				
			}
		});
		
		
	}
		
	
}



























