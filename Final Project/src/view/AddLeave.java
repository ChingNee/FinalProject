package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AddLeave {

	private JFrame addLeaveFrame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddLeave window = new AddLeave();
					window.addLeaveFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddLeave() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addLeaveFrame = new JFrame();
		addLeaveFrame.setTitle("Add Leave");
		addLeaveFrame.setBounds(100, 100, 520, 400);
		addLeaveFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addLeaveFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 486, 35);
		addLeaveFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setText("");
		textField.setBounds(341, 10, 135, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Date: ");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel.setBounds(286, 13, 45, 13);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 55, 486, 25);
		addLeaveFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Information: ");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1.setBounds(0, 0, 205, 25);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 90, 486, 60);
		addLeaveFrame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Employee ID: ");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(85, 23, 85, 13);
		panel_2.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 20, 210, 19);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 160, 486, 25);
		addLeaveFrame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Leave Information: ");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 0, 172, 25);
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 195, 486, 60);
		addLeaveFrame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Type: ");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(105, 30, 45, 13);
		panel_4.add(lblNewLabel_4);
		
		String[] choices = {"Annual Leave", "Sick Leave"};
		JComboBox comboBox = new JComboBox(choices);
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(170, 26, 210, 21);
		panel_4.add(comboBox);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 265, 486, 60);
		addLeaveFrame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("Go Back");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton.setBounds(349, 29, 85, 21);
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_1.setBounds(49, 29, 85, 21);
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Apply");
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_2.setBounds(199, 29, 85, 21);
		panel_5.add(btnNewButton_2);
	}

}
