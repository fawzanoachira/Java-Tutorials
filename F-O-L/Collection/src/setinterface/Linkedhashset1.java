package setinterface;

import java.util.LinkedHashSet;

public class Linkedhashset1 {
	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet();
		
		l.add(10);
		l.add(20);
		l.add(40);
		l.add(30);
		l.add(70);
		l.add(20);
		
		for (Object i:l) {
			System.out.println(i);
		}
	}
}
