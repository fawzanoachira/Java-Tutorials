package basics;

import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyListener1 extends Frame /*implements KeyListener*/{
	
	public KeyListener1() {
		
//		this.addKeyListener(this);
		//another way by extending key adapter class
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Key Pressed");
			}
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Key Released");
			}
		});
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}});
		this.setSize(400, 400);
		this.setLayout(null);
		this.setVisible(true);
	}
	
//	@Override
//	public void keyTyped(KeyEvent e) {
//		System.out.println("Key Typed");
//	}
//
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("Key Pressed");
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//		System.out.println("Key Released");
//	}
	
	public static void main(String[] args) {
		KeyListener1 keyListener1 = new KeyListener1();
	}
}
