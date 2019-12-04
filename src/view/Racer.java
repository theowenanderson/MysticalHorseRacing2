package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GameEngine;
import model.Horse;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		race(lbl_1st,lbl_2nd,lbl_3rd,lbl_4th,lbl_5th,lbl_6th,lbl_7th,lbl_8th);
		
		JLabel lblPreviousRace = new JLabel("Race Results");
		lblPreviousRace.setBounds(27, 236, 75, 14);
		contentPane.add(lblPreviousRace);
		
		JLabel lbl_5th_sim = new JLabel("");
		lbl_5th_sim.setBounds(302, 111, 122, 14);
		contentPane.add(lbl_5th_sim);
		
		JLabel lbl_7th_sim = new JLabel("");
		lbl_7th_sim.setBounds(302, 167, 122, 14);
		contentPane.add(lbl_7th_sim);

		/*sql = "update users set balance = 1300 where id='"+h.get(1).getId()+"'";
		ResultSet rs3;
		try {
			stmt = conn.createStatement();
			rs3 = stmt.executeQuery(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
	}
	public void race(JLabel j1,JLabel j2, JLabel j3, JLabel j4, JLabel j5, JLabel j6, JLabel j7, JLabel j8 ) {
		Connection conn = GameEngine.getConnection();
		
		
		if(GameEngine.raceinprogress == 1) {
			
			// Horse Participants are based inside an ArrayList
			
		Statement stmt;
		int x = 0;
		List<Horse> h = new ArrayList<Horse>();
		List<Integer> id_list = new ArrayList<Integer>();
		String sql;
		try {
			stmt = conn.createStatement();
			sql = "Select * from race";					
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				id_list.add(rs.getInt("user_id_entered"));
			}
			rs.close();
			for(int i: id_list) {
				// Go through all horses entered in database and retrieve data
				sql = "Select * from horses where linked_user_id='"+i+"'";	
				ResultSet rs2 = stmt.executeQuery(sql);
				if(rs2.next()) {
							h.add(new Horse(id_list.get(x),rs2.getString("horse_name"),
							rs2.getInt("horse_legsize"),rs2.getInt("horse_bodysize"),rs2.getInt("horse_stamina")
							,rs2.getInt("horse_strength"),rs2.getInt("horse_acceleration"),rs2.getInt("horse_confidence")
							,rs2.getInt("horse_luck")));
							x++;
				}
				rs2.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Add Random preset horse CPU's via Horse(int) constructer
		int num_horses = id_list.size();
		while(num_horses != 8) {
			h.add(new Horse(num_horses));
			num_horses++;
		}
		
		// Go through race and find results
		int time = 0;
		while(time < 100) {
			
			// Main point finding algorithm, different stats are weighted differently
			for(int y = 0; y<8; y++) {
				int val = (int) ((h.get(y).getLegSize() * time * 0.8) + (h.get(y).getBodySize() * time * 0.9) + (h.get(y).getStamina()*time)+
						(h.get(y).getStrength() * time * 1.1) + (h.get(y).getAcceleration() * time * 0.7) + (h.get(y).getConfidence() * time * 1.1)
						+ (h.get(y).getLuck())*time * 0.9);
				h.get(y).addPoints(val);
			}
			
			// Swaps ArrayList with positons based on points
			for(int y = 0, z = 1; z < 8; y++,z++) {
				if(h.get(y).getPoints() <= h.get(z).getPoints()) {
					Collections.swap(h,y,z);
				}
			}
			
			
			
			// update listing
			j1.setText(h.get(0).getName());
			j2.setText(h.get(1).getName());
			j3.setText(h.get(2).getName());
			j4.setText(h.get(3).getName());
			j5.setText(h.get(4).getName());
			j6.setText(h.get(5).getName());
			j7.setText(h.get(6).getName());
			j8.setText(h.get(7).getName());
			time++;

		}
		
		GameEngine.raceinprogress = 0;
		
		
		PreparedStatement removeRace;
		try {
			removeRace = conn.prepareStatement("Delete * from race");
			removeRace.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		else {
			JOptionPane.showMessageDialog(null,"Race has not begun yet");
			dispose();
		}
	}
}

