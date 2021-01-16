package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JButton;

public class AddEmployee {

	private JFrame addEmployeeFrame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee window = new AddEmployee();
					window.addEmployeeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddEmployee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addEmployeeFrame = new JFrame();
		addEmployeeFrame.setTitle("Add Employee");
		addEmployeeFrame.setBounds(100, 100, 520, 400);
		addEmployeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addEmployeeFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Information: ");
		lblNewLabel.setBounds(10, 10, 182, 19);
		addEmployeeFrame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 486, 19);
		addEmployeeFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 27, 486, 208);
		addEmployeeFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name: ");
		lblNewLabel_1.setBounds(0, 0, 243, 54);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone No: ");
		lblNewLabel_2.setBounds(243, 0, 243, 54);
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender: ");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(0, 54, 243, 54);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Age: ");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(243, 54, 243, 54);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Acc No: ");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(0, 108, 243, 54);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Date Join: ");
		lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(243, 108, 243, 54);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Position: ");
		lblNewLabel_7.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(0, 162, 243, 54);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Salary: ");
		lblNewLabel_8.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(243, 162, 243, 54);
		panel_1.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBounds(60, 20, 165, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(60, 128, 165, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(60, 182, 165, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(321, 128, 155, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(321, 182, 155, 19);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(321, 74, 155, 20);
		panel_1.add(spinner);
		
		textField_5 = new JTextField();
		textField_5.setBounds(321, 20, 155, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		String[] choices = {"Male", "Female"};
		JComboBox comboBox = new JComboBox(choices);
		comboBox.setBounds(60, 73, 165, 21);
		comboBox.setSelectedIndex(0);
		panel_1.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 313, 486, 40);
		addEmployeeFrame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton.setBounds(60, 10, 85, 21);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Go Back");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_1.setBounds(345, 10, 85, 21);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add");
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_2.setBounds(205, 10, 85, 21);
		panel_2.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 244, 486, 19);
		addEmployeeFrame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Leave Information: ");
		lblNewLabel_9.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_9.setBounds(0, 0, 190, 19);
		panel_3.add(lblNewLabel_9);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 263, 486, 40);
		addEmployeeFrame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Sick Leave (Days): ");
		lblNewLabel_10.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(0, 10, 130, 20);
		panel_4.add(lblNewLabel_10);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(140, 13, 82, 20);
		panel_4.add(spinner_1);
		
		JLabel lblNewLabel_11 = new JLabel("Annual Leave (Days): ");
		lblNewLabel_11.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_11.setBounds(243, 10, 152, 20);
		panel_4.add(lblNewLabel_11);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(394, 13, 82, 20);
		panel_4.add(spinner_2);

	}
}
