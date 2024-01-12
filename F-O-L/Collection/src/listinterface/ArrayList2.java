package listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(null);
		a.add(20);
		a.add(20);
		a.add(70);
		a.add(40);
		a.add(null);
		a.add('a'); 
		a.add("a");
		
		ArrayList a1 = new ArrayList();
		a1.addAll(a);
		
		System.out.println(a1+"\n"+a);
		
		a1.remove(0);
		a1.remove(4);
		a1.remove(4);
		System.out.println(a1);
		
		a1.remove("a");
		System.out.println(a1);
		
		a.set(0, "hello");
		System.out.println(a1);
		
		Object object = a1.get(3);
		System.out.println(object);
		
		System.out.println("-----------------------------");
		
		ArrayList a2 = new ArrayList();
		System.out.println(a2.isEmpty());
		
		System.out.println(a1.contains('a'));
		System.out.println("------------------------------");
		
		a2.addAll(a);
		System.out.println(a2.containsAll(a));
		
		a2.add(30);
		System.out.println(a2.containsAll(a));
		
		a.add(40);
		System.out.println(a2.containsAll(a)); /*when printing this, it will be true even adding another element to
											   collection a. Because we are creating objects through collection, so even
											   if we create same object again, when comparing with a2 by containsAll
											   method it will give true*/
		
		a.add(50);
		System.out.println(a2.containsAll(a));
		
		a2.removeAll(a);
		System.out.println(a2);
		
		System.out.println("-------------------");
		
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);
		
		List reversed = a.reversed();
		System.out.println(reversed);
	}
}
