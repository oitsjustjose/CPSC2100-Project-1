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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.github.fantastic_five.StudentRegistrationMain;
public class AddDropCourse extends JPanel
{
    private JTextField textField;
	private JTextField textField1;
	private JButton btnNewButton;
	private JButton btnNewButton1;
	private JButton btnBack;
	private JLabel lblCrn;
	private JLabel lblClass;
	private JLabel lblOr;
	private JTable table1;
	private JTextField textField2;

	/**
	 * Creates the panel.
	 */
	public AddDropCourse()
	{
		setLayout(null);
		setBounds(0, 0, 618, 434);

		textField = new JTextField();
		textField.setBounds(40, 104, 206, 20);
		add(textField);
		textField.setColumns(10);

		textField1 = new JTextField();
		textField1.setBounds(367, 104, 213, 20);
		add(textField1);
		textField1.setColumns(10);

		btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		btnNewButton.setBounds(40, 342, 254, 23);
		add(btnNewButton);

		btnNewButton1 = new JButton("Remove");
		btnNewButton1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Remove.main(null);
			}
		});
		btnNewButton1.setBounds(326, 342, 254, 23);
		add(btnNewButton1);

		btnBack = new JButton("Back");
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
				StudentRegistrationMain.replaceMainWindowContents(new Teacher());
			}
		});

		btnBack.setBounds(40, 385, 128, 23);
		add(btnBack);

		JLabel lblSearchBy = new JLabel("Search By:");
		lblSearchBy.setForeground(Color.GRAY);
		lblSearchBy.setFont(new Font("Verdana", Font.BOLD, 16));
		lblSearchBy.setBounds(40, 41, 116, 20);
		add(lblSearchBy);

		lblCrn = new JLabel("CRN");
		lblCrn.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCrn.setBounds(40, 79, 46, 14);
		add(lblCrn);

		lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Verdana", Font.BOLD, 12));
		lblClass.setBounds(367, 79, 46, 14);
		add(lblClass);

		lblOr = new JLabel("OR");
		lblOr.setForeground(Color.GRAY);
		lblOr.setFont(new Font("Verdana", Font.BOLD, 16));
		lblOr.setBounds(297, 97, 46, 28);
		add(lblOr);

		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(481, 13, 99, 23);
		add(btnLogOut);

		JScrollPane scrollPane1 = new JScrollPane();

		scrollPane1.setBounds(40, 180, 540, 151);
		add(scrollPane1);

		table1 = new JTable();
		table1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null, null }, { null, null, null, null, null,
						null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null },
				{ null, null, null, null, null, null }, }, new String[]
		{ "CRN", "Class", "Capacity", "Remaining", "Teacher", "Time", "Room" }));
		scrollPane1.setViewportView(table1);

		textField2 = new JTextField();
		textField2.setBounds(40, 135, 540, 34);
		add(textField2);
		textField2.setColumns(10);

	}
}
