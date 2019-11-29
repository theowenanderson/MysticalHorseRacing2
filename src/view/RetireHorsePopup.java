package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RetireHorsePopup extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetireHorsePopup frame = new RetireHorsePopup();
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
	public RetireHorsePopup() {
		setTitle("The horse was retired...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 293, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Return to Horse Viewer");
		btnNewButton.setBounds(10, 28, 257, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblHorseRetired = new JLabel("The selected horse was retired.");
		lblHorseRetired.setHorizontalAlignment(SwingConstants.CENTER);
		lblHorseRetired.setBounds(10, 11, 257, 14);
		contentPane.add(lblHorseRetired);
	}

}
