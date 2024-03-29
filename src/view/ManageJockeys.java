package view;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GameEngine;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageJockeys extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageJockeys frame = new ManageJockeys();
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
	public ManageJockeys() {
		String currentJockey = "";
		Connection conn = GameEngine.getConnection();
		setTitle("Manage Jockeys");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHireJockey = new JButton("Hire Jockey");
		btnHireJockey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HireJockey h = new HireJockey();
				h.setVisible(true);
			}
		});
		btnHireJockey.setBounds(10, 11, 130, 118);
		contentPane.add(btnHireJockey);
		
		
		try{
		Statement stmt = conn.createStatement();
		
		
		JButton btnFireJockey = new JButton("Fire Jockey");
		btnFireJockey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jockeyName = "";
				String sql = "Select jockey_name from jockeys where linked_user_id='"+GameEngine.userID_current+"'";
	
					try {
						ResultSet rs = stmt.executeQuery(sql);
						if(rs.next()) {
							
							jockeyName = (rs.getString("jockey_name"));
							//If there is a  associated with the account, set the desired string as the jockey's name.
							PreparedStatement removeJockey;
						removeJockey = conn.prepareStatement("Delete from jockeys where linked_user_id='"+GameEngine.userID_current+
								"'");
						removeJockey.executeUpdate();
						JOptionPane.showMessageDialog(null, "Fired Jockey Successfully");
						}
					}
					 catch (SQLException e2) {
						JOptionPane.showMessageDialog(null, "Jockey was not fired.");
						e2.printStackTrace();
					}
					
				
				
					
				
				
				
			}
		});
		btnFireJockey.setBounds(294, 11, 130, 118);
		contentPane.add(btnFireJockey);
		
		
		
		
		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnReturnToMain.setBounds(150, 61, 135, 68);
		contentPane.add(btnReturnToMain);
		
		
		String sql = "Select jockey_name from jockeys where linked_user_id='"+GameEngine.userID_current+"'";
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			
			currentJockey = (rs.getString("jockey_name"));
			//If there is a jockey associated with the account, set the desired string as the jockey's name.
			
		}
		else{
			currentJockey = "No Jockey Currently";
		}
		
		
		}catch(Exception e1) {
			System.out.print(e1);
		}
		
		JLabel lblCurrentJockeyName = new JLabel("");
		lblCurrentJockeyName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentJockeyName.setToolTipText("Name of your current jockey.");
		lblCurrentJockeyName.setBounds(150, 36, 135, 14);
		contentPane.add(lblCurrentJockeyName);
		lblCurrentJockeyName.setText(currentJockey);
		
		JLabel lblCurrentJockey = new JLabel("Current Jockey:");
		lblCurrentJockey.setToolTipText("Name of your current jockey.");
		lblCurrentJockey.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentJockey.setBounds(150, 11, 135, 14);
		contentPane.add(lblCurrentJockey);
	}

}
