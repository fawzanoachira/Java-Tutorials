package basics;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActionListener1 extends Frame implements ActionListener{
	
	public ActionListener1() {
		
		Button b1 = new Button("red");
		Button b2 = new Button("blue");
		Button b3 = new Button("yellow");
		b1.setBounds(175,70,50,30);
		b2.setBounds(175,110,50,30);
		b3.setBounds(175,150,50,30);
		b1.setBackground(Color.red);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.yellow);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}});
		this.setSize(400, 400);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand()=="red") {
			setBackground(Color.red);
		}
		else if (e.getActionCommand()=="blue") {
			setBackground(Color.blue);
		}
		else {
			setBackground(Color.yellow);
		}
	}
	
	public static void main(String[] args) {
		ActionListener1 actionListener1 = new ActionListener1();
	}
}
