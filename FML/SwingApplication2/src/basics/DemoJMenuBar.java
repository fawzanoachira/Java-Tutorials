package basics;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class DemoJMenuBar extends JFrame{
	
	public DemoJMenuBar() {
		this.setVisible(true);
		this.setLayout(null);
		
		JMenuBar mb = new JMenuBar();
		
		JMenu menu = new JMenu("Menu");
		JMenu subMenu = new JMenu("Sub Menu");
		
		JMenuItem mi1 = new JMenuItem("Java");
		JMenuItem mi2 = new JMenuItem("Java2");
		JMenuItem mi3 = new JMenuItem("Java3");
		JMenuItem mi4 = new JMenuItem("Java4");

		menu.add(mi2);menu.add(mi1);
		subMenu.add(mi4);subMenu.add(mi3);
		menu.add(subMenu);
		
		mb.add(menu);
		
		this.setJMenuBar(mb);
		
		this.setSize(500,500);
	}
	
	public static void main(String[] args) {
		new DemoJMenuBar();
	}
}
