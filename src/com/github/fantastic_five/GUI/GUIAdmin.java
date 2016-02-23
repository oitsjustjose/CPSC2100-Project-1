package com.github.fantastic_five.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.github.fantastic_five.StudentRegistrationMain;

import net.miginfocom.swing.MigLayout;

public class GUIAdmin implements ActionListener
{
	private static final String MAIN_ADD_CLASS_ACTION = "main_add_class_action";
	private static final String MAIN_REMOVE_CLASS_ACTION = "main_remove_class_action";
	private static final String MAIN_VIEW_REPORT_ACTION = "main_view_report_action";
	private static final String MAIN_CANCEL = "main_view_cancel";

	private static final String ADD_WINDOW_CREATE_BUTTON_ACTION = "add_window_create_button_action";
	private static final String REMOVE_WINDOW_REMOVE_BUTTON_ACTION = "remove_window_create_button_action";

	private static JPanel GUI = new JPanel(new MigLayout("c, insets 0 120 0 120"));
	private static final JLabel SPACER = new JLabel();

	public static void initialize()
	{
		GUI.removeAll();
		// Creates our 3 buttons
		JButton addClassButton = new JButton("Add Course Offering");
		JButton removeClassButton = new JButton("Remove Course Offering");
		JButton viewReportButton = new JButton("View Report");

		// Sets their command (i.e. their function)
		addClassButton.setActionCommand(MAIN_ADD_CLASS_ACTION);
		removeClassButton.setActionCommand(MAIN_REMOVE_CLASS_ACTION);
		viewReportButton.setActionCommand(MAIN_VIEW_REPORT_ACTION);

		// Adds listeners to all of these
		addClassButton.addActionListener(new GUIAdmin());
		removeClassButton.addActionListener(new GUIAdmin());
		viewReportButton.addActionListener(new GUIAdmin());

		// Adds the buttons to our GUI, with proper spacing and stuff!
		GUI.add(addClassButton, "wrap, span, c, w 240!");
		GUI.add(removeClassButton, "wrap, span, c, w 240!");
		GUI.add(viewReportButton, "wrap, span, c, w 240!");

		// Replaces main window contents with our GUI
		StudentRegistrationMain.replaceMainWindowContents(GUI);
	}

	private static void createAddClassGUI()
	{
		GUI.removeAll();
		// All labels (non-editable) for the text fields
		JLabel CRNLabel = new JLabel("CRN:");
		JLabel CourseNameLabel = new JLabel("Course Name:");
		JLabel SectionNumberLabel = new JLabel("Section Number:");
		JLabel CourseDescriptionLabel = new JLabel("Course Desc:");
		JLabel DaysLabel = new JLabel("Days Offered:");
		JLabel TimesLabel = new JLabel("Times Offered:");
		JLabel CapacityLabel = new JLabel("Student Capacity:");

		// All editable text fields
		JTextField CRNField = new JTextField();
		JTextField CourseNameField = new JTextField();
		JTextField SectionNumberField = new JTextField();
		JTextField CourseDescriptionField = new JTextField();
		JTextField DaysField = new JTextField();
		JTextField TimesField = new JTextField();
		JTextField CapacityField = new JTextField();

		// Sets the sizes properly!
		CRNField.setPreferredSize(new Dimension(480, 20));
		CourseNameField.setPreferredSize(new Dimension(480, 20));
		SectionNumberField.setPreferredSize(new Dimension(480, 20));
		CourseDescriptionField.setPreferredSize(new Dimension(480, 20));
		DaysField.setPreferredSize(new Dimension(480, 20));
		TimesField.setPreferredSize(new Dimension(480, 20));
		CapacityField.setPreferredSize(new Dimension(480, 20));

		// Create Button!
		JButton createCourseButton = new JButton("Create Course Offering");
		createCourseButton.setActionCommand(ADD_WINDOW_CREATE_BUTTON_ACTION);
		createCourseButton.addActionListener(new GUIAdmin());

		// Cancel button
		JButton cancelButton = new JButton("Back");
		cancelButton.setActionCommand(MAIN_CANCEL);
		cancelButton.addActionListener(new GUIAdmin());

		GUI.add(CRNLabel);
		GUI.add(CRNField, "span, wrap");
		GUI.add(CourseNameLabel);
		GUI.add(CourseNameField, "span, wrap");
		GUI.add(SectionNumberLabel);
		GUI.add(SectionNumberField, "span, wrap");
		GUI.add(CourseDescriptionLabel);
		GUI.add(CourseDescriptionField, "span, wrap");
		GUI.add(DaysLabel);
		GUI.add(DaysField, "span, wrap");
		GUI.add(TimesLabel);
		GUI.add(TimesField, "span, wrap");
		GUI.add(CapacityLabel);
		GUI.add(CapacityField, "span, wrap");
		GUI.add(SPACER, "wrap");
		GUI.add(SPACER, "wrap");
		GUI.add(cancelButton, "center");
		GUI.add(createCourseButton, "center");

		StudentRegistrationMain.replaceMainWindowContents(GUI);
	}

	private static void createRemoveClassGUI()
	{
		GUI.removeAll();

		JLabel CRNLabel = new JLabel("CRN To Remove:");
		JLabel warning = new JLabel("Warning: Cannot be Undone");
		warning.setForeground(Color.red);
		
		JTextField CRNField = new JTextField();
		CRNField.setPreferredSize(new Dimension(480, 20));
		// Remove Course Button
		JButton removeCourseButton = new JButton("Remove Course Offering");
		removeCourseButton.setActionCommand(REMOVE_WINDOW_REMOVE_BUTTON_ACTION);
		removeCourseButton.addActionListener(new GUIAdmin());

		// Cancel button
		JButton cancelButton = new JButton("Back");
		cancelButton.setActionCommand(MAIN_CANCEL);
		cancelButton.addActionListener(new GUIAdmin());

		GUI.add(CRNLabel, "span, wrap");
		GUI.add(SPACER, "wrap");
		GUI.add(SPACER, "wrap");
		GUI.add(SPACER, "wrap");
		GUI.add(SPACER, "wrap");
		GUI.add(CRNField, "span, wrap");
		GUI.add(SPACER, "wrap");
		GUI.add(SPACER, "wrap");
		GUI.add(SPACER, "wrap");
		GUI.add(cancelButton, "center");
		GUI.add(removeCourseButton, "center, wrap");
		GUI.add(warning, "span, center");

		StudentRegistrationMain.replaceMainWindowContents(GUI);
	}

	private static void createViewReportGUI()
	{
		System.out.println("View Report Class GUI Button Pressed");
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();

		if (cmd.equals(MAIN_ADD_CLASS_ACTION))
			createAddClassGUI();
		else if (cmd.equals(MAIN_REMOVE_CLASS_ACTION))
			createRemoveClassGUI();
		else if (cmd.equals(MAIN_VIEW_REPORT_ACTION))
			createViewReportGUI();
		else if (cmd.equals(ADD_WINDOW_CREATE_BUTTON_ACTION))
			System.out.println("Not Yet Implemented");
		else if (cmd.equals(REMOVE_WINDOW_REMOVE_BUTTON_ACTION))
			System.out.println("Not Yet Implemented");
		else if (cmd.equals(MAIN_CANCEL))
			initialize();
	}
}