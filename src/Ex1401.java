import javax.swing.*;
import java.awt.*;

public class Ex1401 extends JFrame {
	
	public Ex1401() {
		setTitle("Frame and Icon"); // Frame title
		setSize(600, 300); // Frame size
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		add(panel);
		
		setIconImage(new ImageIcon("img/icon.png").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex1401();

	}

}
