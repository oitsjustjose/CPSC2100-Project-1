package com.github.fantastic_five.GUIMisc;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import com.github.fantastic_five.StudentRegistrationMain;
import com.github.fantastic_five.GUIAdministrator.GUIAdmin;
import com.github.fantastic_five.Logic.Course;
import com.github.fantastic_five.Logic.Lib;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class GUICourseList extends JPanel
{
	public GUICourseList()
	{
		setBorder(null);
		setBounds(0, 0, 618, 434);
		setLayout(null);

		// The string that stores all the courses contents
		String paneContents = "";

		// Iterates through the course list and gets all names, separating with a newline
		for (Course c : Lib.masterCourseList)
		{
			paneContents += c.toString();
			paneContents += "\n";
		}

		// Adds the login panel
		JPanel loginPanel = new GUILoggedIn();
		loginPanel.setBounds(0, 0, 618, 24);
		add(loginPanel);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIAdmin());
			}
		});
		btnBack.setBounds(267, 391, 89, 23);
		add(btnBack);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(7, 35, 598, 348);
		add(scrollPane);
	}
}
