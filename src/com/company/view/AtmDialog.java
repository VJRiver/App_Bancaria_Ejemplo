package com.company.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class AtmDialog extends JDialog {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public AtmDialog() {
		setFont(new Font("Calisto MT", Font.BOLD, 17));
		setTitle("ATM - Opciones");
		setForeground(Color.BLACK);
		setBackground(new Color(0, 102, 0));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
<<<<<<< HEAD
		setBounds(100, 100, 726, 593);
=======
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 200, 726, 593);
>>>>>>> 6174a6e8e18d81a893f20f418b9ba7e2f0ee167c
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		
		
		JButton btnRetiro = new JButton("RETIRO");
		btnRetiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RetiroDialog cuadroRetiro = new RetiroDialog();
				cuadroRetiro.setLocation(300, 200);
				cuadroRetiro.setVisible(true);
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRetiro, 120, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRetiro, 311, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRetiro, 151, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRetiro, 396, SpringLayout.WEST, contentPane);
		btnRetiro.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
		btnRetiro.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(btnRetiro);
		
		JButton btnDeposito = new JButton("DEPOSITO");
		btnDeposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepositoDialog depositoCuadro = new DepositoDialog();
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnDeposito, 207, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnDeposito, 298, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnDeposito, 238, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnDeposito, 411, SpringLayout.WEST, contentPane);
		btnDeposito.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
		contentPane.add(btnDeposito);
		
		JButton btnConsulta = new JButton("CONSULTA SALDO");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnConsulta, 290, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnConsulta, 274, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnConsulta, 321, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnConsulta, 439, SpringLayout.WEST, contentPane);
		btnConsulta.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
		contentPane.add(btnConsulta);
		
		JButton btnTransferir = new JButton("TRANSFERIR");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnTransferir, 374, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnTransferir, 290, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnTransferir, 405, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnTransferir, 418, SpringLayout.WEST, contentPane);
		btnTransferir.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
		contentPane.add(btnTransferir);
		
		/*
		 * Reabrimos un MainMenu y cerramos esta ventana
		 */
		
		JButton btnMenu = new JButton("MENU PRINCIPAL");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu menuPrincipal = new MainMenu();
				dispose();
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnMenu, 457, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnMenu, 274, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnMenu, 488, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnMenu, 431, SpringLayout.WEST, contentPane);
		btnMenu.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
		contentPane.add(btnMenu);
		
		JLabel lblATM = new JLabel("Opciones de ATM");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblATM, 43, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblATM, 5, SpringLayout.WEST, btnConsulta);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblATM, -50, SpringLayout.NORTH, btnRetiro);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblATM, 0, SpringLayout.EAST, btnConsulta);
		lblATM.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(lblATM);
				
		setVisible(true);
		
	
	}
}






























