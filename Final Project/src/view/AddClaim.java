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

public class AddClaim {

	private JFrame addClaimFrame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddClaim window = new AddClaim();
					window.addClaimFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddClaim() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addClaimFrame = new JFrame();
		addClaimFrame.setTitle("Add Claim");
		addClaimFrame.setBounds(100, 100, 520, 400);
		addClaimFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addClaimFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 47, 486, 24);
		addClaimFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Information: ");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 0, 205, 20);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 81, 486, 80);
		addClaimFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID: ");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(80, 33, 88, 13);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(170, 30, 225, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 171, 486, 24);
		addClaimFrame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Claim Information: ");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_2.setBounds(0, 0, 178, 24);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 205, 486, 80);
		addClaimFrame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Amount: ");
		lblNewLabel_3.setBounds(95, 0, 210, 80);
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 10));
		panel_3.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 31, 225, 19);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 295, 486, 40);
		addClaimFrame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_1.setBounds(51, 10, 85, 21);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Go Back");
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_2.setBounds(351, 10, 85, 21);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Apply");
		btnNewButton_3.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_3.setBounds(201, 10, 85, 21);
		panel_4.add(btnNewButton_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 10, 486, 30);
		addClaimFrame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Date: ");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(290, 10, 45, 13);
		panel_5.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(335, 7, 141, 19);
		panel_5.add(textField_3);
		textField_3.setColumns(10);
	}

}
