package comparatorSorting;

import java.util.TreeSet;

public class CustomSort {
	public static void main(String[] args) {
//		SortById id = new SortById();
//		SortBySalary id = new SortBySalary();
//		SortByName id = new SortByName();
		SortByLengthOfName id = new SortByLengthOfName();
		TreeSet<Employee> s = new TreeSet<Employee>(id);
		
		s.add(new Employee(10,"jishnu",10000));
		s.add(new Employee(30,"jishnuraj",21000));
		s.add(new Employee(16,"jishnukumar",17000));
		s.add(new Employee(80,"jish",19000));
		s.add(new Employee(70,"jishnu p",14000));
		
		for(Employee i:s) {
			System.out.println(i);
		}
	}
}
