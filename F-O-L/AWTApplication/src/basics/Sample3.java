package basics;

import java.awt.Frame;
import java.awt.*;

public class Sample3{

	public Sample3() {
		
		//label class
		// initializing the labels  
		Frame f = new Frame("Login");
	    Label l1, l2; 
	    l1 = new Label ("First Label."); 
	    l2 = new Label ("Second Label.");   
	  
	    // set the location of label  
	    l1.setBounds(50, 100, 100, 30);    
	    l2.setBounds(50, 150, 100, 30);  
	  
	    // adding labels to the frame    
	    f.add(l1);  
	    f.add(l2);   

		f.setSize(400,400);
	    f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Sample3 sample3 = new Sample3();
	}
}
