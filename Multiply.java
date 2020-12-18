package mathPractice;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JProgressBar;
import java.awt.SystemColor;

public class Multiply extends JFrame {

	private JPanel contentPane;
	private int counter;
	int a = 0;
	Methods m = new Methods();
	public int getCounter() {
		return counter;
	}


	public void setCounter(int counter) {
		this.counter = counter;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Multiply frame = new Multiply();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JTextField textNum1;
	private JTextField textNum2;
	private JTextField answer ;
	private JTextField scoreBoard;
	private JLabel levelDisplayer;
	private JProgressBar levelProgress;

	int a1;
	int num1,num2;
	String name;
	private JTextField showAnswer;
	private JLabel lblNewLabel_3;
	private JTextField highScoreDisplay;
	private JLabel lblAuthor;
	public void starter(int a) {
		Random number = new Random();
		if (a < 5) {
			levelDisplayer.setText("Level 1:");
			do {
				num1 = number.nextInt(3);
				num2 = number.nextInt(8);
			}while(num1 == 0 || num2 == 0 );
		}
		else if( a < 10) {
			if (a == 5) {
				JOptionPane.showMessageDialog(null, "Congrats you have completed level 1!");
				a1 = 0;
				levelProgress.setValue(a1);

			}
			levelDisplayer.setText("Level 2:");
			do {
				num1 = number.nextInt(4);
				num2 = number.nextInt(10);
			}while(num1 == 0 || num2 == 0 );
		}
		else if ( a < 15) 
			if (a == 10) {
				JOptionPane.showMessageDialog(null, "Congrats you have completed level 2!");	a1 = 0;
				levelProgress.setValue(a1);
			}else {
			levelDisplayer.setText("Level 3:");	a1 = 0;
			do {
				num1 = number.nextInt(6);
				num2 = number.nextInt(10);
			}while(num1 == 0 || num2 == 0 );
			}
		else {
			if (a == 15) {
				JOptionPane.showMessageDialog(null, "Congrats you have completed the final level \n now you can keep practicing to get a higher Score!");	a1 = 0;
				levelProgress.setValue(a1);
			}else {
				
			levelDisplayer.setText("Unlimited:");	a1 = 0;
			do {
				levelProgress.setMaximum(150);
				num1 = number.nextInt(6);
				num2 = number.nextInt(10);
			}while(num1 == 0 || num2 == 0 );
			}
		}
			textNum1.setText(Integer.toString(num1));
			textNum2.setText(Integer.toString(num2));	
			scoreBoard.setText(Integer.toString(getCounter()));
			answer.setText("");
			
	}  

	public Multiply() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 449);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel display = new JLabel("");
		display.setHorizontalAlignment(SwingConstants.CENTER);
		display.setFont(new Font("Serif", Font.BOLD, 24));
		display.setBounds(156, 174, 378, 39);
		contentPane.add(display);


		textNum1 = new JTextField();
		textNum1.setHorizontalAlignment(SwingConstants.CENTER);
		textNum1.setFont(new Font("Tahoma", Font.PLAIN, 55));
		textNum1.setBounds(55, 88, 200, 75);
		contentPane.add(textNum1);
		textNum1.setColumns(10);

		textNum2 = new JTextField();
		textNum2.setHorizontalAlignment(SwingConstants.CENTER);
		textNum2.setFont(new Font("Tahoma", Font.PLAIN, 55));
		textNum2.setColumns(10);
		textNum2.setBounds(438, 88, 200, 75);
		contentPane.add(textNum2);

		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(334, 123, 54, 29);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Answer:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(175, 213, 161, 64);
		contentPane.add(lblNewLabel_1);

		answer = new JTextField();
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		answer.setBounds(283, 224, 150, 48);
		contentPane.add(answer);
		answer.setColumns(10);

		levelProgress = new JProgressBar();
		levelProgress.setString("Progress");
		levelProgress.setValue(0);
		levelProgress.setMaximum(5);
		levelProgress.setBounds(398, 370, 249, 29);
		contentPane.add(levelProgress);

		scoreBoard = new JTextField();
		scoreBoard.setHorizontalAlignment(SwingConstants.CENTER);
		scoreBoard.setFont(new Font("Tahoma", Font.PLAIN, 31));
		scoreBoard.setBounds(26, 339, 106, 60);
		contentPane.add(scoreBoard);
		scoreBoard.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Correct Answers");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(26, 316, 106, 14);
		contentPane.add(lblNewLabel_2);

		levelDisplayer = new JLabel("");
		levelDisplayer.setFont(new Font("Tahoma", Font.PLAIN, 25));
		levelDisplayer.setBounds(288, 370, 131, 29);
		contentPane.add(levelDisplayer);	



		JLabel lblMultiply = new JLabel("Multiplication");
		lblMultiply.setForeground(new Color(0, 0, 139));
		lblMultiply.setHorizontalAlignment(SwingConstants.CENTER);
		lblMultiply.setFont(new Font("Serif", Font.BOLD, 52));
		lblMultiply.setBounds(156, 11, 399, 64);
		contentPane.add(lblMultiply);

		JButton btnNewButton = new JButton("View Answer");
		JButton btnCheck = new JButton("Check");
		btnCheck.setFont(new Font("Tahoma", Font.PLAIN, 20));
		starter(1);
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if (Integer.parseInt(answer.getText()) == (num1*num2)) {
						contentPane.setBackground(new Color(50, 205, 50));
						a1++;
						setCounter(getCounter()+1);
						levelProgress.setValue(a1);
						showAnswer.hide();
						display.setText(m.correctResponse());
						starter(getCounter());
						highScoreDisplay.setText(Integer.toString(m.highestScore(getCounter())));
						
					}
					else {
						
						contentPane.setBackground(new Color(255, 99, 71));
						a1=0;
						display.setText(m.incorrectResponse());
						levelProgress.setValue(a1);
						setCounter(0);
						answer.setText("");
						btnNewButton.show();
						//starter(getCounter());	
						
						
						
						btnNewButton.setBounds(488, 220, 150, 50);
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e1) {
								btnNewButton.hide();
								showAnswer.show();
								showAnswer.setBounds(488, 220, 150, 50);
								String answer = num1 + " x "+num2+ " = "+num1*num2;
								showAnswer.setText(answer);
								
							}
						});
						
						contentPane.add(btnNewButton);


					}
				}catch(Exception ab) {
					JOptionPane.showMessageDialog(null, ab);

				}

			}
		});
		btnCheck.setBounds(269, 288, 150, 50);
		contentPane.add(btnCheck);
		
		showAnswer = new JTextField();
		showAnswer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		showAnswer.setBounds(488, 259, 0, 0);
		contentPane.add(showAnswer);
		showAnswer.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Highest Score");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_3.setBounds(468, 298, 157, 28);
		contentPane.add(lblNewLabel_3);
		
		highScoreDisplay = new JTextField();
		highScoreDisplay.setFont(new Font("Tahoma", Font.PLAIN, 25));
		highScoreDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		highScoreDisplay.setText("0");
		highScoreDisplay.setBounds(512, 339, 76, 29);
		contentPane.add(highScoreDisplay);
		highScoreDisplay.setColumns(10);
		
		lblAuthor = new JLabel("Author : Anish K.");
		lblAuthor.setBounds(10, 11, 185, 14);
		contentPane.add(lblAuthor);
		

	}
}
