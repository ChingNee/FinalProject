package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Welcome {

	private JFrame mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					Welcome window = new Welcome();
					window.mainFrame.setVisible(true);
					
				} 
				catch (Exception e) {
					
					e.printStackTrace();
					
				}
				
			}
			
		});
		
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		mainFrame = new JFrame();
		mainFrame.setTitle("Payroll Management Saystem");
		mainFrame.setBounds(100, 100, 520, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 486, 343);
		mainFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to PayRoll Management System");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel.setBounds(88, 160, 316, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(200, 33, 100, 102);
		panel.add(lblNewLabel_1);
		
		ImageIcon icon = new ImageIcon("E:\\3.0 Homework\\Second Year Sem One"
				+ "\\3.0 Oject Oriented Programming\\Final Project"
				+ "\\5.0 Picture\\payroll logo edited.png");
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		lblNewLabel_1.setIcon(scaledIcon);
		
		JButton registerButton = new JButton("Register");
		registerButton.setFont(new Font("Verdana", Font.BOLD, 10));
		registerButton.setBounds(203, 240, 85, 21);
		panel.add(registerButton);
		
		JButton loginButton = new JButton("Login");
		loginButton.setFont(new Font("Verdana", Font.BOLD, 10));
		loginButton.setBounds(88, 240, 85, 21);
		panel.add(loginButton);
		
		JButton applyButton = new JButton("Apply");
		applyButton.setFont(new Font("Verdana", Font.BOLD, 10));
		applyButton.setBounds(319, 240, 85, 21);
		panel.add(applyButton);
		
	}
	
}
