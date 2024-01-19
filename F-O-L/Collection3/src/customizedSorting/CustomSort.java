package customizedSorting;

import java.util.TreeSet;

public class CustomSort {
	public static void main(String[] args) {
		SortById id = new SortById();
		TreeSet<Customer> s = new TreeSet<Customer>(id);
		
		s.add(new Customer(10,"jishnu",10000));
		s.add(new Customer(30,"jishnuraj",21000));
		s.add(new Customer(16,"jishnukumar",17000));
		s.add(new Customer(80,"jish",19000));
		s.add(new Customer(70,"jishnu p",14000));
		
		for(Customer i:s) {
			System.out.println(i);
		}
	}
}
