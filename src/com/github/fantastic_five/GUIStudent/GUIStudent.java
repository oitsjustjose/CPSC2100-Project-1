package com.github.fantastic_five.GUIStudent;
//Alay

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.github.fantastic_five.StudentRegistrationMain;
import com.github.fantastic_five.GUIMisc.GUILoggedIn;
import com.github.fantastic_five.GUIMisc.GUIWIP;

@SuppressWarnings("serial")
public class GUIStudent extends JPanel
{

	/**
	 * Create the panel.
	 */
	public GUIStudent()
	{
		setLayout(null);
		setBounds(0, 0, 618, 434);

		JButton btnView = new JButton("View Course");
		btnView.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIViewCourses());
			}
		});

		btnView.setBounds(178, 186, 243, 23);
		add(btnView);

		JButton btnAddremoveCourse = new JButton("Add / Remove Course");
		btnAddremoveCourse.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIAddRemoveCourse());
			}
		});

		btnAddremoveCourse.setBounds(178, 220, 243, 23);
		add(btnAddremoveCourse);

		JButton btnViewSchedule = new JButton("View Schedule");
		btnViewSchedule.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIViewSchedule());
			}
		});
		btnViewSchedule.setBounds(178, 254, 243, 23);
		add(btnViewSchedule);

		JLabel lblStudent = new JLabel("Student");
		lblStudent.setBounds(232, 78, 46, 14);
		lblStudent.setForeground(Color.GRAY);
		lblStudent.setFont(new Font("Verdana", Font.BOLD, 16));
		lblStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudent.setBounds(178, 96, 243, 23);
		add(lblStudent);
		
		//@TODO: Remove this later:
		JButton btnBackToWip = new JButton("Back to WIP Menu");
		btnBackToWip.setBounds(489, 400, 119, 23);
		btnBackToWip.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIWIP());
			}
		});		
		add(btnBackToWip);

		JPanel loginPanel = new GUILoggedIn();
		loginPanel.setBounds(0, 0, 618, 24);
		add(loginPanel);
	}
}
