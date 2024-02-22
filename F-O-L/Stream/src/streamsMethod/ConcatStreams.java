package streamsMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStreams {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("grapes","apple","orange");
		List<String> veg = Arrays.asList("cabbbage","carrot","cucumber");
		
		Stream<String> stream1 = fruits.stream();
		Stream<String> stream2 = veg.stream();
		
		List<String> list = Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(list);
	}
}
