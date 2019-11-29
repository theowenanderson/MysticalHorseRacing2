package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FeedHorse extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeedHorse frame = new FeedHorse();
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
	public FeedHorse() {
		setTitle("Feed your horse!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFeedAndReturn = new JButton("Feed Horse and Return to Horse Viewer");
		btnFeedAndReturn.setBounds(10, 60, 414, 23);
		contentPane.add(btnFeedAndReturn);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Pick the food you will feed your horse!");
		comboBox.setBounds(165, 29, 109, 20);
		contentPane.add(comboBox);
		
		JLabel lblSelectFood = new JLabel("Select food!");
		lblSelectFood.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectFood.setBounds(165, 11, 109, 20);
		contentPane.add(lblSelectFood);
		
		JButton btnReturnToHorse = new JButton("Return to Horse Viewer");
		btnReturnToHorse.setBounds(10, 89, 414, 23);
		contentPane.add(btnReturnToHorse);
	}
}
