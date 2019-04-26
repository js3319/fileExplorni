import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class GUI {
	private final int WIDTH = 40;
	private final int HEIGHT = 40;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 255, 240));
		frame.setBounds(100, 100, 503, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.getContentPane().setLayout(null);
		
		JButton btnSelectFile = new JButton("Select File");
		btnSelectFile.setFont(new Font("Javanese Text", Font.BOLD, 12));
		btnSelectFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Selecting File");
				
				
			}
		});
		btnSelectFile.setBounds(346, 111, 103, 38);
		frame.getContentPane().add(btnSelectFile);
		
		JButton btnStart = new JButton("Start");
		btnStart.setFont(new Font("Javanese Text", Font.BOLD, 14));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Start Organizing");
				
				
				
			}
		});
		btnStart.setBounds(196, 180, 89, 35);
		frame.getContentPane().add(btnStart);
		
		JButton btnNewFolder = new JButton("New Folder");
		btnNewFolder.setFont(new Font("Javanese Text", Font.BOLD, 12));
		btnNewFolder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Creating New Folder");
				
				
			}
		});
		btnNewFolder.setBounds(46, 114, 103, 35);
		frame.getContentPane().add(btnNewFolder);
		
		JLabel lblNewLabel = new JLabel("                    File Organizer");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 23));
		lblNewLabel.setBounds(46, 29, 389, 67);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("res/images/files.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(0, 0, 487, 299);
		frame.getContentPane().add(label);
		
		
		
		

	
}
}