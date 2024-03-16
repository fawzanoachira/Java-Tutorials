package basics;

import java.awt.Frame;

public class Sample {

	public Sample() {
		Frame f = new Frame();
		f.setVisible(true);
		f.setSize(400,400);
		f.setTitle("login");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println(s);
	}	
}
