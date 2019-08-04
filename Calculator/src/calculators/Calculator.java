package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 323, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(23, 23, 261, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JButton btndel = new JButton("Del");
		btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length()>0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btndel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndel.setBounds(206, 88, 78, 50);
		frame.getContentPane().add(btndel);
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(85, 151, 50, 50);
		frame.getContentPane().add(btn7);
		
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(23, 151, 50, 50);
		frame.getContentPane().add(btn7);

		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(85, 151, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnclear.setBounds(23, 86, 50, 50);
		frame.getContentPane().add(btnclear);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(147, 151, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnnp = new JButton("±");
		btnnp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
				
			}
		});
		btnnp.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnnp.setBounds(147, 88, 50, 50);
		frame.getContentPane().add(btnnp);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(20, 375, 50, 50);
		frame.getContentPane().add(btn0);
		//-------------------row 2-------------------------//
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
			
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(23, 302, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(82, 302, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(144, 302, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(23, 224, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(82, 224, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(144, 224, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnadd .setFont(new Font("Tahoma", Font.BOLD, 18));
		btnadd .setBounds(206, 151, 78, 50);
		frame.getContentPane().add(btnadd );
		
		JButton btnsubtr = new JButton("-");
		btnsubtr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnsubtr.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsubtr.setBounds(206, 224, 78, 50);
		frame.getContentPane().add(btnsubtr);
		
		JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnmult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmult.setBounds(205, 302, 79, 50);
		frame.getContentPane().add(btnmult);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndiv.setBounds(206, 375, 78, 50);
		frame.getContentPane().add(btndiv);
		
		JButton btnequals = new JButton("=");
		btnequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNum = Double.parseDouble(textField.getText());
				
				if(operations=="+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
					
				}
				
				else if(operations=="-") {
					
					result = firstNum - secondNum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
					
				}
				
				else if(operations=="*") {
					
					result = firstNum * secondNum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
					
				}
				
				else if(operations=="/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
					
				}
				
				else if(operations=="%") {
					result = firstNum % secondNum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
					
				}
				
			}
		});
		btnequals.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnequals.setBounds(82, 375, 112, 50);
		frame.getContentPane().add(btnequals);
		
		JButton btmrem = new JButton("%");
		btmrem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btmrem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btmrem.setBounds(85, 86, 50, 50);
		frame.getContentPane().add(btmrem);
	}
}
