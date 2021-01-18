package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewLeaveList {

	private JFrame viewLeaveListFrame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLeaveList window = new ViewLeaveList();
					window.viewLeaveListFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewLeaveList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		viewLeaveListFrame = new JFrame();
		viewLeaveListFrame.setTitle("ViewLeaveList");
		viewLeaveListFrame.setBounds(100, 100, 520, 400);
		viewLeaveListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewLeaveListFrame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Go Back");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 10));
		btnNewButton.setBounds(400, 335, 85, 21);
		viewLeaveListFrame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Leave Application List");
		lblNewLabel.setBounds(165, 10, 190, 25);
		viewLeaveListFrame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 37, 486, 288);
		viewLeaveListFrame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Leave ID", "Employee ID", "Type", "Status", "Date"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setFont(new Font("Verdana", Font.PLAIN, 10));
		scrollPane.setViewportView(table);
	}
}
