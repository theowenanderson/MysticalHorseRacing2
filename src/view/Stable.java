package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stable frame = new Stable();
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
	public Stable() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnViewHorses = new JButton("View Horses");
		btnViewHorses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HorseCreator h = new HorseCreator();
				h.setVisible(true);
			}
		});
		btnViewHorses.setBounds(10, 125, 120, 30);
		contentPane.add(btnViewHorses);
		
		JButton btnCreateHorse = new JButton("Create Horse");
		btnCreateHorse.setBounds(151, 125, 120, 30);
		contentPane.add(btnCreateHorse);
	}
}