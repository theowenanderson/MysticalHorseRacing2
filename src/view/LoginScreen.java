package view;


import java.awt.BorderLayout;

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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class LoginScreen extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginPage = new JLabel("Username");
		lblLoginPage.setBounds(20, 57, 67, 24);
		contentPane.add(lblLoginPage);
		
		user = new JTextField();
		user.setFont(new Font("Tahoma", Font.PLAIN, 12));
		user.setBounds(10, 80, 211, 31);
		contentPane.add(user);
		user.setColumns(10);
		
		JLabel label = new JLabel("Login Page");
		label.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label.setBounds(10, 11, 148, 40);
		contentPane.add(label);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(20, 134, 67, 24);
		contentPane.add(lblPassword);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pass.setBounds(10, 157, 211, 31);
		contentPane.add(pass);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = GameEngine.getConnection();
				String username = user.getText();
				String password = pass.getText();
				try {
					//Class.forName("com.mysql.jdbc.Driver");
					
					Statement stmt = conn.createStatement();
					String sql = "Select * from Users where username='"+username+"' and Password='"+password+"'";					
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Successful");
						GameEngine.username_current = username;
						sql = "Select id from Users where username='"+username+"'";
						rs = stmt.executeQuery(sql);
						if(rs.next()) {
							GameEngine.userID_current = rs.getInt("id");
							Menu men = new Menu();
							men.setVisible(true);
						}
						else System.out.println("error");
	
					}
					else {
						JOptionPane.showMessageDialog(null, "User not found");
					}
				}catch(Exception e1) {
					System.out.print(e);
				}
			}
		});
		btnLogin.setBounds(20, 199, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterScreen nc = new RegisterScreen();
				nc.setVisible(true);
				
			}
		});
		btnRegister.setBounds(132, 199, 89, 23);
		contentPane.add(btnRegister);
	}
}
