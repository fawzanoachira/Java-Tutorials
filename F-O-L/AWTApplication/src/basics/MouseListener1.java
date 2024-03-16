package basics;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseListener1 extends Frame /*implements MouseListener*/{
	
	public MouseListener1() {
		
//		this.addMouseListener(this);
		
		//another way using mouse adapter class
		
		this.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("Mouse clicked");
		}});
		
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
//	public void mouseClicked(MouseEvent e) {
//		System.out.println("Mouse Clicked");
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		System.out.println("Mouse Pressed");
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		System.out.println("Mouse Released");
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		System.out.println("Mouse Entered");
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		System.out.println("Mouse Exited");
//	}
//
	public static void main(String[] args) {
		MouseListener1 mouseListener1 = new MouseListener1();
	}
}
