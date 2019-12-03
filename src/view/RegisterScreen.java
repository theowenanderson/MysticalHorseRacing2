package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.*;
import java.sql.*;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GameEngine;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegisterScreen extends JFrame {

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
		setLayout(null);
		setTitle("Create an Account!");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 255));
		setBounds(100, 100, 400, 300);
		panel.setBounds(6, 6, 393, 289);
		add(panel);
		panel.setLayout(null);

		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBounds(200, 233, 79, 29);
		panel.add(btnNewButton);
		
		
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
				String username = textField.getText();
				String password = passwordField.getText();
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
	}
}
