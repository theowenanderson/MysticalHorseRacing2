package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

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
		int maxAllocation = 50;
		int currentAllocation = maxAllocation;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JSlider slider_legsize = new JSlider();
		slider_legsize.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
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
		slider_bodysize.setSnapToTicks(true);
		slider_bodysize.setPaintTicks(true);
		slider_bodysize.setPaintLabels(true);
		slider_bodysize.setMajorTickSpacing(1);
		slider_bodysize.setValue(5);
		slider_bodysize.setMaximum(10);
		slider_bodysize.setBounds(349, 62, 200, 43);
		contentPane.add(slider_bodysize);
		
		JSlider slider_stamina = new JSlider();
		slider_stamina.setSnapToTicks(true);
		slider_stamina.setPaintTicks(true);
		slider_stamina.setPaintLabels(true);
		slider_stamina.setMajorTickSpacing(1);
		slider_stamina.setValue(5);
		slider_stamina.setMaximum(10);
		slider_stamina.setBounds(349, 112, 200, 43);
		contentPane.add(slider_stamina);
		
		JSlider slider_strength = new JSlider();
		slider_strength.setSnapToTicks(true);
		slider_strength.setPaintTicks(true);
		slider_strength.setPaintLabels(true);
		slider_strength.setMajorTickSpacing(1);
		slider_strength.setValue(5);
		slider_strength.setMaximum(10);
		slider_strength.setBounds(349, 166, 200, 44);
		contentPane.add(slider_strength);
		
		JSlider slider_acceleration = new JSlider();
		slider_acceleration.setPaintLabels(true);
		slider_acceleration.setPaintTicks(true);
		slider_acceleration.setSnapToTicks(true);
		slider_acceleration.setMajorTickSpacing(1);
		slider_acceleration.setValue(5);
		slider_acceleration.setMaximum(10);
		slider_acceleration.setBounds(349, 221, 200, 40);
		contentPane.add(slider_acceleration);
		
		JSlider slider_confidence = new JSlider();
		slider_confidence.setSnapToTicks(true);
		slider_confidence.setPaintTicks(true);
		slider_confidence.setPaintLabels(true);
		slider_confidence.setMajorTickSpacing(1);
		slider_confidence.setValue(5);
		slider_confidence.setMaximum(10);
		slider_confidence.setBounds(349, 272, 200, 40);
		contentPane.add(slider_confidence);
		
		JSlider slider_luck = new JSlider();
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
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(21, 306, 89, 23);
		contentPane.add(btnCreate);
		

	}
}
