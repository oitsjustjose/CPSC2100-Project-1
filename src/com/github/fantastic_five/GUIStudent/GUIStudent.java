//Alay


import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class GUIStudent extends JPanel
{

	/**
	 * Create the panel.
	 */
	public GUIStudent()
	{
		setLayout(null);
		setBounds(0, 0, 618, 434);

		JButton btnView = new JButton("View Course");
		btnView.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StudentRegistrationMain.replaceMainWindowContents(new GUIViewCourse());
			}
		});
		
		btnView.setBounds(232, 149, 150, 23);
		add(btnView);

		JButton btnAddremoveCourse = new JButton("Add / Remove Course");
		btnAddremoveCourse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StudentRegistrationMain.replaceMainWindowContents(new GUIAddRemoveCourse());

			}
		});
		
		btnAddremoveCourse.setBounds(232, 204, 150, 23);
		add(btnAddremoveCourse);

		JButton btnViewSchedule = new JButton("View Schedule");
		btnViewSchedule.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				StudentRegistrationMain.replaceMainWindowContents(new GUIViewSchedule());
			}
		});
		btnViewSchedule.setBounds(232, 259, 150, 23);
		add(btnViewSchedule);

		JLabel lblStudent = new JLabel("Student");
		lblStudent.setBounds(232, 78, 46, 14);
		lblStudent.setForeground(Color.GRAY);
		lblStudent.setFont(new Font("Verdana", Font.BOLD, 16));
		lblStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudent.setBounds(232, 60, 150, 23);
		add(lblStudent);

	}
}
