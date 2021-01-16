package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginUser {

	private JFrame loginScreenFrame;
	private JTextField userIDField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUser window = new LoginUser();
					window.loginScreenFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginScreenFrame = new JFrame();
		loginScreenFrame.setTitle("Login Screen");
		loginScreenFrame.setBounds(100, 100, 520, 400);
		loginScreenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginScreenFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 486, 343);
		loginScreenFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel userIDLabel = new JLabel("User ID: ");
		userIDLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
		userIDLabel.setBounds(66, 83, 85, 13);
		panel.add(userIDLabel);
		
		userIDField = new JTextField();
		userIDField.setBounds(161, 82, 245, 19);
		panel.add(userIDField);
		userIDField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
		passwordLabel.setBounds(66, 130, 85, 13);
		panel.add(passwordLabel);
		
		JButton resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Verdana", Font.BOLD, 10));
		resetButton.setBounds(66, 220, 85, 21);
		panel.add(resetButton);
		
		JButton goBackButton = new JButton("Go Back");
		goBackButton.setFont(new Font("Verdana", Font.BOLD, 10));
		goBackButton.setBounds(321, 220, 85, 21);
		panel.add(goBackButton);
		
		JButton loginButton = new JButton("Login");
		loginButton.setFont(new Font("Verdana", Font.BOLD, 10));
		loginButton.setBounds(194, 220, 85, 21);
		panel.add(loginButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		passwordField.setBounds(161, 129, 245, 19);
		panel.add(passwordField);
	}
}
