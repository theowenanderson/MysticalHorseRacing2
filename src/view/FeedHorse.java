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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Pick the food you will feed your horse!");
		comboBox.setBounds(165, 29, 109, 20);
		contentPane.add(comboBox);
		
		comboBox.addItem("Carrot");
		comboBox.addItem("Eggplant");
		comboBox.addItem("Sugar Cube");
		comboBox.addItem("Various Fruits");
		
		JButton btnFeedAndReturn = new JButton("Feed Horse and Return to Horse Viewer");
		btnFeedAndReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedFood = comboBox.getSelectedItem().toString();
				JOptionPane.showMessageDialog(null, "Your horse has been fed the " + selectedFood);
				dispose();
			}
		});
		btnFeedAndReturn.setBounds(10, 60, 414, 23);
		contentPane.add(btnFeedAndReturn);
		
		JLabel lblSelectFood = new JLabel("Select food!");
		lblSelectFood.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectFood.setBounds(165, 11, 109, 20);
		contentPane.add(lblSelectFood);
		
		JButton btnReturnToHorse = new JButton("Return to Horse Viewer");
		btnReturnToHorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnReturnToHorse.setBounds(10, 89, 414, 23);
		contentPane.add(btnReturnToHorse);
	}
}
