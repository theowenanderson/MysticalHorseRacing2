package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;

public class HorseViewer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HorseViewer frame = new HorseViewer();
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
	public HorseViewer() {
		setTitle("View Horses");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFeedHorse = new JButton("Feed Selected Horse");
		btnFeedHorse.setBounds(10, 175, 174, 23);
		contentPane.add(btnFeedHorse);
		
		JButton btnRetireHorse = new JButton("Retire Selected Horse");
		btnRetireHorse.setBounds(250, 175, 174, 23);
		contentPane.add(btnRetireHorse);
		
		JButton btnReturnToStables = new JButton("Return to Stables");
		btnReturnToStables.setBounds(140, 209, 154, 42);
		contentPane.add(btnReturnToStables);
		
		JComboBox comboBoxHorseSelection = new JComboBox();
		comboBoxHorseSelection.setBounds(140, 95, 154, 20);
		contentPane.add(comboBoxHorseSelection);
		
		JLabel lblSelectHorse = new JLabel("Select a Horse");
		lblSelectHorse.setBounds(178, 70, 96, 14);
		contentPane.add(lblSelectHorse);
	}
}