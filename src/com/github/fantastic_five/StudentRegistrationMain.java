package com.github.fantastic_five;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.github.fantastic_five.GUI.GUIAdmin;

import net.miginfocom.swing.MigLayout;

/**
 * @author Fantastic Five KNOW YOUR AUDIENCE, KNOW THE TASKS
 */

public class StudentRegistrationMain implements ActionListener
{
	// Kept public for a reason - may be needed by other classes
	public static JFrame mainWindow = new JFrame("FF Student Registration");
	public static Dimension mainWindowDimension = new Dimension(618, 458);

	public static void main(String[] args)
	{
		Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				// Put anything that needs to run in main here!
				createMainWindow();
			}
		};
		SwingUtilities.invokeLater(r);
	}

	// TODO: properly implement this
	private static void createMainWindow()
	{
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setLayout(new MigLayout());

		mainWindow.setPreferredSize(mainWindowDimension);
		mainWindow.setResizable(false);

		// TODO: should show the logged in user and logout button
		JPanel Status = new JPanel(new MigLayout());
		Status.add(new JLabel("Logged In User:"), "span");
		// TODO: this GUI is still blank
		JPanel GUI = new JPanel(new MigLayout());
		GUI.setSize(mainWindowDimension);

		mainWindow.getContentPane().add(Status, "span, wrap, left");
		mainWindow.getContentPane().add(GUI, "span");

		mainWindow.pack();
		mainWindow.setVisible(true);
		mainWindow.setLocationRelativeTo(null);
	}

	// TODO: if/then/else statement comparing cmd to other action listeners
	@Override
	public void actionPerformed(ActionEvent e)
	{
	}

	/**
	 * 
	 * @param newComponent
	 *            The Component to replace with in the main window
	 */
	public static void replaceMainWindowContents(Component newComponent)
	{
		mainWindow.getContentPane().remove(1);
		mainWindow.getContentPane().add(newComponent);
		mainWindow.pack();
	}
}