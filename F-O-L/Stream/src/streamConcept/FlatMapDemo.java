package streamConcept;

import java.util.ArrayList;
import java.util.List;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(23);
		list2.add(4);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(34);
		list3.add(41);
		
		List<List<Integer>> listCollection = new ArrayList<List<Integer>>();
		listCollection.add(list);
		listCollection.add(list2);
		listCollection.add(list3);
		
		listCollection.stream().flatMap((n)->n.stream()).map(x->x+5).forEach(System.out::println);
	}
}
