package com.github.fantastic_five.GUIAdministrator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.github.fantastic_five.StudentRegistrationMain;
import com.github.fantastic_five.GUIMisc.GUILoggedIn;
import com.github.fantastic_five.Logic.Lib;

@SuppressWarnings("serial")
public class GUIRemoveClass extends JPanel
{
	private JTextField fieldCRN;

	public GUIRemoveClass()
	{
		setLayout(null);
		setBounds(0, 0, 618, 434);

		// Label for the CRN box
		JLabel lblCrnToRemove = new JLabel("CRN To Remove:");
		lblCrnToRemove.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCrnToRemove.setBounds(155, 182, 103, 14);
		add(lblCrnToRemove);

		// The box where the CRN entered should be accessed
		fieldCRN = new JTextField();
		fieldCRN.setBounds(268, 180, 176, 20);
		add(fieldCRN);
		fieldCRN.setColumns(10);

		// Back Button and all of its actions
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIAdmin());
			}
		});
		btnBack.setBounds(155, 237, 89, 23);
		add(btnBack);

		// Remove Course Button and all of its actions
		JButton btnRemoveCourseOffering = new JButton("Remove Course Offering");
		btnRemoveCourseOffering.addActionListener(new ActionListener()
		{
			// Makes a pop-up dialog window
			public void actionPerformed(ActionEvent e)
			{
				// Creates a popup window
				JFrame popup = new JFrame("Confirmation");
				popup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				popup.setPreferredSize(new Dimension(452, 186));
				popup.setResizable(false);

				JPanel GUI = new JPanel();
				GUI.setLayout(null);

				// Confirmation label
				JLabel lblAreYouSure = new JLabel("Are you sure? Cannot be undone!");
				lblAreYouSure.setForeground(Color.RED);
				lblAreYouSure.setFont(new Font("Verdana", Font.BOLD, 16));
				lblAreYouSure.setBounds(86, 24, 294, 52);
				GUI.add(lblAreYouSure);

				// Yes button should remove the CRN from the list
				JButton btnYes = new JButton("Yes");
				btnYes.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Lib.removeMatchingCRN(Integer.parseInt(fieldCRN.getText()));
						popup.dispose();
					}
				});
				btnYes.setBounds(234, 96, 89, 23);
				GUI.add(btnYes);

				// No button closes the window
				JButton btnNo = new JButton("No");
				btnNo.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						popup.dispose();
					}
				});
				btnNo.setBounds(135, 96, 89, 23);
				GUI.add(btnNo);

				// Finalizes the popup window
				popup.getContentPane().add(GUI);
				popup.pack();
				popup.setVisible(true);
				popup.setLocationRelativeTo(null);
			}
		});
		btnRemoveCourseOffering.setBounds(254, 237, 190, 23);
		add(btnRemoveCourseOffering);

		// Adds the loginPanel to our panel
		JPanel loginPanel = new GUILoggedIn();
		loginPanel.setBounds(0, 0, 618, 24);
		add(loginPanel);

		// Panel Title, basically
		JLabel lblCourseRemoval = new JLabel("Course Removal");
		lblCourseRemoval.setForeground(Color.GRAY);
		lblCourseRemoval.setFont(new Font("Verdana", Font.BOLD, 16));
		lblCourseRemoval.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseRemoval.setBounds(178, 107, 243, 23);
		add(lblCourseRemoval);
	}

}
