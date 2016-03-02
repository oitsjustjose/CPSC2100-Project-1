package com.github.fantastic_five.GUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUILogin extends JPanel
{
	/**
	 * 
	 */
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public GUILogin()
	{
		setLayout(null);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(146, 106, 202, 20);
		add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setBounds(146, 137, 202, 20);
		add(passwordField);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(75, 109, 300, 20);
		add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(75, 140, 300, 20);
		add(lblPassword);

		JButton btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.setBounds(234, 158, 126, 23);
		btnForgotPassword.setOpaque(false);
		btnForgotPassword.setContentAreaFilled(false);
		btnForgotPassword.setBorderPainted(false);
		add(btnForgotPassword);

	}
}
