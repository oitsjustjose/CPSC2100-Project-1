package com.github.fantastic_five.GUIStudent;
//Alay

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import com.github.fantastic_five.StudentRegistrationMain;

public class GUIAddRemoveCourse extends JPanel
{
	private JTextField txtCrn;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtClass;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnBack;

	/**
	 * Create the panel.
	 */
	public GUIAddRemoveCourse()
	{
		setLayout(null);
		setBounds(0, 0, 618, 434);

		JTextPane txtpnSearchBy = new JTextPane();
		txtpnSearchBy.setText("Search By: ");
		txtpnSearchBy.setForeground(Color.GRAY);
		txtpnSearchBy.setFont(new Font("Verdana", Font.BOLD, 16));
		txtpnSearchBy.setBounds(41, 30, 137, 27);
		add(txtpnSearchBy);

		txtCrn = new JTextField();
		txtCrn.setText("CRN");
		txtCrn.setBounds(41, 68, 86, 20);
		add(txtCrn);
		txtCrn.setColumns(10);

		JTextPane txtpnOr = new JTextPane();
		txtpnOr.setText("OR");
		txtpnOr.setForeground(Color.GRAY);
		txtpnOr.setFont(new Font("Verdana", Font.BOLD, 16));
		txtpnOr.setBounds(298, 87, 33, 27);
		add(txtpnOr);

		textField = new JTextField();
		textField.setBounds(41, 99, 206, 20);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(369, 99, 212, 20);
		add(textField_1);
		textField_1.setColumns(10);

		txtClass = new JTextField();
		txtClass.setText("Class");
		txtClass.setBounds(369, 68, 86, 20);
		add(txtClass);
		txtClass.setColumns(10);

		JTextPane txtpnSelected = new JTextPane();
		txtpnSelected.setText("Selected");
		txtpnSelected.setBounds(41, 138, 68, 20);
		add(txtpnSelected);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 169, 540, 160);
		add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null,
						null },
				{ null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null }, }, new String[]
		{ "CRN", "Class", "Capacity", "Remaining", "Teacher", "Time", "Room" }));
		scrollPane.setViewportView(table);

		btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		btnNewButton.setBounds(41, 340, 254, 23);
		add(btnNewButton);

		btnNewButton_1 = new JButton("Remove");
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		btnNewButton_1.setBounds(327, 340, 254, 23);
		add(btnNewButton_1);

		btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIStudent());
			}
		});

		btnBack.setBounds(153, 400, 336, 23);
		add(btnBack);

	}
}
