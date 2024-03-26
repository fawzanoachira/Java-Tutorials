package basics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo extends JFrame{
	
	public Demo() {
		this.setVisible(true);
		this.setSize(400,400);
		this.setTitle("SwingExample");
		this.setLayout(null);
		
		JButton b = new JButton("Click");
		b.setBounds(20,20,80,30);
		this.add(b);
		
		JLabel j1 = new JLabel("First Name: ");
		j1.setBounds(20,40,100,70);
		this.add(j1);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(40,40,100,30);
		this.add(tf1);
		
		JLabel j2 = new JLabel("Last Name: ");
		j2.setBounds(20,60,100,70);
		this.add(j2);
	}
	public static void main(String[] args) {
		new Demo();
	}
}
