package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;

public class OptionUser {

	private JFrame optionScreenFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OptionUser window = new OptionUser();
					window.optionScreenFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OptionUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		optionScreenFrame = new JFrame();
		optionScreenFrame.setTitle("Option Screen");
		optionScreenFrame.setBounds(100, 100, 520, 400);
		optionScreenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		optionScreenFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 486, 60);
		optionScreenFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select An Action");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(163, 31, 172, 19);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 90, 486, 243);
		optionScreenFrame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(4,2));
		
		JButton btnNewButton = new JButton("Manage Employee");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Manage Claim");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Manage Leave Application");
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Manage Payroll");
		btnNewButton_3.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("View Employee List");
		btnNewButton_4.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("View Claim List");
		btnNewButton_5.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("View Leave List");
		btnNewButton_6.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("View Payroll List");
		btnNewButton_7.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton_7);
	}

}
