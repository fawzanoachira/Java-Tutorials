package basics;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ItemListener1 extends Frame implements ItemListener{
	
	Checkbox c1;
	Checkbox c2;
	Checkbox c3;
	Label l;
	
	public ItemListener1() {
		
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		this.setTitle("Item Listener");
		
		l = new Label();
		l.setBounds(200,50,50,50);
		l.setAlignment(Label.CENTER);
		l.setBackground(Color.cyan);
		
		add(l);
		
		c1 = new Checkbox("Tea");
		c1.setBounds(100, 100, 70, 50);
		c1.setBackground(Color.white);
		c2 = new Checkbox("COffee");
		c2.setBounds(100, 150, 70, 50);
		c2.setBackground(Color.white);
		c3 = new Checkbox("Horlicks");
		c3.setBounds(100, 200, 70, 50);
		c3.setBackground(Color.white);
		
		this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}});
		
		add(c1);
		add(c2);
		add(c3);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	
	public static void main(String[] args) {
		ItemListener1 itemListener1 = new ItemListener1();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(c1.getState()==true) {
			l.setText(c1.getLabel());
		}
		else if(c2.getState()==true) {
			l.setText(c2.getLabel());
		}
		else if(c3.getState()==true) {
			l.setText(c3.getLabel());
		}
	}
}
