package view;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.event.ChangeListener;

import controller.GameEngine;
import model.Horse;

import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HorseCreator extends JFrame {

	private JPanel contentPane;
	private JTextField horseName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HorseCreator frame = new HorseCreator();
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
	public HorseCreator() {
		setTitle("Create a Horse!");
		int maxAllocation = 50;
		int currentAllocation = maxAllocation;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 575, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		
		JLabel lbl1 = new JLabel("");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl1.setBounds(198, 11, 64, 26);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl2.setBounds(198, 62, 64, 26);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl3.setBounds(198, 112, 64, 26);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl4.setBounds(198, 173, 64, 26);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("");
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl5.setBounds(198, 221, 64, 26);
		contentPane.add(lbl5);
		
		JLabel lbl6 = new JLabel("");
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl6.setBounds(198, 272, 64, 26);
		contentPane.add(lbl6);
		
		JLabel lbl7 = new JLabel("");
		lbl7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl7.setBounds(198, 324, 64, 26);
		contentPane.add(lbl7);
		
		


		JSlider slider_legsize = new JSlider();
		slider_legsize.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				JSlider source = (JSlider)e.getSource();
				if(!source.getValueIsAdjusting()) {

					lbl1.setText(Integer.toString(source.getValue()));
				}
			}
		});
		slider_legsize.setPaintLabels(true);
		slider_legsize.setPaintTicks(true);
		slider_legsize.setSnapToTicks(true);
		slider_legsize.setMajorTickSpacing(1);
		slider_legsize.setValue(5);
		slider_legsize.setMaximum(10);
		slider_legsize.setBounds(349, 11, 200, 40);
		contentPane.add(slider_legsize);
		
		JSlider slider_bodysize = new JSlider();
		slider_bodysize.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider)e.getSource();
				if(!source.getValueIsAdjusting()) {

					lbl2.setText(Integer.toString(source.getValue()));
				}
			}
		});
		slider_bodysize.setSnapToTicks(true);
		slider_bodysize.setPaintTicks(true);
		slider_bodysize.setPaintLabels(true);
		slider_bodysize.setMajorTickSpacing(1);
		slider_bodysize.setValue(5);
		slider_bodysize.setMaximum(10);
		slider_bodysize.setBounds(349, 62, 200, 43);
		contentPane.add(slider_bodysize);
		
		JSlider slider_stamina = new JSlider();
		slider_stamina.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider)e.getSource();
				if(!source.getValueIsAdjusting()) {

					lbl3.setText(Integer.toString(source.getValue()));
				}
			}
		});
		slider_stamina.setSnapToTicks(true);
		slider_stamina.setPaintTicks(true);
		slider_stamina.setPaintLabels(true);
		slider_stamina.setMajorTickSpacing(1);
		slider_stamina.setValue(5);
		slider_stamina.setMaximum(10);
		slider_stamina.setBounds(349, 112, 200, 43);
		contentPane.add(slider_stamina);
		
		JSlider slider_strength = new JSlider();
		slider_strength.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider)e.getSource();
				if(!source.getValueIsAdjusting()) {

					lbl4.setText(Integer.toString(source.getValue()));
				}
			}
		});
		slider_strength.setSnapToTicks(true);
		slider_strength.setPaintTicks(true);
		slider_strength.setPaintLabels(true);
		slider_strength.setMajorTickSpacing(1);
		slider_strength.setValue(5);
		slider_strength.setMaximum(10);
		slider_strength.setBounds(349, 166, 200, 44);
		contentPane.add(slider_strength);
		
		JSlider slider_acceleration = new JSlider();
		slider_acceleration.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider)e.getSource();
				if(!source.getValueIsAdjusting()) {

					lbl5.setText(Integer.toString(source.getValue()));
				}
			}
		});
		slider_acceleration.setPaintLabels(true);
		slider_acceleration.setPaintTicks(true);
		slider_acceleration.setSnapToTicks(true);
		slider_acceleration.setMajorTickSpacing(1);
		slider_acceleration.setValue(5);
		slider_acceleration.setMaximum(10);
		slider_acceleration.setBounds(349, 221, 200, 40);
		contentPane.add(slider_acceleration);
		
		JSlider slider_confidence = new JSlider();
		slider_confidence.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider)e.getSource();
				if(!source.getValueIsAdjusting()) {

					lbl6.setText(Integer.toString(source.getValue()));
				}
			}
		});
		slider_confidence.setSnapToTicks(true);
		slider_confidence.setPaintTicks(true);
		slider_confidence.setPaintLabels(true);
		slider_confidence.setMajorTickSpacing(1);
		slider_confidence.setValue(5);
		slider_confidence.setMaximum(10);
		slider_confidence.setBounds(349, 272, 200, 40);
		contentPane.add(slider_confidence);
		
		JSlider slider_luck = new JSlider();
		slider_luck.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider)e.getSource();
				if(!source.getValueIsAdjusting()) {

					lbl7.setText(Integer.toString(source.getValue()));
				}
			}
		});
		slider_luck.setSnapToTicks(true);
		slider_luck.setPaintTicks(true);
		slider_luck.setPaintLabels(true);
		slider_luck.setMajorTickSpacing(1);
		slider_luck.setValue(5);
		slider_luck.setMaximum(10);
		slider_luck.setBounds(349, 323, 200, 38);
		contentPane.add(slider_luck);
		
		JLabel lblNewLabel = new JLabel("Leg Size");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(275, 11, 64, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblBodySize = new JLabel("Body Size");
		lblBodySize.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBodySize.setBounds(275, 62, 64, 26);
		contentPane.add(lblBodySize);
		
		JLabel lblStamina = new JLabel("Stamina");
		lblStamina.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStamina.setBounds(275, 116, 64, 26);
		contentPane.add(lblStamina);
		
		JLabel lblStrength = new JLabel("Strength");
		lblStrength.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStrength.setBounds(275, 166, 64, 26);
		contentPane.add(lblStrength);
		
		JLabel lblAcceleration = new JLabel("Acceleration");
		lblAcceleration.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAcceleration.setBounds(266, 221, 83, 26);
		contentPane.add(lblAcceleration);
		
		JLabel lblConfidence = new JLabel("Confidence");
		lblConfidence.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblConfidence.setBounds(275, 272, 64, 26);
		contentPane.add(lblConfidence);
		
		JLabel lblLuck = new JLabel("Luck");
		lblLuck.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLuck.setBounds(307, 317, 64, 26);
		contentPane.add(lblLuck);
		
		JLabel lblAllocationIs = new JLabel("Allocation is 1-10\r\n");
		lblAllocationIs.setBounds(21, 47, 182, 33);
		contentPane.add(lblAllocationIs);
		
		JLabel lblMaxPoints = new JLabel("Max Points = 50");
		lblMaxPoints.setBounds(21, 11, 182, 33);
		contentPane.add(lblMaxPoints);
		
		JLabel label = new JLabel("Allocation is 1-10\r\n");
		label.setBounds(21, 194, 182, 33);
		contentPane.add(label);
		
		horseName = new JTextField();
		horseName.setBounds(21, 244, 86, 20);
		contentPane.add(horseName);
		horseName.setColumns(10);
		
		
		JLabel lblCurrentAllocation = new JLabel("Current Allocation:");
		lblCurrentAllocation.setBounds(10, 123, 101, 15);
		contentPane.add(lblCurrentAllocation);

		JLabel current_allocation = new JLabel("35");
		current_allocation.setBounds(131, 123, 46, 15);
		contentPane.add(current_allocation);


		
		JButton btnReturnToStable = new JButton("Return to Stable");
		btnReturnToStable.setBounds(21, 344, 134, 23);
		contentPane.add(btnReturnToStable);
		
		JLabel lblHorseName = new JLabel("Horse Name:");
		lblHorseName.setBounds(21, 228, 86, 14);
		contentPane.add(lblHorseName);
		
		JLabel lblYourAllocationIs = new JLabel("Your Allocation is too high!");
		lblYourAllocationIs.setBounds(142, 309, 155, 14);
		contentPane.add(lblYourAllocationIs);
		lblYourAllocationIs.setVisible(false);
		
		JButton btnCreateHorse = new JButton("Create Horse");
		btnCreateHorse.setVisible(false);
		btnCreateHorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val_legsize = Integer.valueOf(lbl1.getText());
				int val_bodysize = Integer.valueOf(lbl2.getText()); 
				int stamina = Integer.valueOf(lbl3.getText());
				int strength = Integer.valueOf(lbl4.getText());
				int acceleration = Integer.valueOf(lbl5.getText());
				int confidence = Integer.valueOf(lbl6.getText());
				int luck = Integer.valueOf(lbl7.getText());
				int total = val_legsize + val_bodysize + stamina + strength + acceleration + confidence + luck;
				String horse_name = horseName.getText();
				Horse h = new Horse(horse_name,val_legsize, val_bodysize, stamina, strength, acceleration, confidence, luck, total);
				Connection conn = GameEngine.getConnection();
				PreparedStatement createHorse;
				try {
					createHorse = conn.prepareStatement("INSERT INTO horses (linked_user_id,horse_name,horse_legsize, horse_bodysize,horse_stamina,horse_strength,horse_acceleration,horse_confidence,horse_luck)"
							+ " VALUES ('"+GameEngine.userID_current+"','"+horse_name+"', '"+val_legsize+"', '"+val_bodysize+"','"+stamina+"','"+strength+"','"+acceleration+"','"+confidence+"','"+luck+"')");
					createHorse.executeUpdate();
					JOptionPane.showMessageDialog(null, "Horse Creation successful");
					GameEngine.userIDbalance -= 500;
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Horse Creation failed");
					e1.printStackTrace();
				}				
			}
		});
		btnCreateHorse.setBounds(154, 309, 89, 23);
		contentPane.add(btnCreateHorse);
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val_legsize = Integer.valueOf(lbl1.getText());
				int val_bodysize = Integer.valueOf(lbl2.getText()); 
				int stamina = Integer.valueOf(lbl3.getText());
				int strength = Integer.valueOf(lbl4.getText());
				int acceleration = Integer.valueOf(lbl5.getText());
				int confidence = Integer.valueOf(lbl6.getText());
				int luck = Integer.valueOf(lbl7.getText());
				int total = val_legsize + val_bodysize + stamina + strength + acceleration + confidence + luck;
				current_allocation.setText(Integer.toString(total));
				if(total > 50 || total == 0) {
					lblYourAllocationIs.setVisible(true);
					btnCreateHorse.setVisible(false);
				}
				else if(GameEngine.userIDbalance < 500)
					JOptionPane.showMessageDialog(null,"You do not have sufficient funds to create a horse");
				else {
					lblYourAllocationIs.setVisible(false);
					btnCreateHorse.setVisible(true);
				}
				}


		});
		btnCheck.setBounds(21, 306, 89, 23);
		contentPane.add(btnCheck);

	}
}
