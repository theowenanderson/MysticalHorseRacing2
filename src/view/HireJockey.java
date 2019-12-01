package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import controller.GameEngine;
import model.Jockey;

public class HireJockey extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HireJockey frame = new HireJockey();
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
	public HireJockey() {
		setTitle("Hire Jockey!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 221, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Jockey jockeyArray[] = new Jockey[7];
		jockeyArray[0] = new Jockey("Fred", GameEngine.userID_current, "Strong Legs");
		jockeyArray[1] = new Jockey("George", GameEngine.userID_current, "Study Body");
		jockeyArray[2] = new Jockey("Frank", GameEngine.userID_current, "Long Lasting");
		jockeyArray[3] = new Jockey("Dio", GameEngine.userID_current, "Strong");
		jockeyArray[4] = new Jockey("Johnny", GameEngine.userID_current, "False Starter");
		jockeyArray[5] = new Jockey("Equest", GameEngine.userID_current, "Bravado");
		jockeyArray[6] = new Jockey("Jessica", GameEngine.userID_current, "Lucky");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 36, 185, 20);
		contentPane.add(comboBox);
		
		for(int jockeyCounter = 0; jockeyCounter < 7; jockeyCounter++){
			comboBox.addItem(jockeyArray[jockeyCounter].getName());
		}
		
		
		
		JLabel lblSelectAJockey = new JLabel("Select a jockey to hire!");
		lblSelectAJockey.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelectAJockey.setBounds(10, 11, 185, 14);
		contentPane.add(lblSelectAJockey);
		
		JButton btnHireSelectedJockey = new JButton("Hire Jockey");
		btnHireSelectedJockey.setBounds(10, 67, 185, 35);
		contentPane.add(btnHireSelectedJockey);
		btnHireSelectedJockey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Jockey j : jockeyArray)
				{
					if(comboBox.getSelectedItem().toString().equals(j.getName()))
					{
						//Add Jockey to database here.  I can't actually test this code, so I'll write some dummy code that should work.
						String val_name = j.getName();
						String val_skill = j.getSkill();
						/*
						Connection conn = GameEngine.getConnection();
						PreparedStatement addJockey;
						try {
							addJockey = conn.prepareStatement("INSERT INTO jockeys (linked_user_id,jockey_name,jockey_skill)"
									+ " VALUES ('"+GameEngine.userID_current+"','"+val_name+"', '"+val_skill+"')");
							addJockey.executeUpdate();
							JOptionPane.showMessageDialog(null, "Purchase of Jockey successful");
							GameEngine.userIDbalance -= 500;
							dispose();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, "Horse Creation failed");
							e1.printStackTrace();
						}				
						*/
					}
				}
				
			}
			});
		
		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.setBounds(10, 101, 185, 35);
		contentPane.add(btnReturnToMain);
	}

}
