package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class RegisterScreen extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

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
		
		username = new JTextField();
		username.setBounds(5, 84, 213, 34);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(5, 156, 213, 34);
		contentPane.add(password);
		
		JLabel label = new JLabel("Desired Username");
		label.setBounds(10, 131, 424, 14);
		contentPane.add(label);
	}
}
