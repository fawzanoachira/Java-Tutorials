package basics;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;

public class Sample5 extends Frame{
	public Sample5() {
		
//		Choice c = new Choice();
//		c.setBounds(30,30,60,30);
//		c.add("1");
//		c.add("2");
//		c.add("3");
//		c.add("4");
//		
//		this.add(c);
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox c1 = new Checkbox("Male",false,cbg);
		c1.setBounds(30,30,150,30);
		Checkbox c2 = new Checkbox("Female",false,cbg);
		c2.setBounds(30,30,150,30);
		
		this.add(c1);
		this.add(c2);
		this.setSize(500,500);
		this.setVisible(true);
		this.setLayout(null);
	}
	
	public static void main(String[] args) {
		Sample5 s5 = new Sample5();
	}
}
