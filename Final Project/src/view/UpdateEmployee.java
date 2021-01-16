package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;

public class UpdateEmployee {

	private JFrame updateEmployeeFrame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateEmployee window = new UpdateEmployee();
					window.updateEmployeeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateEmployee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		updateEmployeeFrame = new JFrame();
		updateEmployeeFrame.setTitle("Update Employee");
		updateEmployeeFrame.setBounds(100, 100, 530, 400);
		updateEmployeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		updateEmployeeFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 496, 21);
		updateEmployeeFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Information: ");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 0, 205, 20);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 30, 496, 40);
		updateEmployeeFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID: ");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(70, 14, 84, 13);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(164, 11, 165, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton.setBounds(339, 10, 85, 21);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 68, 496, 180);
		updateEmployeeFrame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Name: ");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(0, 0, 248, 45);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Phone No: ");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(248, 0, 248, 45);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender: ");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(0, 45, 248, 45);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Age: ");
		lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(248, 45, 248, 45);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Acc No: ");
		lblNewLabel_7.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(0, 90, 248, 45);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Date Join: ");
		lblNewLabel_8.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_8.setBounds(248, 90, 248, 45);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Position: ");
		lblNewLabel_9.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_9.setBounds(0, 135, 248, 45);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Salary: ");
		lblNewLabel_10.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_10.setBounds(248, 135, 248, 45);
		panel_2.add(lblNewLabel_10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(60, 13, 165, 19);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		String[] choices = {"Male", "Female"};
		JComboBox comboBox = new JComboBox(choices);
		comboBox.setBounds(60, 57, 165, 21);
		comboBox.setSelectedIndex(0);
		panel_2.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBounds(60, 103, 165, 19);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(60, 148, 165, 19);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(320, 103, 166, 19);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(320, 13, 166, 19);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(320, 55, 166, 20);
		panel_2.add(spinner);
		
		textField_6 = new JTextField();
		textField_6.setBounds(320, 151, 166, 19);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 247, 496, 20);
		updateEmployeeFrame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Leave Information: ");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_2.setBounds(0, 0, 172, 20);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 267, 496, 48);
		updateEmployeeFrame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Sick Leave (Days): ");
		lblNewLabel_11.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_11.setBounds(0, 0, 248, 48);
		panel_4.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Annual Leave (Days): ");
		lblNewLabel_12.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_12.setBounds(248, 0, 248, 48);
		panel_4.add(lblNewLabel_12);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(115, 15, 110, 20);
		panel_4.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(376, 15, 110, 20);
		panel_4.add(spinner_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 314, 496, 39);
		updateEmployeeFrame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_1.setBounds(50, 10, 85, 21);
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Go Back");
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_2.setBounds(350, 10, 85, 21);
		panel_5.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update");
		btnNewButton_3.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_3.setBounds(200, 10, 85, 21);
		panel_5.add(btnNewButton_3);
	}

}
