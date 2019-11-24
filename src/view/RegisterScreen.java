package view;

import java.awt.BorderLayout;
import java.util.*;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GameEngine;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegisterScreen extends JFrame {

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
					RegisterScreen frame = new RegisterScreen();
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
	public RegisterScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setBounds(5, 5, 424, 14);
		contentPane.add(lblRegister);
		
		JLabel lblDesiredUsername = new JLabel("Desired Username");
		lblDesiredUsername.setBounds(10, 70, 424, 14);
		contentPane.add(lblDesiredUsername);
		
		user = new JTextField();
		user.setBounds(5, 84, 213, 34);
		contentPane.add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(5, 156, 213, 34);
		contentPane.add(pass);
		
		JLabel lblDesiredPassword = new JLabel("Desired Password");
		lblDesiredPassword.setBounds(10, 131, 424, 14);
		contentPane.add(lblDesiredPassword);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = GameEngine.getConnection();
				String username = user.getText();
				String password = pass.getText();
				Random rand = new Random();
				int userid = rand.nextInt(1000);
				try {
					
					PreparedStatement createUser = conn.prepareStatement("INSERT INTO users (username,password,id) VALUES ('"+username+"', '"+password+"', '"+userid+"')");				
					createUser.executeUpdate();
					JOptionPane.showMessageDialog(null, "Registration Successful");
					dispose();
					}
				catch(Exception e1) {
					System.out.print(e1);
				}
			}
		});
		btnNewButton.setBounds(29, 214, 89, 23);
		contentPane.add(btnNewButton);
	}
}
