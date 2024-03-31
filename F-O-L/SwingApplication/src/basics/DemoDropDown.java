package basics;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DemoDropDown extends JFrame{
	
	public DemoDropDown() {
		this.setVisible(true);
//		this.setSize(500,500);
		this.setTitle("SwingExample");
		this.setLayout(null);
		
		String country[] = {"India","Pakistan","Turkey","Palestine","Saudi"};
		JComboBox<String> jc = new JComboBox<String>(country);
		jc.setBounds(100,50,80,30);
		this.add(jc);
		this.setSize(500,500);
		
	}
	public static void main(String[] args) {
		new DemoDropDown();
	}
}