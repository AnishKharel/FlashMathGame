package mathPractice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Division extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Division frame = new Division();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private int counter;

	public int getCounter() {
		return counter;
	}


	public void setCounter(int counter) {
		this.counter = counter;
	}

	private JTextField textNum1;
	private JTextField textNum2;
	private JTextField answer ;
	private JTextField scoreBoard;
	private JLabel levelDisplayer;
	int a;
	int num1,num2;
	public void starter(int a) {
		Random number = new Random();
		if (a <=10) {
			levelDisplayer.setText("Level 1:");
			num1 = number.nextInt(5);
			num2 = number.nextInt(5);

		}
		else if (a <= 15) {
			a=0;
			JOptionPane.showMessageDialog(null, "Congrats you have passed level 1!");
			num1 = number.nextInt(10);
			num2 = number.nextInt(10);}
		else {

			a=0;
			levelDisplayer.setText("Level 2:");
			num1 = number.nextInt(15);
			num2 = number.nextInt(15);
		}
		textNum1.setText(Integer.toString(num1));
		textNum2.setText(Integer.toString(num2));	
		scoreBoard.setText(Integer.toString(getCounter()));
		answer.setText("");
	}  
	public Division() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		levelDisplayer = new JLabel("");
		levelDisplayer.setFont(new Font("Tahoma", Font.PLAIN, 25));
		levelDisplayer.setBounds(288, 370, 131, 29);
		contentPane.add(levelDisplayer);	

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

		JLabel lblNewLabel = new JLabel("-");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblNewLabel.setBounds(325, 93, 89, 60);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Answer:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(204, 215, 161, 64);
		contentPane.add(lblNewLabel_1);

		answer = new JTextField();
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		answer.setBounds(325, 229, 150, 48);
		contentPane.add(answer);
		answer.setColumns(10);

		JProgressBar levelProgress = new JProgressBar();
		levelProgress.setString("Progress");
		levelProgress.setValue(0);
		levelProgress.setMaximum(10);
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

		JLabel display = new JLabel("");
		display.setHorizontalAlignment(SwingConstants.CENTER);
		display.setFont(new Font("Serif", Font.BOLD, 20));
		display.setBounds(171, 174, 378, 39);
		contentPane.add(display);

		JButton btnCheck = new JButton("Check");
		btnCheck.setFont(new Font("Tahoma", Font.PLAIN, 20));
		starter(1);
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (Integer.parseInt(answer.getText()) == Math.abs(num1-num2)) {
					setCounter(getCounter()+1);
					a++;
					levelProgress.setValue(a);
					display.setText("Awesome Job!");
					starter(getCounter());
				}
				else {
					a=0;
					display.setText("Booo! Incorrect");
					levelProgress.setValue(a);
					setCounter(0);
					starter(getCounter());
				}
			}
		});
		btnCheck.setBounds(257, 300, 150, 50);
		contentPane.add(btnCheck);

		JLabel lblMultiply = new JLabel("Subtraction");
		lblMultiply.setForeground(new Color(0, 0, 139));
		lblMultiply.setHorizontalAlignment(SwingConstants.CENTER);
		lblMultiply.setFont(new Font("Serif", Font.BOLD, 52));
		lblMultiply.setBounds(156, 11, 399, 64);
		contentPane.add(lblMultiply);

		
	}


}
