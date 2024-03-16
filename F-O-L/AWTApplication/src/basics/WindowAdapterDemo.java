package basics;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterDemo extends Frame{
	public WindowAdapterDemo() {
//		this.addWindowListener(new WindowAdapter1());
		this.addWindowListener(new WindowAdapter() { //another way to include window closing method from window adapter.
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}});
		this.setBackground(Color.DARK_GRAY);
		this.setSize(400,400);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		WindowAdapterDemo windowAdapterDemo = new WindowAdapterDemo();
	}
}
