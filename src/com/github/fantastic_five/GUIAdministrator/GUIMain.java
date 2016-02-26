package com.github.fantastic_five.GUIAdministrator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.github.fantastic_five.StudentRegistrationMain;
import com.github.fantastic_five.GUIMisc.GUILoggedIn;
import com.github.fantastic_five.Logic.Course;
import com.github.fantastic_five.Logic.Lib;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class GUIMain extends JPanel
{
	public GUIMain()
	{
		setLayout(null);
		setBounds(0, 0, 618, 434);

		// Button & logic for adding classes
		JButton btnCreateCourseOffering = new JButton("Create Course Offering");
		btnCreateCourseOffering.setBounds(178, 186, 243, 23);
		btnCreateCourseOffering.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIAddClass());
			}
		});
		add(btnCreateCourseOffering);

		// Button & logic for removing courses
		JButton btnRemoveCourseOffering = new JButton("Remove Course Offering");
		btnRemoveCourseOffering.setBounds(178, 220, 243, 23);
		btnRemoveCourseOffering.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIRemoveClass());
			}
		});
		add(btnRemoveCourseOffering);

		// Button for reports view (NYE)
		JButton btnViewReport = new JButton("View Report");
		btnViewReport.setBounds(178, 254, 243, 23);
		btnViewReport.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// TODO: Implement this!
				for(Course c : Lib.masterCourseList)
					System.out.println(c.toString());
			}
		});
		add(btnViewReport);

		// Adds the login panel
		JPanel loginPanel = new GUILoggedIn();
		loginPanel.setBounds(0, 0, 618, 24);
		add(loginPanel);

		// Panel label, essentially
		JLabel lblAdministration = new JLabel("Administration");
		lblAdministration.setForeground(Color.GRAY);
		lblAdministration.setFont(new Font("Verdana", Font.BOLD, 16));
		lblAdministration.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdministration.setBounds(178, 96, 243, 23);
		add(lblAdministration);
	}
}
