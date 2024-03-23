package layoutManager;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayout1 extends Frame{
	
	public BorderLayout1() {
		this.setVisible(true);
		this.setSize(400,400);
		this.setTitle("Border Layout Demo");
		
		this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}});
		
		BorderLayout b = new BorderLayout(50,50);
		this.setLayout(b);
		
		Button b1 = new Button("North");
		Button b2 = new Button("South");
		Button b3 = new Button("East");
		Button b4 = new Button("West");
		Button b5 = new Button("Center");
		
		add(b1, b.NORTH);
		add(b2, b.SOUTH);
		add(b3, b.EAST);
		add(b4, b.WEST);
		add(b5, b.CENTER);
	}
	
	public static void main(String[] args) {
		BorderLayout1 borderLayout1 = new BorderLayout1();
	}
}
