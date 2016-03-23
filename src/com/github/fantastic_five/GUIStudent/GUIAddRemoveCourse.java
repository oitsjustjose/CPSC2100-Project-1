package com.github.fantastic_five.GUIStudent;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

//Alay

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.github.fantastic_five.StudentRegistrationMain;

@SuppressWarnings("serial")
public class GUIAddRemoveCourse extends JPanel
{
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnBack;
	private JLabel lblCrn;
	private JTable table_1;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public GUIAddRemoveCourse()
	{
		setBounds(0, 0, 618, 434);
		setLayout(null);

		textField = new JTextField();
		textField.setBounds(85, 67, 206, 20);
		add(textField);
		textField.setColumns(10);

		btnNewButton = new JButton("Add");
		btnNewButton.setBounds(180, 183, 254, 23);
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		add(btnNewButton);

		btnNewButton_1 = new JButton("Remove");
		btnNewButton_1.setBounds(180, 345, 254, 23);
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				GUIRemove.main(null);
			}
		});
		add(btnNewButton_1);

		btnBack = new JButton("Back");
		btnBack.setBounds(41, 389, 128, 23);
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		btnBack.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIStudent());
			}
		});
		add(btnBack);

		JLabel lblSearchBy = new JLabel("Search By:");
		lblSearchBy.setBounds(41, 32, 116, 20);
		lblSearchBy.setForeground(Color.GRAY);
		lblSearchBy.setFont(new Font("Verdana", Font.BOLD, 16));
		add(lblSearchBy);

		lblCrn = new JLabel("CRN");
		lblCrn.setBounds(41, 69, 46, 14);
		lblCrn.setFont(new Font("Verdana", Font.BOLD, 12));
		add(lblCrn);

		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(481, 13, 99, 23);
		add(btnLogOut);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(41, 227, 540, 107);
		add(scrollPane_1);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, }, new String[] { "CRN", "Class", "Capacity", "Remaining", "Time", "Day", "Teacher", "Room" }));
		scrollPane_1.setViewportView(table_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 113, 539, 59);
		add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, }, new String[] { "CRN", "Class", "Capacity", "Remaining", "Time", "Day", "Teacher", "Room" }));
		scrollPane.setViewportView(table);

	}
}