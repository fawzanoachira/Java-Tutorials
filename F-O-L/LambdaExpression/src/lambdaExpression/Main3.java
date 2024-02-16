package lambdaExpression;

import java.util.TreeMap;
import java.util.TreeSet;

public class Main3 {
	public static void main(String[] args) {
//		TreeSet<Integer> t = new TreeSet<Integer>((a,b)->b-a);
//		
//		t.add(10);
//		t.add(30);
//		t.add(15);
//		t.add(20);
//		t.add(60);
		
		TreeMap t = new TreeMap<Integer, String>((a,b)->b-a);
		t.put(2, "fawza");
		t.put(3, "fawzan");
		t.put(1, "fawz");
		System.out.println(t);
	}
}
