package com.github.fantastic_five.GUIAdministrator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
//Alay
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.github.fantastic_five.StudentRegistrationMain;
import com.github.fantastic_five.GUIMisc.GUILoggedIn;
import com.github.fantastic_five.GUIStudent.GUIStudent;

@SuppressWarnings("serial")
public class GUIViewReport extends JPanel
{
	private JTable table;

	/**
	 * Create the panel.
	 */
	public GUIViewReport()
	{
		setLayout(null);
		setBounds(0, 0, 18, 434);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 587, 327);
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

		// Adds the loginPanel to our panel
		JPanel loginPanel = new GUILoggedIn();
		loginPanel.setBounds(0, 0, 618, 24);
		add(loginPanel);

		JButton btnBack = new JButton("Back");
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
				StudentRegistrationMain.replaceMainWindowContents(new GUIAdmin());
			}
		});
		btnBack.setBounds(10, 386, 128, 23);
		add(btnBack);

		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		btnPrint.setBounds(498, 386, 99, 23);
		add(btnPrint);

	}
}
