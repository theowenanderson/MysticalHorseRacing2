package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class HireJockey extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HireJockey frame = new HireJockey();
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
	public HireJockey() {
		setTitle("Hire Jockey!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 221, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 185, 20);
		contentPane.add(comboBox);
		
		JLabel lblSelectAJockey = new JLabel("Select a jockey to hire!");
		lblSelectAJockey.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelectAJockey.setBounds(10, 11, 185, 14);
		contentPane.add(lblSelectAJockey);
		
		JButton btnHireSelectedJockey = new JButton("Hire Jockey");
		btnHireSelectedJockey.setBounds(10, 67, 185, 35);
		contentPane.add(btnHireSelectedJockey);
		
		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.setBounds(10, 101, 185, 35);
		contentPane.add(btnReturnToMain);
	}

}
