package queueInterface;

//import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	public static void main(String[] args){
		LinkedList<Integer> l = new LinkedList<Integer>();
		
//		l.add(20);
//		l.add(20);
//		l.add(30);
//		l.add(40);
//		l.add(50);
//		l.add(90);
//		l.add(70);
		try{
			if(l.isEmpty()) {
				throw new CustomNoSuchElement("there is no elemetn");
			}
			else {
				System.out.println(l.element());
			}
		}
		catch (CustomNoSuchElement e) {
			System.out.println(e.getMessage());
		}

//		System.out.println(l.peek());
		
//		System.out.println(l.poll());
		
//		System.out.println(l.remove());
		
		ListIterator<Integer> listIterator = l.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+" ");
		}
		
//		System.out.println();
//		while(listIterator.hasPrevious()) {
//			System.out.print(listIterator.previous()+" ");
//		}
//		Iterator<Integer> iterator = l.iterator();
//		while(iterator.hasNext()) {
//			System.out.print(iterator.next()+" ");
//		}
		
//		System.out.println(l);
		
//		for(Object i:l) {
//			System.out.println(i);
//		}
		
//		for(int i=0;i<=l.size()-1;i++) {
//			System.out.println(l.get(i));
//		}
	}
}	
