package setinterface;

import java.util.HashSet;
import java.util.Vector;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet a = new HashSet();
		
//		a.add(null);
		a.add(10);	//10%16=10
		a.add(20);  //20%16=4
		a.add(30);  //30%16=14
		a.add(40);  //40%16=8
		a.add(50);  //50%16=2
//		a.add(null);
//		a.add('a'); 
//		a.add("a");
		
		for(Object i:a) {
			System.out.println(i);
		}
		
		System.out.println(a.isEmpty()); 
		
	}
}
