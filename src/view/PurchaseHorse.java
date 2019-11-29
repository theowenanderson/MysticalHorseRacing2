package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class PurchaseHorse extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PurchaseHorse frame = new PurchaseHorse();
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
	public PurchaseHorse() {
		setTitle("Purchase a horse!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBoxHorseOnSaleList = new JComboBox();
		comboBoxHorseOnSaleList.setBounds(10, 36, 208, 20);
		contentPane.add(comboBoxHorseOnSaleList);
		
		JLabel lblPickAHorse = new JLabel("Pick a horse to purchase!");
		lblPickAHorse.setBounds(10, 11, 208, 14);
		contentPane.add(lblPickAHorse);
		
		JButton btnConfirmPurchase = new JButton("Confirm Purchase");
		btnConfirmPurchase.setBounds(10, 320, 414, 33);
		contentPane.add(btnConfirmPurchase);
		
		JLabel label = new JLabel("Leg Size");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(228, 39, 64, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Body Size");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(228, 67, 64, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Stamina");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(228, 98, 64, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Strength");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_3.setBounds(228, 129, 64, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Acceleration");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_4.setBounds(228, 160, 83, 20);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Confidence");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setBounds(228, 191, 64, 20);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Luck");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(228, 222, 64, 18);
		contentPane.add(label_6);
		
		JProgressBar progressBar_legSize = new JProgressBar();
		progressBar_legSize.setMaximum(10);
		progressBar_legSize.setBounds(321, 43, 103, 14);
		contentPane.add(progressBar_legSize);
		
		JProgressBar progressBar_bodySize = new JProgressBar();
		progressBar_bodySize.setMaximum(10);
		progressBar_bodySize.setBounds(321, 68, 103, 14);
		contentPane.add(progressBar_bodySize);
		
		JProgressBar progressBar_stamina = new JProgressBar();
		progressBar_stamina.setMaximum(10);
		progressBar_stamina.setBounds(321, 98, 103, 14);
		contentPane.add(progressBar_stamina);
		
		JProgressBar progressBar_strength = new JProgressBar();
		progressBar_strength.setMaximum(10);
		progressBar_strength.setBounds(321, 129, 103, 14);
		contentPane.add(progressBar_strength);
		
		JProgressBar progressBar_acceleration = new JProgressBar();
		progressBar_acceleration.setMaximum(10);
		progressBar_acceleration.setBounds(321, 160, 103, 14);
		contentPane.add(progressBar_acceleration);
		
		JProgressBar progressBar_confidence = new JProgressBar();
		progressBar_confidence.setMaximum(10);
		progressBar_confidence.setBounds(321, 191, 103, 14);
		contentPane.add(progressBar_confidence);
		
		JProgressBar progressBar_luck = new JProgressBar();
		progressBar_luck.setMaximum(10);
		progressBar_luck.setBounds(321, 222, 103, 14);
		contentPane.add(progressBar_luck);
		
		JLabel lblHorseName = new JLabel("");
		lblHorseName.setBounds(228, 11, 196, 14);
		contentPane.add(lblHorseName);
		
		JButton btnReturnToStable = new JButton("Return to Stable");
		btnReturnToStable.setBounds(10, 354, 414, 23);
		contentPane.add(btnReturnToStable);
		
		JLabel lblCost = new JLabel("Cost: $");
		lblCost.setBounds(228, 251, 46, 14);
		contentPane.add(lblCost);
		
		JLabel lblCurrentFunds = new JLabel("Current Funds: $");
		lblCurrentFunds.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentFunds.setBounds(10, 295, 414, 14);
		contentPane.add(lblCurrentFunds);
	}
}
