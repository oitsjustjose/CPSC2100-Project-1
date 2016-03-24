package com.github.fantastic_five.GUIAdministrator;

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
import com.github.fantastic_five.GUIMisc.GUIViewReport;
import com.github.fantastic_five.GUIMisc.GUIWIP;
import com.github.fantastic_five.GUIStudent.GUIViewCourses;

@SuppressWarnings("serial")
public class GUIAdmin extends JPanel
{
	/**
	 * @return A window containing the main actions an Administrator can take
	 */
	public GUIAdmin()
	{
		setLayout(null);
		setBounds(0, 0, 618, 434);
		
		
		//BUtton View Courses 
		JButton btnView = new JButton("View Courses");
		btnView.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIviewCourses());
			}
		});

		btnView.setBounds(178, 152, 243, 23);
		add(btnView);

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

		// Button for reports view
		JButton btnViewReport = new JButton("View Report");
		btnViewReport.setBounds(178, 254, 243, 23);
		btnViewReport.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIViewReport(new GUIAdmin()));
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
	}
}
