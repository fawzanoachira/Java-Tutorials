package basics;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

public class Sample6 extends Frame{
	
	public Sample6() {
		
		//TextArea
//		TextArea t = new TextArea(3,5);
//		t.setBounds(100,200,100,100);
//		add(t);
		
		//Menubar
		
		MenuBar mb = new MenuBar();
		Menu m = new Menu("Menu");
		MenuItem mi1 = new MenuItem("Item 1");
		MenuItem mi2 = new MenuItem("Item 2");
		MenuItem mi3 = new MenuItem("Item 3");
		MenuItem mi4 = new MenuItem("Item 4");
		MenuItem mi5 = new MenuItem("Item 5");
		m.add(mi1);
		m.add(mi2);
		m.add(mi3);
		m.add(mi4);
		m.add(mi5);
		mb.add(m);
		setMenuBar(mb);
		
		this.setSize(400,400);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Sample6 sample6 = new Sample6();
	}
}
