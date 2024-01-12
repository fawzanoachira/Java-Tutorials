package listinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class GenericsArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		//a.add("444"); this become Compile time error(CTE)
		
		Iterator<Integer> iterator = a.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		ListIterator<Integer> listIterator = a.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+" ");
			//a.add(30); //if we try to add objects while iterating it will throw concurrentmodificationexception
		}
	}
}
