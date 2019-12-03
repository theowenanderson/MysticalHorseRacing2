package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GameEngine;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Panel;



public class LoginScreen extends JFrame {

	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
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
	public LoginScreen() {
		setLayout(null);
		setTitle("Login!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 255));
		setBounds(100, 100, 400, 300);
		panel.setBounds(6, 6, 393, 289);
		add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(109, 233, 79, 29);
		panel.add(btnNewButton);
		
		JButton button = new JButton("Register");
		button.setBounds(200, 233, 79, 29);
		panel.add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterScreen nc = new RegisterScreen();
				nc.setVisible(true);
				
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setBounds(164, 183, 130, 26);
		panel.add(passwordField);
		
		JLabel label = new JLabel("Password");
		label.setBounds(80, 183, 72, 27);
		panel.add(label);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(80, 144, 72, 27);
		panel.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(164, 144, 130, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblMystical = new JLabel("Mystical");
		lblMystical.setFont(new Font("Noteworthy", Font.PLAIN, 17));
		lblMystical.setBounds(251, 6, 72, 20);
		panel.add(lblMystical);
		
		JLabel label_1 = new JLabel("Horse");
		label_1.setFont(new Font("Noteworthy", Font.PLAIN, 17));
		label_1.setBounds(261, 25, 72, 20);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Racing");
		label_2.setFont(new Font("Noteworthy", Font.PLAIN, 17));
		label_2.setBounds(271, 41, 72, 29);
		panel.add(label_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img/charlie3.jpg"));
		lblNewLabel.setBounds(23, 6, 353, 126);
		panel.add(lblNewLabel);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Connection conn = GameEngine.getConnection();
					String username = passwordField.getText();
					String password = textField.getText();
					try {
						//Class.forName("com.mysql.jdbc.Driver");
						
						Statement stmt = conn.createStatement();
						String sql = "Select * from users where username='"+username+"' and Password='"+password+"'";					
						ResultSet rs = stmt.executeQuery(sql);
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, "Login Successful");
							GameEngine.username_current = username;
							sql = "Select id from users where username='"+username+"'";
							rs = stmt.executeQuery(sql);
							if(rs.next()) {
								GameEngine.userID_current = rs.getInt("id");
								sql = "Select balance from users where username='"+username+"'";
								rs = stmt.executeQuery(sql);
								if(rs.next()) {
									GameEngine.userIDbalance = rs.getInt("balance");
									
								}
								else System.out.println("error with obtaining balance");
								
							}
		
							else System.out.println("error with obtaining user id");
							Menu men = new Menu();
							men.setVisible(true);
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "User not found");
						}
					}catch(Exception e1) {
						System.out.print(e);
					}
				}
			});

	}
}
