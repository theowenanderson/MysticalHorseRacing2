package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ActionFailedNoMoney extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActionFailedNoMoney frame = new ActionFailedNoMoney();
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
	public ActionFailedNoMoney() {
		setTitle("Action Failed!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 126);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSorryTheAction = new JLabel("Sorry, the action you selected could not be completed because your");
		lblSorryTheAction.setVerticalAlignment(SwingConstants.TOP);
		lblSorryTheAction.setHorizontalAlignment(SwingConstants.CENTER);
		lblSorryTheAction.setBounds(10, 11, 414, 14);
		contentPane.add(lblSorryTheAction);
		
		JLabel lblDoesNotHave = new JLabel("account does not have enough funds.");
		lblDoesNotHave.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoesNotHave.setBounds(10, 31, 414, 14);
		contentPane.add(lblDoesNotHave);
		
		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.setBounds(122, 56, 185, 23);
		contentPane.add(btnReturnToMain);
	}

}
