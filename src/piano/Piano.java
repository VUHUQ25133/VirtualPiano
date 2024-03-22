package piano;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Piano extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piano frame = new Piano();
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
	public Piano() {
		super("Virtual Piano");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 464);
		contentPane = new JPanel();
		setResizable(false);
//		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Virtual Piano");
		
		lblNewLabel.setBounds(10, 11, 723, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		
		JButton btnD = new JButton("D");	
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					
				
					try
					{
						String path=".\\PiaNotes\\D1.wav";
					AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
					Clip player=AudioSystem.getClip();		
					player.open(audio);
					player.start();
					}
					catch(Exception ee)
					{
						
					}
				
				
			}
		});
        btnD.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnD.setBackground(Color.WHITE);
		btnD.setBounds(74, 214, 57, 208);
		contentPane.add(btnD);
		btnD.setFocusPainted(false);
		
		
		JButton btn_C = new JButton("C");
		btn_C.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			
				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			
			}
		});
		btn_C.setBackground(Color.WHITE);
		btn_C.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_C.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_C.setBounds(10, 214, 57, 208);
		contentPane.add(btn_C);
		btn_C.setFocusPainted(false);	
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btnE.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnE.setBackground(Color.WHITE);
		btnE.setBounds(141, 214, 57, 208);
		contentPane.add(btnE);
		btnE.setFocusPainted(false);
		
		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btnF.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnF.setBackground(Color.WHITE);
		btnF.setBounds(207, 214, 57, 208);
		contentPane.add(btnF);
		btnF.setFocusPainted(false);
		
		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D5.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btnG.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnG.setBackground(Color.WHITE);
		btnG.setBounds(274, 214, 57, 208);
		contentPane.add(btnG);
		btnG.setFocusPainted(false);
		
		JButton btnA = new JButton("A\r\n");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btnA.setVerticalAlignment(SwingConstants.BOTTOM);
		btnA.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnA.setBackground(Color.WHITE);
		btnA.setBounds(341, 214, 57, 208);
		contentPane.add(btnA);
		btnA.setFocusPainted(false);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btnB.setVerticalAlignment(SwingConstants.BOTTOM);
		btnB.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnB.setBackground(Color.WHITE);
		btnB.setBounds(408, 214, 57, 208);
		contentPane.add(btnB);
		btnB.setFocusPainted(false);
		
		JButton btn_C1 = new JButton("C1");
		btn_C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btn_C1.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_C1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_C1.setBackground(Color.WHITE);
		btn_C1.setBounds(475, 214, 57, 208);
		contentPane.add(btn_C1);
		btn_C1.setFocusPainted(false);
		
		JButton btnD1 = new JButton("D1");
		btnD1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btnD1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnD1.setBackground(Color.WHITE);
		btnD1.setBounds(542, 214, 57, 208);
		contentPane.add(btnD1);
		btnD1.setFocusPainted(false);
		
		
		JButton btnE1 = new JButton("E1");
		btnE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btnE1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnE1.setBackground(Color.WHITE);
		btnE1.setBounds(609, 214, 57, 208);
		contentPane.add(btnE1);
		btnE1.setFocusPainted(false);
		
		JButton btnF1 = new JButton("F1");
		btnF1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btnF1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnF1.setBackground(Color.WHITE);
		btnF1.setBounds(676, 214, 57, 208);
		contentPane.add(btnF1);
		btnF1.setFocusPainted(false);
		
		JButton btnDs = new JButton("Ds");
		btnDs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btnDs.setVerticalAlignment(SwingConstants.BOTTOM);
		btnDs.setForeground(Color.WHITE);
		btnDs.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDs.setBackground(Color.BLACK);
		btnDs.setBounds(106, 54, 63, 149);
		contentPane.add(btnDs);
		btnDs.setFocusPainted(false);
			
		
		
		JButton btnFs = new JButton("Fs");
		btnFs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btnFs.setVerticalAlignment(SwingConstants.BOTTOM);
		btnFs.setForeground(Color.WHITE);
		btnFs.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFs.setBackground(Color.BLACK);
		btnFs.setBounds(232, 54, 63, 149);
		contentPane.add(btnFs);
		btnFs.setFocusPainted(false);
		
		JButton btnGs = new JButton("Gs");
		btnGs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btnGs.setVerticalAlignment(SwingConstants.BOTTOM);
		btnGs.setForeground(Color.WHITE);
		btnGs.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGs.setBackground(Color.BLACK);
		btnGs.setBounds(305, 54, 63, 149);
		contentPane.add(btnGs);
		btnGs.setFocusPainted(false);
		
		JButton btnBb = new JButton("Bb");
		btnBb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btnBb.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBb.setForeground(Color.WHITE);
		btnBb.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBb.setBackground(Color.BLACK);
		btnBb.setBounds(378, 54, 63, 149);
		contentPane.add(btnBb);
		btnBb.setFocusPainted(false);
		
		JButton btn_Cs1 = new JButton("Cs1");
		btn_Cs1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btn_Cs1.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_Cs1.setForeground(Color.WHITE);
		btn_Cs1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_Cs1.setBackground(Color.BLACK);
		btn_Cs1.setBounds(507, 54, 63, 149);
		contentPane.add(btn_Cs1);
		btn_Cs1.setFocusPainted(false);
		
		JButton btnDs1 = new JButton("Ds1");
		btnDs1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btnDs1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnDs1.setForeground(Color.WHITE);
		btnDs1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDs1.setBackground(Color.BLACK);
		btnDs1.setBounds(580, 54, 63, 149);
		contentPane.add(btnDs1);
		btnDs1.setFocusPainted(false);
		
		JButton btn_Cs = new JButton("Cs");
		btn_Cs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					String path=".\\PiaNotes\\D1.wav";
				AudioInputStream audio=AudioSystem.getAudioInputStream(new File(path));
				Clip player=AudioSystem.getClip();		
				player.open(audio);
				player.start();
				}
				catch(Exception ee)
				{
					
				}
			}
		});
		btn_Cs.setForeground(Color.WHITE);
		btn_Cs.setBackground(Color.BLACK);
		btn_Cs.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_Cs.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_Cs.setBounds(33, 54, 63, 149);
		contentPane.add(btn_Cs);
		btn_Cs.setFocusPainted(false);
	}
}