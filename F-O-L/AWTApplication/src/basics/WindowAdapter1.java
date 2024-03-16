package basics;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter1 extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("window closing");
		System.exit(0);
	}	
	
}
