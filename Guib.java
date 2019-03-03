package guicheck;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Font;

public class Guib {

	private JFrame frame;
	private JTextField textFieldnum1;
	private JTextField textFieldnum2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guib window = new Guib();
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
	public Guib() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 481, 265);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Button button = new Button("say hello to world!");
		button.setBounds(151, 10, 150, 27);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "hello Dunia!"); 
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(button);
		
		textFieldnum1 = new JTextField();
		textFieldnum1.setBounds(102, 64, 107, 27);
		frame.getContentPane().add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setBounds(251, 64, 107, 27);
		frame.getContentPane().add(textFieldnum2);
		textFieldnum2.setColumns(10);
		
		JButton btnAddition = new JButton("addition");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					ans = num2+num1;
					textField.setText(Integer.toString(ans));
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null,"try with another valid no.\n you might write some wrong input.. ");
				}
			}
		});
		btnAddition.setBounds(10, 147, 89, 23);
		frame.getContentPane().add(btnAddition);
		
		JButton btnSubtract = new JButton("subtract");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					ans = num1-num2;
					textField.setText(Integer.toString(ans));
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null,"try with another valid no.\n you might write some wrong input.. ");
				}
			}
		});
		btnSubtract.setBounds(120, 147, 89, 23);
		frame.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("multiply");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					ans = num2*num1;
					textField.setText(Integer.toString(ans));
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null,"try with another valid no.\n you might write some wrong input.. ");
				}
			}
		});
		btnMultiply.setBounds(236, 147, 89, 23);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("divide");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(textFieldnum1.getText());
					num2 = Integer.parseInt(textFieldnum2.getText());
					ans = num1/num2;
					textField.setText(Integer.toString(ans));
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null,"try with another valid no.\n you might write some wrong input.. ");
				}
			}
		});
		btnDivide.setBounds(353, 147, 89, 23);
		frame.getContentPane().add(btnDivide);
		
		textField = new JTextField();
		textField.setBounds(151, 181, 150, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTheAnsIs = new JLabel("the Ans. is");
		lblTheAnsIs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTheAnsIs.setBounds(52, 182, 89, 27);
		frame.getContentPane().add(lblTheAnsIs);
	}
}
