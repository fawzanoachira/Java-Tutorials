package streamConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sample1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
//		List<String> longName = new ArrayList<String>();
		list.add("fawzan");
		list.add("farhan");
		list.add("zayan");
		list.add("marwan");
		
		List<String> longName = list.stream().filter((str)-> str.length() >= 6 && str.length() < 8).collect(Collectors.toList());
		
		System.out.println(longName);
	}
}
