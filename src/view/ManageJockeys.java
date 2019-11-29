package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ManageJockeys extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageJockeys frame = new ManageJockeys();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManageJockeys() {
		setTitle("Manage Jockeys");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHireJockey = new JButton("Hire Jockey");
		btnHireJockey.setBounds(10, 11, 130, 118);
		contentPane.add(btnHireJockey);
		
		JButton btnFireJockey = new JButton("Fire Jockey");
		btnFireJockey.setBounds(294, 11, 130, 118);
		contentPane.add(btnFireJockey);
		
		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.setBounds(150, 61, 135, 68);
		contentPane.add(btnReturnToMain);
		
		JLabel lblCurrentJockeyName = new JLabel("No Jockey Currently");
		lblCurrentJockeyName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentJockeyName.setToolTipText("Name of your current jockey.");
		lblCurrentJockeyName.setBounds(150, 36, 135, 14);
		contentPane.add(lblCurrentJockeyName);
		
		JLabel lblCurrentJockey = new JLabel("Current Jockey:");
		lblCurrentJockey.setToolTipText("Name of your current jockey.");
		lblCurrentJockey.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentJockey.setBounds(150, 11, 135, 14);
		contentPane.add(lblCurrentJockey);
	}

}
