package com.company.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OpcionesDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public OpcionesDialog() {
		setModal(true);
		setTitle("App Usuario");
		setBounds(550, 250, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTitulo = new JLabel("Opciones Adicionales");
			lblTitulo.setBounds(440, 100, 172, 40);
			lblTitulo.setFont(new Font("Lucida Sans", Font.BOLD, 15));
			contentPanel.add(lblTitulo);
		}
		
		JButton btnInfo = new JButton("Info Usuario");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInfo.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
		btnInfo.setBounds(158, 68, 125, 21);
		contentPanel.add(btnInfo);
		
		JButton btnInversiones = new JButton("Inversiones");
		btnInversiones.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
		btnInversiones.setBounds(158, 115, 125, 21);
		contentPanel.add(btnInversiones);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
		btnAyuda.setBounds(159, 162, 124, 21);
		contentPanel.add(btnAyuda);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.setFont(new Font("Lucida Sans", Font.ITALIC, 13));
		btnMenuPrincipal.setBounds(158, 211, 124, 21);
		contentPanel.add(btnMenuPrincipal);
		
		JLabel lblOpciones = new JLabel("Opciones");
		lblOpciones.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 15));
		lblOpciones.setBounds(180, 23, 82, 21);
		contentPanel.add(lblOpciones);
		
		setVisible(true);
	}
}
