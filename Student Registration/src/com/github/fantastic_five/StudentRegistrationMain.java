package com.github.fantastic_five;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * 
 * @author Fantastic Five
 *
 */

public class StudentRegistrationMain implements ActionListener
{
	// Local variable for our icon, which I will make later
	private static final String APPLICATION_ICON = "application_icon";
	// Strings used for command listeners
	private static final String ACCT_CREATE_ACTION = "account_create";
	private static final String STUDENT_LOGIN_ACTION = "student_login";
	private static final String TEACHER_LOGIN_ACTION = "teacher_login";
	private static final String ADMIN_LOGIN_ACTION = "admin_login";

	// TODO: write everything!
	public static void main(String[] args)
	{
		Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				createMainWindow();
			}
		};
		SwingUtilities.invokeLater(r);
	}

	private static void createMainWindow()
	{
		// Creates a window with the title "Student Registration"
		JFrame frame = new JFrame("Student Registration");
		// Sets it to terminate properly when closing the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Buttons for all actions
		JButton createAcct = new JButton("Create Account");
		JButton studentLogin = new JButton("Student Login");
		JButton teacherLogin = new JButton("Teacher Login");
		JButton adminLogin = new JButton("Administration Login");

		// Actions for all buttons:
		createAcct.setActionCommand(ACCT_CREATE_ACTION);
		createAcct.addActionListener(new StudentRegistrationMain());
		studentLogin.setActionCommand(STUDENT_LOGIN_ACTION);
		studentLogin.addActionListener(new StudentRegistrationMain());
		teacherLogin.setActionCommand(TEACHER_LOGIN_ACTION);
		teacherLogin.addActionListener(new StudentRegistrationMain());
		adminLogin.setActionCommand(ADMIN_LOGIN_ACTION);
		adminLogin.addActionListener(new StudentRegistrationMain());

		// Contents for inside our window, as well as the layout:
		JPanel gui1 = new JPanel();
		gui1.setLayout(new GridBagLayout());
		JPanel gui2 = new JPanel();
		gui2.setLayout(new GridBagLayout());

		// Adds the buttons to our panel
		gui1.add(createAcct);
		gui1.add(studentLogin);
		gui2.add(teacherLogin);
		gui2.add(adminLogin);

		// Sets size and adds content to the window itself:
		frame.setMinimumSize(new Dimension(372, 82));
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

		JLabel usernameLabel = new JLabel("E-mail / Username:");
		JLabel passwordLabel = new JLabel("Password:");
		JTextField newUsername = new JTextField();
		newUsername.setSize(40, 40);
		JTextField newPassword = new JTextField();
		newPassword.setSize(40, 40);
		JButton create = new JButton("Create Account");

		JPanel guiUsername = new JPanel();
		guiUsername.setLayout(new GridLayout());
		JPanel guiPassword = new JPanel();
		guiPassword.setLayout(new GridLayout());

		guiUsername.add(newUsername);
		guiPassword.add(newPassword);
		frame.setMinimumSize(new Dimension(256, 256));
		frame.getContentPane().add(guiUsername, BorderLayout.NORTH);
		frame.getContentPane().add(guiPassword, BorderLayout.SOUTH);

		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	private static void createStudentLoginWindow()
	{

	}

	private static void createTeacherLoginWindow()
	{

	}

	private static void createAdminLoginWindow()
	{

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();

		if (ACCT_CREATE_ACTION.equals(cmd))
			createAccountCreationWindow();
		else if (STUDENT_LOGIN_ACTION.equals(cmd))
			createStudentLoginWindow();
		else if (TEACHER_LOGIN_ACTION.equals(cmd))
			createTeacherLoginWindow();
		else if (ADMIN_LOGIN_ACTION.equals(cmd))
			createAdminLoginWindow();
	}

}