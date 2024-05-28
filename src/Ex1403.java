import javax.swing.*;
import java.awt.*;

public class Ex1403 extends JFrame {
	
	public Ex1403() {
		setTitle("Calculator");
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		add(numPanel);
		JTextField num1 = new JTextField(5);
		numPanel.add(num1);
		JTextField num2 = new JTextField(5);
		numPanel.add(num2);
		
		// Set Button Panel
		JPanel btnPanel1 = new JPanel();
		btnPanel1.setBounds(0, 80, 300, 40);
		add(btnPanel1);
		JButton plus = new JButton("+");
		btnPanel1.add(plus);
		JButton minus = new JButton("-");
		btnPanel1.add(minus);
		
		JPanel btnPanel2 = new JPanel();
		btnPanel2.setBounds(0, 120, 300, 40);
		add(btnPanel2);
		JButton mult = new JButton("*");
		btnPanel2.add(mult);
		JButton div = new JButton("/");
		btnPanel2.add(div);
		
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
		new Ex1403();
	}
}
