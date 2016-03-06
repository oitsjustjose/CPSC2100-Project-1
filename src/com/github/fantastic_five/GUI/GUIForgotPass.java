package com.github.fantastic_five.GUI;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class GUIForgotPass
{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					GUIForgotPass window = new GUIForgotPass();
					window.frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIForgotPass()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 303, 141);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextArea txtpnPleaseContactThe = new JTextArea();
		txtpnPleaseContactThe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnPleaseContactThe.setBackground(UIManager.getColor("menu"));
		txtpnPleaseContactThe.setEditable(false);
		txtpnPleaseContactThe.setText("Please contact the System\r\n  Administration Office to\r\n   obtain your password.\r\n          Thank you.");
		// txtpnPleaseContactThe.setLineWrap(true);
		// txtpnPleaseContactThe.setAlignmentY(Component.CENTER_ALIGNMENT);
		// txtpnPleaseContactThe.setWrapStyleWord(true);
		txtpnPleaseContactThe.setBounds(57, 11, 178, 80);
		frame.getContentPane().add(txtpnPleaseContactThe);
	}
}
