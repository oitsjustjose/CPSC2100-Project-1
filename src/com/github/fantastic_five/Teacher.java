package com.github.fantastic_five.Teacher;

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
public class Teacher extends JPanel
{
	/**
	 * Create the panel.
	 */
	public Teacher()
	{
		setLayout(null);
		setBounds(0, 0, 618, 434);

		JButton btnView = new JButton("View Course");
		btnView.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				StudentRegistrationMain.replaceMainWindowContents(new ViewCourse());
			}
		});
		
		btnView.setBounds(232, 149, 150, 23);
		add(btnView);

		JButton btnAddremoveCourse = new JButton("Add / Remove Course");
		btnAddremoveCourse.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				StudentRegistrationMain.replaceMainWindowContents(new AddDropCourse());
			}
		});
		
		btnAddremoveCourse.setBounds(232, 204, 150, 23);
		add(btnAddremoveCourse);

		JButton btnViewSchedule = new JButton("View Schedule");
		btnViewSchedule.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				StudentRegistrationMain.replaceMainWindowContents(new ViewSchedule());
			}
		});
		btnViewSchedule.setBounds(232, 259, 150, 23);
		add(btnViewSchedule);

		JLabel lblTeacher = new JLabel("Teacher");
		lblTeacher.setBounds(232, 78, 46, 14);
		lblTeacher.setForeground(Color.GRAY);
		lblTeacher.setFont(new Font("Verdana", Font.BOLD, 16));
		lblTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeacher.setBounds(232, 60, 150, 23);
		add(lblTeacher);

	}
}