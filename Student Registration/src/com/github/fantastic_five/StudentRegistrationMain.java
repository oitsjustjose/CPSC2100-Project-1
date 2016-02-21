package com.github.fantastic_five;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import net.miginfocom.swing.MigLayout;

/**
 * 
 * @author Fantastic Five
 * 
 *         KNOW YOUR AUDIENCE, KNOW THE TASKS
 *
 */

public class StudentRegistrationMain implements ActionListener
{
	// Strings used for command listeners
	private static final String ACCT_CREATE_ACTION = "account_create";
	private static final String LOGIN_ACTION = "login_action";
	private static final String LOGIN_WINDOW_ACTION = "login_window_action";
	private static final String VIEW_CLASSES_ACTION = "view_classes_action";
	private static final String CONFIRM_ACCT_CREATION_ACTION = "confirm_account_creation_action";

	private static String currentWIPPassword;
	private static final ArrayList<String> passwords = new ArrayList<String>();

	// TODO: write everything!
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

	/**
	 * This method creates the first window that is visible to the user
	 */

	private static void createMainWindow()
	{
		JFrame frame = new JFrame("Student Registration");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Sets the window to a fixed size
		frame.setMinimumSize(new Dimension(256, 128));
		frame.setMaximumSize(new Dimension(256, 128));

		// Create GUI and buttons
		JPanel gui = new JPanel(new GridLayout());
		JButton login = new JButton("Button 1");
		JButton view = new JButton("Button 2");

		gui.add(login);
		gui.add(view);

		login.setActionCommand(LOGIN_WINDOW_ACTION);
		login.addActionListener(new StudentRegistrationMain());

		view.setActionCommand(VIEW_CLASSES_ACTION);
		view.addActionListener(new StudentRegistrationMain());

		frame.getContentPane().add(gui, BorderLayout.CENTER);
		frame.getContentPane().removeAll();
		frame.getContentPane().add(gui, BorderLayout.CENTER);


		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	private static void createLoginWindow()
	{
		// Creates a window with the title "Student Registration"
		JFrame frame = new JFrame("Login");
		// Sets it to terminate properly when closing the window
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Buttons for all options
		JButton createAcct = new JButton("Create Account");
		JButton login = new JButton("Log In");

		// Actions for all buttons:
		createAcct.setActionCommand(ACCT_CREATE_ACTION);
		createAcct.addActionListener(new StudentRegistrationMain());
		login.setActionCommand(LOGIN_ACTION);
		login.addActionListener(new StudentRegistrationMain());

		// Contents for inside our window, as well as the layout:
		JPanel gui1 = new JPanel();
		gui1.setLayout(new GridBagLayout());
		JPanel gui2 = new JPanel();
		gui2.setLayout(new GridBagLayout());

		// Adds the buttons to our panel
		gui1.add(createAcct);
		gui1.add(login);

		// Sets size and adds content to the window itself:
		frame.setMinimumSize(new Dimension(372, 82));
		frame.setMaximumSize(new Dimension(372, 82));
		frame.getContentPane().add(gui1, BorderLayout.NORTH);
		frame.getContentPane().add(gui2, BorderLayout.SOUTH);

		// Packages the frame and sets it so it can be seen:
		frame.pack();
		frame.setVisible(true);

		// Centers the window when it is made
		frame.setLocationRelativeTo(null);
	}

	private static void createAccountCreationWindow()
	{
		JFrame frame = new JFrame("Account Creation");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JButton create = new JButton("Create Account");
		JLabel usernameLabel = new JLabel("E-mail / Username:");
		JLabel passwordLabel = new JLabel("Password:");

		JTextField newUsername = new JTextField();
		newUsername.setPreferredSize(new Dimension(212, 22));
		JPasswordField newPassword = new JPasswordField();
		newPassword.setPreferredSize(new Dimension(212, 22));
		newPassword.setEchoChar('*');

		create.setActionCommand(CONFIRM_ACCT_CREATION_ACTION);
		create.addActionListener(new StudentRegistrationMain());

		currentWIPPassword = new String(newPassword.getPassword());

		JPanel gui = new JPanel(new MigLayout());

		gui.add(usernameLabel);
		gui.add(newUsername, "wrap");

		gui.add(passwordLabel);
		gui.add(newPassword, "wrap");

		gui.add(create, "span");

		frame.getContentPane().add(gui, BorderLayout.CENTER);

		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	// TODO: create this window and add functionality
	private static void createClassViewWindow()
	{
		System.out.println("Not Yet Implemented");
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();

		if (ACCT_CREATE_ACTION.equals(cmd))
			createAccountCreationWindow();
		else if (LOGIN_WINDOW_ACTION.equals(cmd))
			createLoginWindow();
		else if (VIEW_CLASSES_ACTION.equals(cmd))
			createClassViewWindow();
		else if (CONFIRM_ACCT_CREATION_ACTION.equals(cmd))
		{
			System.out.println("Button Hit");
			passwords.add(currentWIPPassword);
			System.out.println(passwords.get(0));
		}
	}
}