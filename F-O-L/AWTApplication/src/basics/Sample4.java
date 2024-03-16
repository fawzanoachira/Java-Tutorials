package basics;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Sample4 extends Frame{
	public Sample4() {
		Label l = new Label();
		l.setText("Password");
		TextField t = new TextField("Enter password");
		Font f = new Font("Times New Roman",Font.BOLD,20);
		
		Checkbox c = new Checkbox("English");
		c.setBounds(90,300,60,40);
		
		Button b = new Button("Register");
		b.setBounds(150,300,100,30);
		
		l.setBounds(0,100,250,20);
		t.setBounds(150,250,200,25);
		t.setEchoChar('#');
		t.setEditable(false);
		
		this.add(c);
		this.setFont(f);
		this.add(b);
		this.add(t);
		this.add(l);
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setLayout(null);
	}
	public static void main(String[] args) {
		Sample4 sample4 = new Sample4();
	}
}
