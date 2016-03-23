package com.github.fantastic_five.GUIStudent;
//Alay

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.github.fantastic_five.StudentRegistrationMain;

public class GUIViewSchedule extends JPanel
{

	/**
	 * Create the panel.
	 */
	public GUIViewSchedule()
	{
		setBounds(0, 0, 618, 434);
		setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 587, 107);
		add(scrollPane);

		JTable table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, { null, null, null, null, null, null, null }, }, new String[] { "CRN", "Class", "Capacity", "Remaining", "Time", "Day", "Teacher", "Room" }));
		scrollPane.setViewportView(table);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 386, 128, 23);
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
			}
		});
		btnBack.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIStudent());
			}
		});
		add(btnBack);

		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(498, 386, 99, 23);
		btnPrint.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		add(btnPrint);

		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(498, 11, 99, 23);
		add(btnLogOut);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 178, 587, 197);
		add(scrollPane_1);

	}
}
