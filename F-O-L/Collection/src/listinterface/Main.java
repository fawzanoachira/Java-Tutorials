package listinterface;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(null);
		a.add(20);
		a.add(20);
		a.add(40);
		a.add(40);
		a.add(null);
		a.add('a');  
		
		Iterator iterator = a.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("----------------------------");
		
		for(int i = 0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println(a);//in here the customised toString method is calling
	}
}	
