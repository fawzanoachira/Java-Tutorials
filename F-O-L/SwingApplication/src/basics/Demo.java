package basics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo extends JFrame{
	
	public Demo() {
		this.setVisible(true);
		this.setTitle("SwingExample");
		this.setLayout(null);
		
		JButton b = new JButton("Click");
		b.setBounds(20,20,80,30);
		this.add(b);
		
		JLabel j1 = new JLabel("First Name: ");
		j1.setBounds(20,50,100,20);
		this.add(j1);
		
		JLabel j2 = new JLabel("Last Name: ");
		j2.setBounds(20,80,100,20);
		this.add(j2);
		
		JLabel j3 = new JLabel("Address: ");
		j3.setBounds(20,110,100,20);
		this.add(j3);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(100,50,100,20);
		this.add(tf1);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(100,80,100,20);
		this.add(tf2);
		
		JTextArea jt = new JTextArea();
		jt.setBounds(100,110,200,100);
		this.add(jt);
		
		this.setSize(500,500);
		
	}
	public static void main(String[] args) {
		new Demo();
	}
}
