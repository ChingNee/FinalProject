package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DeleteEmployee {

	private JFrame deleteEmployeeFrame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteEmployee window = new DeleteEmployee();
					window.deleteEmployeeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeleteEmployee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		deleteEmployeeFrame = new JFrame();
		deleteEmployeeFrame.setTitle("Delete Employee");
		deleteEmployeeFrame.setBounds(100, 100, 520, 400);
		deleteEmployeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deleteEmployeeFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 82, 486, 71);
		deleteEmployeeFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee ID: ");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel.setBounds(85, 29, 84, 13);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(179, 26, 211, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 152, 486, 77);
		deleteEmployeeFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_1.setBounds(62, 40, 85, 21);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Go Back");
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_2.setBounds(341, 40, 85, 21);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_3.setBounds(201, 40, 85, 21);
		panel_1.add(btnNewButton_3);
	}

}
