package com.github.fantastic_five.GUITeacher;

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

@SuppressWarnings("serial")
public class GUITeacher extends JPanel
{
	/**
	 * @return A window containing the main actions an Administrator can take
	 */
	public GUITeacher()
	{
		setLayout(null);
		setBounds(0, 0, 618, 434);

		JButton btnView = new JButton("View Course");
		btnView.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIViewCourse());
			}
		});

		btnView.setBounds(232, 149, 150, 23);
		add(btnView);

		// Button & logic for removing courses
		JButton btnAddremoveCourse = new JButton("Add / Remove Course");
		btnAddremoveCourse.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
//				StudentRegistrationMain.replaceMainWindowContents(new GUIAddDropCourse());
			}
		});

		btnAddremoveCourse.setBounds(232, 204, 150, 23);
		add(btnAddremoveCourse);

		// Button for viewing schedules
		JButton btnViewSchedule = new JButton("View Schedule");
		btnViewSchedule.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIViewSchedule());
			}
		});
		btnViewSchedule.setBounds(232, 259, 150, 23);
		add(btnViewSchedule);

		// Panel label
		JLabel lblTeacher = new JLabel("Teacher");
		lblTeacher.setBounds(232, 78, 46, 14);
		lblTeacher.setForeground(Color.GRAY);
		lblTeacher.setFont(new Font("Verdana", Font.BOLD, 16));
		lblTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeacher.setBounds(232, 60, 150, 23);
		add(lblTeacher);

	}
}
