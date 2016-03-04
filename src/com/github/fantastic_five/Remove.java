//package com.github.fantastic_five.Teacher; 

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * Write a description of class Remove here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Remove
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
					Remove window = new Remove();
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
	public Remove()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 307, 117);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel  txtpnAreYouSure = new JLabel();
		txtpnAreYouSure.setText("Are you sure?");
		txtpnAreYouSure.setForeground(Color.RED);
		txtpnAreYouSure.setFont(new Font("Verdana", Font.BOLD, 16));
		txtpnAreYouSure.setBounds(86, 11, 127, 20);
		frame.getContentPane().add(txtpnAreYouSure);
		
		JButton btnYes = new JButton("Yes");
		btnYes.setBounds(10, 44, 89, 23);
		frame.getContentPane().add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		btnNo.setBounds(192, 42, 89, 23);
		frame.getContentPane().add(btnNo);
	}
}