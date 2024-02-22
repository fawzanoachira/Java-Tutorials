package streamConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapProgram {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		List<String> list2 = Arrays.asList("fawzan","marwan","abobackar","umar");
		
		List<String> newList = list2.stream().map((n)->n.toUpperCase()).collect(Collectors.toList());
		List<Integer> newList2 = list2.stream().map((n)->n.length()).collect(Collectors.toList());
		System.out.println(newList2+" "+newList);
	}
}	
