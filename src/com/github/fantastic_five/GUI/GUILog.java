package com.github.fantastic_five.GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class GUILog extends JPanel
{
	/**
	 * 
	 */
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public GUILog()
	{
		setLayout(null);

		usernameField = new JTextField();
		usernameField.setHorizontalAlignment(SwingConstants.LEFT);
		usernameField.setForeground(new Color(0, 0, 0));
		usernameField.setBounds(252, 190, 202, 20);
		add(usernameField);
//		usernameField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setBounds(252, 221, 202, 20);
		add(passwordField);
		
		JLabel lblWelcomeMSG = new JLabel("WELCOME!");
		lblWelcomeMSG.setFont(new Font("Verdana", Font.BOLD, 70));
		lblWelcomeMSG.setBounds(90, 49, 700, 70);
		add(lblWelcomeMSG);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(137, 189, 300, 20);
		lblUsername.setFont(new Font("Verdana", Font.PLAIN, 20));
		add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(145, 220, 300, 20);
		lblPassword.setFont(new Font("Verdana", Font.PLAIN, 20));
		add(lblPassword);

		JButton btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.setBounds(317, 244, 150, 23);
		btnForgotPassword.setOpaque(false);
		btnForgotPassword.setContentAreaFilled(false);
		btnForgotPassword.setBorderPainted(false);
		btnForgotPassword.setForeground(Color.RED);
		btnForgotPassword.setFont(new Font("Verdana", Font.BOLD, 11));
		add(btnForgotPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(258, 280, 90, 23);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Verdana", Font.BOLD, 15));
		add(btnLogin);
		
		JButton btnGuest = new JButton("Guest");
		btnGuest.setBounds(359, 280, 90, 23);
		btnGuest.setForeground(Color.BLACK);
		btnGuest.setFont(new Font("Verdana", Font.BOLD, 15));
		add(btnGuest);
		

	}
}
