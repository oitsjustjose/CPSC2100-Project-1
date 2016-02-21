package com.github.fantastic_five;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * @author Fantastic Five KNOW YOUR AUDIENCE, KNOW THE TASKS
 */

public class StudentRegistrationMain implements ActionListener
{
	public static JFrame mainWindow = new JFrame("FF Student Registration");
	public static Dimension mainWindowDimension = new Dimension(512, 458);

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
		
		mainWindow.setPreferredSize(mainWindowDimension);
		mainWindow.setResizable(false);

		JPanel gui = new JPanel(new GridLayout());
		
		mainWindow.getContentPane().add(gui, BorderLayout.CENTER);
		
		mainWindow.pack();
		mainWindow.setVisible(true);
		mainWindow.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO: if/then/else statement comparing cmd to other action listeners
		// String cmd = e.getActionCommand();
	}

	/**
	 * 
	 * @param newComponent
	 *            The Component to replace with in the main window
	 */
	public static void replaceMainWindowContents(Component newComponent)
	{
		mainWindow.getContentPane().remove(mainWindow.getComponents()[1]);
		mainWindow.getContentPane().add(newComponent);
	}
}