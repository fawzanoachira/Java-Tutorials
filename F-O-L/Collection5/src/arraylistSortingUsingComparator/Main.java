package arraylistSortingUsingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1, "sree", 18000);
		Employee employee2 = new Employee(2, "ajay", 16000);
		Employee employee3 = new Employee(3, "navin", 13000);
		Employee employee4 = new Employee(4, "akhil", 21000);
		Employee employee5 = new Employee(5, "mithun", 17000);
		
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(employee1);
		a.add(employee2);
		a.add(employee3);
		a.add(employee4);
		a.add(employee5);
		
//		Collections.sort(a, new SortBasedonName());
					//OR
		
		Comparator<Employee> comparing = Comparator.comparing(Employee::getEmpSalary);
		Collections.sort(a, comparing); 
		//this method is using sort without using the Comparator Class.
		//in this method we can only do ascending sorting
		
		for(Employee i:a) {
			System.out.println(i);
		}
	}
}
