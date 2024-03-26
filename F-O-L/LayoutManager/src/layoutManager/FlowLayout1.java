package layoutManager;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayout1 extends Frame{
	
	public FlowLayout1() {
		this.setVisible(true);
		this.setSize(400,400);
		this.setTitle("Flow Layout Demo");
		
		this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}});
		
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);
		
//		this.setLayout(new FlowLayout());
//		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
	}
	
	public static void main(String[] args) {
		FlowLayout1 flowLayout1 = new FlowLayout1();
	}
}
