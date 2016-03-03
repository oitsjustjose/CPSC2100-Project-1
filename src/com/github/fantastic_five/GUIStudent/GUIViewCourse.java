package com.github.fantastic_five.GUIStudent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
//Alay
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.github.fantastic_five.StudentRegistrationMain;

@SuppressWarnings("serial")
public class GUIViewCourse extends JPanel
{
	private JTable table;

	/**
	 * Create the panel.
	 */
	public GUIViewCourse()
	{
		setBounds(0, 0, 618, 434);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 587, 327);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"CRN", "Class", "Capacity", "Remaining", "Teacher", "Time", "Room"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				StudentRegistrationMain.replaceMainWindowContents(new GUIStudent());
			}
		});
		btnBack.setBounds(155, 389, 336, 23);
		add(btnBack);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(498, 11, 99, 23);
		add(btnLogOut);

	}
}