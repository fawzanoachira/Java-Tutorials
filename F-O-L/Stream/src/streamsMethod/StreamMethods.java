package streamsMethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class StreamMethods {
	public static void main(String[] args) {
		
		HashSet<String> s = new HashSet<>();
		s.add("one apple");
		s.add("one orange");
		s.add("one anar");
		s.add("one guava");
		
		boolean anyMatch = s.stream().anyMatch(value->value.startsWith("one"));
		System.out.println(anyMatch);
		
		boolean allMatch = s.stream().allMatch(value->value.startsWith("one"));
		System.out.println(allMatch);
		
		boolean noneMatch = s.stream().noneMatch(value->value.startsWith("one"));
		System.out.println(noneMatch);
		
		
//		List<String> fruits = Arrays.asList("grapes","apple","orange");
//		Optional<String> findAny = fruits.stream().findAny();
//		System.out.println(findAny.get());
//		
//		Optional<String> findFirst = fruits.stream().findFirst();
//		System.out.println(findFirst.get());
	}
}
