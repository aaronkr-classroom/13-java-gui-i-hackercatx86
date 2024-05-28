import javax.swing.*;
import java.awt.*;

public class Ex1404 extends JFrame {
	
	public Ex1404() {
		setTitle("Calculator");
		setSize(300, 250);
		
		// Set Title Panel
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 300, 40);
		add(titlePanel);
		JLabel title = new JLabel("Calculator", JLabel.CENTER);
		title.setFont(new Font("함초롬돋음", Font.BOLD, 20));
		titlePanel.add(title);
		
		// Set Number Panel
		JPanel numPanel = new JPanel();
		numPanel.setBounds(0, 40, 300, 40);
		numPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // +
		add(numPanel);
		JTextField num1 = new JTextField(5);
		numPanel.add(num1);
		JTextField num2 = new JTextField(5);
		numPanel.add(num2);
		
		// Set Button Panel
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(100, 80, 100, 80);
		btnPanel.setLayout(new GridLayout(2, 2, 10, 5)); // +
		add(btnPanel);
		JButton plus = new JButton("+");
		btnPanel.add(plus);
		JButton minus = new JButton("-");
		btnPanel.add(minus);
		JButton mult = new JButton("*");
		btnPanel.add(mult);
		JButton div = new JButton("/");
		btnPanel.add(div);
		
		// Set Result Panel
		JPanel resPanel = new JPanel();
		resPanel.setBounds(0, 160, 300, 40);
		add(resPanel);
		JLabel lbl1 = new JLabel("Result: ");
		resPanel.add(lbl1);
		JLabel lbl2 = new JLabel("");
		resPanel.add(lbl2);
		
		// Set frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex1404();
	}
}
