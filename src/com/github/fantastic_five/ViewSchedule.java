package com.github.fantastic_five.Teacher;  

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
public class ViewSchedule extends JPanel
{
	/**
	 * Create the panel.
	 */
	public ViewSchedule()
	{
		setLayout(null);
        setBounds(0, 0, 618, 434);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 11, 586, 364);
        add(scrollPane);
        
        JTable table = new JTable();
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

		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter()
		{
		    @Override
		    public void mouseClicked(MouseEvent arg0)
		    {
		       StudentRegistrationMain.replaceMainWindowContents(new Teacher()); 
		    }
		  });
		  btnBack.setBounds(138, 400, 362, 23);
		  add(btnBack);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			}
		});
		btnPrint.setBounds(498, 386, 99, 23);
		add(btnPrint);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(498, 11, 99, 23);
		add(btnLogOut);

	}
}
