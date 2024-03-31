package sampleProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Demo1 extends JFrame{
	public Demo1(String text) {
		this.setVisible(true);
		this.setSize(400,400);
		this.setLayout(null);
		
//		Label label = new Label(text);
//		label.setBounds(100, 100, 60, 30);
		
		JTextField label = new JTextField(text);
		label.setBounds(100, 100, 60, 30);
		
		this.add(label);
	}
}

public class Demo extends JFrame{
	JTextArea jTextArea;
	public Demo(){
		this.setVisible(true);
		this.setLayout(null);
		
		jTextArea = new JTextArea();
		jTextArea.setBounds(100, 100, 80, 30);
		
		JButton button = new JButton("Submit");
		button.setBounds(100,130,80,30);
		
		this.add(button);
		this.add(jTextArea);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String text = jTextArea.getText();
				
				Demo1 demo1 = new Demo1(text);
			}
		});;
		
		this.setSize(500,500);
	}
	
	public static void main(String[] args) {
		new Demo();
	}
}
