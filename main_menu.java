package mathPractice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class main_menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_menu window = new main_menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

private int counter;
String name;
	public main_menu() {
		initialize();
	}
	public int getCounter() {
		return counter;
	}


	public void setCounter(int counter) {
		this.counter = counter;
	}

	
	private void initialize() {
		addition AFrame = new addition();
		Multiply MFrame = new Multiply();
		Subtraction SFrame = new Subtraction();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 650, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Image Images = new ImageIcon(this.getClass().getResource("/add1.png")).getImage();
		
		
		JLabel lblNewLabel = new JLabel("Select a concept to practice");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblNewLabel.setBounds(111, 42, 400, 35);
	Image Images1 = new ImageIcon(this.getClass().getResource("/multiply.png")).getImage();
				frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(127, 255, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				frame.dispose();
				MFrame.setVisible(true);
				
			}
		});
		btnNewButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_1.setIcon(new ImageIcon(Images1));
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 22));
		btnNewButton_1.setBounds(344, 138, 250, 150);
		frame.getContentPane().add(btnNewButton_1);
	
		JButton optionAdd = new JButton("+");
		optionAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					frame.dispose();
				AFrame.setVisible(true);
			
				}
			
		});
		optionAdd.setBackground(new Color(0, 255, 0));
		optionAdd.setForeground(SystemColor.textText);
		optionAdd.setHorizontalAlignment(SwingConstants.CENTER);
	//	optionAdd.setIcon(new ImageIcon(Images));
		optionAdd.setFont(new Font("Verdana", Font.PLAIN, 90));

		optionAdd.setBounds(34, 138, 250, 150);
		frame.getContentPane().add(optionAdd);
		

		JButton btnNewButton_1_1_1 = new JButton("-");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				
				frame.dispose();
				SFrame.setVisible(true);
			
			}
		});
		btnNewButton_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_1_1_1.setForeground(SystemColor.textText);
		btnNewButton_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 90));
		btnNewButton_1_1_1.setBackground(Color.GREEN);
		btnNewButton_1_1_1.setBounds(34, 314, 250, 150);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Under \r\n\r\n\r\n\r\nConstruction ;/");
		btnNewButton_1_1_2.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1_1_2.setForeground(new Color(255, 204, 0));
		btnNewButton_1_1_2.setFont(new Font("Verdana", Font.PLAIN, 19));
		btnNewButton_1_1_2.setBackground(Color.GREEN);
		btnNewButton_1_1_2.setBounds(344, 314, 250, 150);
		frame.getContentPane().add(btnNewButton_1_1_2);
		
		JLabel lblAuthor = new JLabel("Author : Anish K.");
		lblAuthor.setBounds(10, 11, 185, 14);
		frame.getContentPane().add(lblAuthor);
		
		 

	}
}
