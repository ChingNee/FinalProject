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
	private JTextField userIDField;
	private JTextField fullNameField;
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
		
		JLabel userIDLabel = new JLabel("User ID: ");
		userIDLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
		userIDLabel.setBounds(60, 80, 90, 13);
		panel.add(userIDLabel);
		
		userIDField = new JTextField();
		userIDField.setBounds(160, 79, 255, 19);
		panel.add(userIDField);
		userIDField.setColumns(10);
		
		JLabel fullNameLabel = new JLabel("Full Name: ");
		fullNameLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
		fullNameLabel.setBounds(60, 120, 90, 13);
		panel.add(fullNameLabel);
		
		fullNameField = new JTextField();
		fullNameField.setBounds(160, 119, 255, 19);
		panel.add(fullNameField);
		fullNameField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
		passwordLabel.setBounds(60, 160, 90, 13);
		panel.add(passwordLabel);
		
		JButton resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Verdana", Font.BOLD, 10));
		resetButton.setBounds(60, 245, 85, 21);
		panel.add(resetButton);
		
		JButton goBackButton = new JButton("Go Back");
		goBackButton.setFont(new Font("Verdana", Font.BOLD, 10));
		goBackButton.setBounds(330, 245, 85, 21);
		panel.add(goBackButton);
		
		JButton registerButton = new JButton("Register");
		registerButton.setFont(new Font("Verdana", Font.BOLD, 10));
		registerButton.setBounds(195, 245, 85, 21);
		panel.add(registerButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(160, 159, 255, 19);
		panel.add(passwordField);
	}

}
