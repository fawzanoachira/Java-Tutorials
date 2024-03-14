package basics;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Sample2 extends Frame{
	
	public Sample2() {
		this.setVisible(true);
		this.setSize(400,400);
		this.setTitle("Registration Form");
		
//		Color color = new Color(255,45,255);
		Color color = new Color(0xceff00);
		this.setBackground(color);
	}
	
	//Graphics Class
	
	@Override
	public void paint(Graphics g) {
		g.drawRect(100, 100, 40, 60);
		g.fillRect(100, 100, 40, 60);
		g.drawString("hello", 100, 100);
	}

	public static void main(String[] args) {
		Sample2 sample2 = new Sample2();
	}
}
