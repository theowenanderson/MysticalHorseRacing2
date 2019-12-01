package view;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GameEngine;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
		

		
		
		
		
		setTitle("Main Menu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// get balance
		JLabel lbl_balance = new JLabel("");
		lbl_balance.setBounds(345, 45, 46, 14);
		contentPane.add(lbl_balance);
		lbl_balance.setText(Integer.toString(GameEngine.userIDbalance));
		
		
		JButton btnViewStable = new JButton("View Stable");
		btnViewStable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stable s = new Stable();
				s.setVisible(true);
			}
		});
		btnViewStable.setBounds(10, 100, 130, 23);
		contentPane.add(btnViewStable);
		
		JButton btnNewButton = new JButton("Manage Jockeys");
		btnNewButton.setBounds(294, 100, 130, 23);
		contentPane.add(btnNewButton);
		
		JButton btnViewRaceResults = new JButton("View Race Results");
		btnViewRaceResults.setBounds(10, 134, 194, 51);
		contentPane.add(btnViewRaceResults);
		
		JButton btnViewRaceIn = new JButton("View Race in Progress");
		btnViewRaceIn.setBounds(230, 134, 194, 51);
		contentPane.add(btnViewRaceIn);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameEngine.userID_current = 0;
				dispose();
				LoginScreen ls = new LoginScreen();
				ls.setVisible(true);
			}
		});
		btnLogOut.setBounds(335, 11, 89, 23);
		contentPane.add(btnLogOut);
		
		JButton btnEnterRace = new JButton("Enter Race");
		btnEnterRace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = GameEngine.getConnection();
					
					Statement stmt = conn.createStatement();
					String checkRace = "Select * from race where user_id_entered='" + GameEngine.userID_current + "'";
					ResultSet rs = stmt.executeQuery(checkRace);
					if(rs.next())
					{
						PreparedStatement enterRace = conn.prepareStatement("INSERT INTO race (user_id_entered) VALUES ('"+GameEngine.userID_current+"')");				
						enterRace.executeUpdate();
						JOptionPane.showMessageDialog(null, "Entering Race Successful");
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Already entered into race");
					}
					
					}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Entering Race Failed");
					System.out.print(e1);
				}
			}
		});
		btnEnterRace.setBounds(10, 196, 414, 55);
		contentPane.add(btnEnterRace);
		
		JLabel user_cash_label = new JLabel("$");
		user_cash_label.setBounds(335, 45, 46, 14);
		contentPane.add(user_cash_label);
		
		JLabel lbl_time = new JLabel("");
		lbl_time.setBounds(192, 11, 46, 14);
		contentPane.add(lbl_time);
		
	
	
		
		
	}
}
