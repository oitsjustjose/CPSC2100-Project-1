//Alay

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class GUIAddRemoveCourse extends JPanel
{
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnBack;
	private JLabel lblCrn;
	private JLabel lblClass;
	private JLabel lblSelected;
	private JLabel lblOr;

	/**
	 * Create the panel.
	 */
	public GUIAddRemoveCourse()
	{
		setLayout(null);
		setBounds(0, 0, 618, 434);
		
		textField = new JTextField();
		textField.setBounds(41, 99, 206, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(369, 99, 212, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 169, 540, 160);
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
		
		btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(41, 340, 254, 23);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Remove");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(327, 340, 254, 23);
		add(btnNewButton_1);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StudentRegistrationMain.replaceMainWindowContents(new GUIStudent());
			}
		});
		
		btnBack.setBounds(155, 389, 336, 23);
		add(btnBack);
		
		JLabel lblSearchBy = new JLabel("Search By:");
		lblSearchBy.setForeground(Color.GRAY);
		lblSearchBy.setFont(new Font("Verdana", Font.BOLD, 16));	
		lblSearchBy.setBounds(41, 37, 116, 20);
		add(lblSearchBy);
		
		lblCrn = new JLabel("CRN");
		lblCrn.setFont(new Font("Verdana", Font.BOLD, 12));
		lblCrn.setBounds(41, 71, 46, 14);
		add(lblCrn);
		
		lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Verdana", Font.BOLD, 12));
		lblClass.setBounds(369, 74, 46, 14);
		add(lblClass);
		
		lblSelected = new JLabel("Selected:");
		lblSelected.setForeground(Color.GRAY);
		lblSelected.setFont(new Font("Verdana", Font.BOLD, 16));
		lblSelected.setBounds(41, 130, 116, 28);
		add(lblSelected);
		
		lblOr = new JLabel("OR");
		lblOr.setForeground(Color.GRAY);
		lblOr.setFont(new Font("Verdana", Font.BOLD, 16));
		lblOr.setBounds(298, 92, 46, 28);
		add(lblOr);

	}
}