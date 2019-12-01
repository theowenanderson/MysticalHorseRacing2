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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HorseViewer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HorseViewer frame = new HorseViewer();
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
	public HorseViewer() {
		Connection conn = GameEngine.getConnection();
		String[] horses = {""};
		
		int i = 0;
		try{
		Statement stmt = conn.createStatement();
		String sql = "Select horse_name from horses where linked_user_id='"+GameEngine.userID_current+"'";
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			horses[0] = (rs.getString("horse_name"));

		}
		
		setTitle("View Horses");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFeedHorse = new JButton("Feed Selected Horse");
		btnFeedHorse.setBounds(10, 175, 174, 23);
		contentPane.add(btnFeedHorse);
		
		JComboBox comboBoxHorseSelection = new JComboBox(horses);
		comboBoxHorseSelection.setSelectedIndex(0);
		comboBoxHorseSelection.setBounds(140, 95, 154, 20);
		contentPane.add(comboBoxHorseSelection);
		
		JLabel lblSelectHorse = new JLabel("Select a Horse");
		lblSelectHorse.setBounds(178, 70, 96, 14);
		contentPane.add(lblSelectHorse);
		
		JButton btnRetireHorse = new JButton("Retire Selected Horse");
		btnRetireHorse.setBounds(250, 175, 174, 23);
		contentPane.add(btnRetireHorse);
		btnRetireHorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String horse_name = comboBoxHorseSelection.getSelectedItem().toString();
				PreparedStatement removeHorse;
				try {
					removeHorse = conn.prepareStatement("Delete from horses where linked_user_id='"+GameEngine.userID_current+
							"' and horse_name='"+horse_name+"'");
					removeHorse.executeUpdate();
					JOptionPane.showMessageDialog(null, "Retiring Successful");
				} catch (SQLException e2) {
					JOptionPane.showMessageDialog(null, "Horse was not retired.");
					e2.printStackTrace();
				}
				//"DELETE FROM horses WHERE linked_user_id='"+GameEngine.userID_current+"' AND horse_name="+horse_name;
			}
		});
		
		JButton btnReturnToStables = new JButton("Return to Stables");
		btnReturnToStables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnReturnToStables.setBounds(140, 209, 154, 42);
		contentPane.add(btnReturnToStables);
		
		}catch(Exception e1) {
			System.out.print(e1);
		}
	}
}
