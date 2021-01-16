package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;

public class OptionManageEmployee {

	private JFrame optionOfManageEmployeeFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OptionManageEmployee window = new OptionManageEmployee();
					window.optionOfManageEmployeeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OptionManageEmployee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		optionOfManageEmployeeFrame = new JFrame();
		optionOfManageEmployeeFrame.setTitle("Option of Manage Employee");
		optionOfManageEmployeeFrame.setBounds(100, 100, 520, 400);
		optionOfManageEmployeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		optionOfManageEmployeeFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 486, 72);
		optionOfManageEmployeeFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select An Action");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(160, 24, 172, 26);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 92, 486, 250);
		optionOfManageEmployeeFrame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(3,1));
		
		JButton btnNewButton = new JButton("Add Employee");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update Employee");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete Employee");
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton_2);
	}

}
