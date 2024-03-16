package basics;

import java.awt.Frame;

public class WindowListenerDemo extends Frame{
	
	public WindowListenerDemo() {
		this.addWindowListener(new WindowListener1());
		this.setSize(400,400);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		WindowListenerDemo windowListenerDemo = new WindowListenerDemo();
	}
}
