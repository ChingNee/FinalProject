package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class OptionApply {

	private JFrame optionOfApplyFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OptionApply window = new OptionApply();
					window.optionOfApplyFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OptionApply() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		optionOfApplyFrame = new JFrame();
		optionOfApplyFrame.setTitle("Option of Apply");
		optionOfApplyFrame.setBounds(100, 100, 520, 400);
		optionOfApplyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		optionOfApplyFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 25, 486, 70);
		optionOfApplyFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select An Action");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(162, 25, 172, 20);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 105, 486, 230);
		optionOfApplyFrame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(4,1));
		
		JButton btnNewButton = new JButton("Add Claim");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Add Leave");
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("View Claim Status");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("View Leave Status");
		btnNewButton_3.setFont(new Font("Verdana", Font.BOLD, 10));
		panel_1.add(btnNewButton_3);
	}

}
