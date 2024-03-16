package basics;

import java.awt.*;

public class AWTList1 extends Frame{
	public AWTList1() {
		
		List l = new List(3);
		
		l.setBounds(100, 200, 80, 25);
		
		l.add("item 1");
		l.add("item 2");
		l.add("item 3");
		
		this.add(l);
		
		this.setSize(400,400);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		AWTList1 awtList = new AWTList1();
	}
}
