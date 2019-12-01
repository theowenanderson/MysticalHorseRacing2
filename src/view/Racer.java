package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GameEngine;
import model.Horse;

import javax.swing.JLabel;

public class Racer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Racer frame = new Racer();
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
	public Racer() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblstPlace = new JLabel("1st place:");
		lblstPlace.setBounds(10, 11, 75, 14);
		contentPane.add(lblstPlace);
		
		JLabel lblndPlace = new JLabel("2nd place");
		lblndPlace.setBounds(10, 36, 75, 14);
		contentPane.add(lblndPlace);
		
		JLabel lblrdPalce = new JLabel("3rd place");
		lblrdPalce.setBounds(10, 61, 75, 14);
		contentPane.add(lblrdPalce);
		
		JLabel lblthPlace = new JLabel("4th place");
		lblthPlace.setBounds(10, 86, 75, 14);
		contentPane.add(lblthPlace);
		
		JLabel lblthPlace_1 = new JLabel("5th place");
		lblthPlace_1.setBounds(10, 111, 75, 14);
		contentPane.add(lblthPlace_1);
		
		JLabel lblthPlace_2 = new JLabel("6th place");
		lblthPlace_2.setBounds(10, 135, 75, 14);
		contentPane.add(lblthPlace_2);
		
		JLabel lblthPlace_3 = new JLabel("7th place");
		lblthPlace_3.setBounds(10, 167, 75, 14);
		contentPane.add(lblthPlace_3);
		
		JLabel lblthPlace_4 = new JLabel("8th Place");
		lblthPlace_4.setBounds(10, 192, 75, 14);
		contentPane.add(lblthPlace_4);
		
		JLabel lbl_1st = new JLabel("");
		lbl_1st.setBounds(72, 11, 122, 14);
		contentPane.add(lbl_1st);
		
		JLabel lbl_2nd = new JLabel("");
		lbl_2nd.setBounds(72, 36, 122, 14);
		contentPane.add(lbl_2nd);
		
		JLabel lbl_3rd = new JLabel("");
		lbl_3rd.setBounds(72, 61, 122, 14);
		contentPane.add(lbl_3rd);
		
		JLabel lbl_4th = new JLabel("");
		lbl_4th.setBounds(72, 86, 122, 14);
		contentPane.add(lbl_4th);
		
		JLabel lbl_5th = new JLabel("");
		lbl_5th.setBounds(72, 111, 122, 14);
		contentPane.add(lbl_5th);
		
		JLabel lbl_6th = new JLabel("");
		lbl_6th.setBounds(72, 135, 122, 14);
		contentPane.add(lbl_6th);
		
		JLabel lbl_7th = new JLabel("");
		lbl_7th.setBounds(72, 167, 122, 14);
		contentPane.add(lbl_7th);
		
		JLabel lbl_8th = new JLabel("");
		lbl_8th.setBounds(72, 192, 122, 14);
		contentPane.add(lbl_8th);
		
		//Racing algorithm
		Connection conn = GameEngine.getConnection();
		
		
		Statement stmt;
		int x = 1;
		List<Horse> h = new ArrayList<Horse>();

		try {
			stmt = conn.createStatement();
			String sql = "Select * from race";					
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				int id = rs.getInt(x);
				sql = "Select * from horses where linked_user_id='"+id+"'";
				rs.close();
				ResultSet rs2 = stmt.executeQuery(sql);
				if(rs2.next()) {
							
							h.add(new Horse(id,rs2.getString("horse_name"),
							rs2.getInt("horse_legsize"),rs2.getInt("horse_bodysize"),rs2.getInt("horse_stamina")
							,rs2.getInt("horse_strength"),rs2.getInt("horse_acceleration"),rs2.getInt("horse_confidence")
							,rs2.getInt("horse_luck")));
				}
				
				System.out.println("test");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int finish = 1000;
		for(int i = 0; x <= finish; x++) {
			
		}
		
	}

}

