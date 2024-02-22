package streamConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> evenList = new ArrayList<Integer>();
		
		list.add(10);
		list.add(30);
		list.add(15);
		list.add(21);
		list.add(40);
		list.add(10);
		list.add(21);
		list.add(40);
		list.add(28);
//		System.out.println(list);
		
//		min()
		
		Optional<Integer> min = list.stream().min((a,b)->{
															return a.compareTo(b);
								  						 });
		
		System.out.println(min);
		System.out.println(min.get());
		
//		max()
		Optional<Integer> max = list.stream().max((a,b)->a.compareTo(b));

		System.out.println(max);
		System.out.println(max.get());
		
//		reduce()
		Optional<Integer> sum1 = list.stream().reduce((sum, x)->sum+=x);
		System.out.println(sum1.get());
		
		System.out.println();
		
//		toArray()
		Object[] array = list.stream().toArray();
		for(Object v:array) {
			System.out.println(v);
		}
				
//		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
//		System.out.println(list2);
		
//		List<Integer> list2 = list.stream().distinct().limit(3).collect(Collectors.toList());
//		System.out.println(list2);
		
//		long count = list.stream().distinct().count();
//		System.out.println(count);
		
//		evenList = list.stream().filter((n)->n%5==0).collect(Collectors.toList());
//		System.out.println(evenList);
//		
//		list.stream().filter((n)->n%2==0).forEach((n)->System.out.print(n+" "));
//		
//		list.stream().filter((n)->n%2==0).forEach(System.out::println);
	}
}
