package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GameEngine;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnViewStable = new JButton("View Stable");
		btnViewStable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stable s = new Stable();
				s.setVisible(true);
			}
		});
		btnViewStable.setBounds(10, 100, 89, 23);
		contentPane.add(btnViewStable);
		
		JLabel user_id_label = new JLabel("");
		user_id_label.setBounds(81, 33, 46, 14);
		contentPane.add(user_id_label);
		user_id_label.setText(Integer.toString(GameEngine.userID_current));
	}
}
