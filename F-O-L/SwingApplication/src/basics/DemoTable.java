package basics;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DemoTable extends JFrame{
	
	public DemoTable() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setLayout(null);
		
		String column[] = {"ID","Name","Age"};	
		
		String data[][] = {{"100","Fawzan","23"},
						   {"101","Fawzan1","24"},
						   {"102","Fawzan2","25"}};
		
		
		JTable jt = new JTable(data,column);
		JScrollPane js = new JScrollPane(jt);
		js.setBounds(30,40,150,300);
		this.add(js);
	}
	
	public static void main(String[] args) {
		DemoTable demoTable = new DemoTable();
	}
}
