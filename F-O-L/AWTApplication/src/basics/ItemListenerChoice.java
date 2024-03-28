package basics;

import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ItemListenerChoice extends Frame{
	
	Choice c1;
	Label l;
	
	public ItemListenerChoice() {
		
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		this.setTitle("Item Listener");
		
		l = new Label();
		l.setBounds(200,50,140,50);
		l.setAlignment(Label.CENTER);
		l.setBackground(Color.cyan);
		
		add(l);
		
		c1 = new Choice();
		c1.setBounds(100, 300, 80, 30);
		c1.add("Tea1");
		c1.add("Tea2");
		c1.add("Tea3");
		
		add(c1);
		
		this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}});
		
		c1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String s = c1.getSelectedItem();
				l.setText("Selected choice is: "+s);
			}
		});
	}
	
	public static void main(String[] args) {
		ItemListenerChoice itemListener1 = new ItemListenerChoice();
	}
}
