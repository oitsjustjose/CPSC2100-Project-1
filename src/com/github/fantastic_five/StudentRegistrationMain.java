package com.github.fantastic_five;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author Fantastic Five KNOW YOUR AUDIENCE, KNOW THE TASKS
 */

public class StudentRegistrationMain implements ActionListener
{
	// Kept public for a reason - may be needed by other classes
	public static JFrame mainWindow = new JFrame("FF Student Registration");
	public static Dimension mainWindowDimension = new Dimension(618, 458);

	// can throw many errors because of UIManager.setLookAndFeel below, but this makes it look more like the native buttons!
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
	{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				// Put anything that needs to run in main here!
				createMainWindow();
				GUIAdmin.initialize();
			}
		};
		SwingUtilities.invokeLater(r);
	}

	// TODO: properly implement this
	private static void createMainWindow()
	{
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainWindow.setPreferredSize(mainWindowDimension);
		mainWindow.setResizable(false);

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
		mainWindow.getContentPane().removeAll();
		mainWindow.getContentPane().add(newComponent);
		mainWindow.pack();
	}
}