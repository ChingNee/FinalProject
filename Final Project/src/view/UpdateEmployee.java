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
	private JTextField employeeIDField;
	private JTextField employeeNameField;
	private JTextField accNoField;
	private JTextField positionField;
	private JTextField dateJoinedField;
	private JTextField phoneNoField;
	private JTextField salaryField;

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
		
		JLabel employeeInformationLabel = new JLabel("Employee Information: ");
		employeeInformationLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		employeeInformationLabel.setBounds(0, 0, 205, 20);
		panel.add(employeeInformationLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 30, 496, 40);
		updateEmployeeFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel employeeIDLabel = new JLabel("Employee ID: ");
		employeeIDLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
		employeeIDLabel.setBounds(70, 14, 84, 13);
		panel_1.add(employeeIDLabel);
		
		employeeIDField = new JTextField();
		employeeIDField.setBounds(164, 11, 165, 19);
		panel_1.add(employeeIDField);
		employeeIDField.setColumns(10);
		
		JButton searchButton = new JButton("Search");
		searchButton.setFont(new Font("Verdana", Font.BOLD, 10));
		searchButton.setBounds(339, 10, 85, 21);
		panel_1.add(searchButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 68, 496, 180);
		updateEmployeeFrame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
		nameLabel.setBounds(0, 0, 248, 45);
		panel_2.add(nameLabel);
		
		JLabel phoneNoLabel = new JLabel("Phone No: ");
		phoneNoLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
		phoneNoLabel.setBounds(248, 0, 248, 45);
		panel_2.add(phoneNoLabel);
		
		JLabel genderLabel = new JLabel("Gender: ");
		genderLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
		genderLabel.setBounds(0, 45, 248, 45);
		panel_2.add(genderLabel);
		
		JLabel ageLabel = new JLabel("Age: ");
		ageLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
		ageLabel.setBounds(248, 45, 248, 45);
		panel_2.add(ageLabel);
		
		JLabel accNoLabel = new JLabel("Acc No: ");
		accNoLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
		accNoLabel.setBounds(0, 90, 248, 45);
		panel_2.add(accNoLabel);
		
		JLabel dateJoinedLabel = new JLabel("Date Join: ");
		dateJoinedLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
		dateJoinedLabel.setBounds(248, 90, 248, 45);
		panel_2.add(dateJoinedLabel);
		
		JLabel positionLabel = new JLabel("Position: ");
		positionLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
		positionLabel.setBounds(0, 135, 248, 45);
		panel_2.add(positionLabel);
		
		JLabel salaryLabel = new JLabel("Salary: ");
		salaryLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
		salaryLabel.setBounds(248, 135, 248, 45);
		panel_2.add(salaryLabel);
		
		employeeNameField = new JTextField();
		employeeNameField.setBounds(60, 13, 165, 19);
		panel_2.add(employeeNameField);
		employeeNameField.setColumns(10);
		
		String[] choices = {"Male", "Female"};
		JComboBox genderField = new JComboBox(choices);
		genderField.setBounds(60, 57, 165, 21);
		genderField.setSelectedIndex(0);
		panel_2.add(genderField);
		
		accNoField = new JTextField();
		accNoField.setBounds(60, 103, 165, 19);
		panel_2.add(accNoField);
		accNoField.setColumns(10);
		
		positionField = new JTextField();
		positionField.setBounds(60, 148, 165, 19);
		panel_2.add(positionField);
		positionField.setColumns(10);
		
		dateJoinedField = new JTextField();
		dateJoinedField.setBounds(320, 103, 166, 19);
		panel_2.add(dateJoinedField);
		dateJoinedField.setColumns(10);
		
		phoneNoField = new JTextField();
		phoneNoField.setBounds(320, 13, 166, 19);
		panel_2.add(phoneNoField);
		phoneNoField.setColumns(10);
		
		JSpinner ageField = new JSpinner();
		ageField.setBounds(320, 55, 166, 20);
		panel_2.add(ageField);
		
		salaryField = new JTextField();
		salaryField.setBounds(320, 151, 166, 19);
		panel_2.add(salaryField);
		salaryField.setColumns(10);
		
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
		
		JLabel sickLeaveLabel = new JLabel("Sick Leave (Days): ");
		sickLeaveLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
		sickLeaveLabel.setBounds(0, 0, 248, 48);
		panel_4.add(sickLeaveLabel);
		
		JLabel annualLeaveLabel = new JLabel("Annual Leave (Days): ");
		annualLeaveLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
		annualLeaveLabel.setBounds(248, 0, 248, 48);
		panel_4.add(annualLeaveLabel);
		
		JSpinner sickLeaveField = new JSpinner();
		sickLeaveField.setBounds(115, 15, 110, 20);
		panel_4.add(sickLeaveField);
		
		JSpinner annualLeaveField = new JSpinner();
		annualLeaveField.setBounds(376, 15, 110, 20);
		panel_4.add(annualLeaveField);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 314, 496, 39);
		updateEmployeeFrame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Verdana", Font.BOLD, 10));
		resetButton.setBounds(50, 10, 85, 21);
		panel_5.add(resetButton);
		
		JButton goBackButton = new JButton("Go Back");
		goBackButton.setFont(new Font("Verdana", Font.BOLD, 10));
		goBackButton.setBounds(350, 10, 85, 21);
		panel_5.add(goBackButton);
		
		JButton updateButton = new JButton("Update");
		updateButton.setFont(new Font("Verdana", Font.BOLD, 10));
		updateButton.setBounds(200, 10, 85, 21);
		panel_5.add(updateButton);
	}

}
