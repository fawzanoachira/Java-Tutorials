package layoutManager;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;

public class BoxLayout1 extends Frame{
	public BoxLayout1() {
		this.setVisible(true);
		this.setSize(400,400);
		this.setTitle("Box Layout Demo");
		
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
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	public static void main(String[] args) {
		BoxLayout1 boxLayout1 = new BoxLayout1();
	}
}
