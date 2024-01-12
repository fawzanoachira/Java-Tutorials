package listinterface;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(20);
		a.add(20);
		a.add(70);
		a.add(40);
		
		ListIterator listIterator = a.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+" ");
		}
		System.out.println();
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous()+" ");
		}
	}
}
