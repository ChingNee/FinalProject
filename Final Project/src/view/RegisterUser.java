package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class RegisterUser {

	private JFrame registerScreenFrame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterUser window = new RegisterUser();
					window.registerScreenFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegisterUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		registerScreenFrame = new JFrame();
		registerScreenFrame.setTitle("Register Screen");
		registerScreenFrame.setBounds(100, 100, 520, 400);
		registerScreenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registerScreenFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 486, 343);
		registerScreenFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User ID: ");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel.setBounds(60, 80, 90, 13);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(160, 79, 255, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name: ");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(60, 120, 90, 13);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 119, 255, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password: ");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(60, 160, 90, 13);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton.setBounds(60, 245, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Go Back");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_1.setBounds(330, 245, 85, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton_2.setBounds(195, 245, 85, 21);
		panel.add(btnNewButton_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(160, 159, 255, 19);
		panel.add(passwordField);
	}

}
