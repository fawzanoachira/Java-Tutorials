package basics;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.ItemSelectable;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ItemListener2CBGroup extends Frame implements ItemListener{
	
	Checkbox c1;
	Checkbox c2;
	Checkbox c3;
	Label l;
	CheckboxGroup cb;
	
	public ItemListener2CBGroup() {
		
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		this.setTitle("Item Listener");
		
		cb = new CheckboxGroup();
		l = new Label();
		l.setBounds(200,50,170,50);
		l.setAlignment(Label.CENTER);
		l.setBackground(Color.cyan);
		
		add(l);
		
		c1 = new Checkbox("Tea",cb,false);
		c1.setBounds(100, 100, 70, 50);
		c1.setBackground(Color.white);
		c2 = new Checkbox("COffee",cb,false);
		c2.setBounds(100, 150, 70, 50);
		c2.setBackground(Color.white);
		c3 = new Checkbox("Horlicks",cb,false);
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
		ItemListener2CBGroup itemListener1 = new ItemListener2CBGroup();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox cb = (Checkbox) e.getItemSelectable();
		if(cb.getState()==true) {
			l.setText("Selected Radio is: "+cb.getLabel());
		}
	}
}
