package studentandemployee;

import java.util.ArrayList;

public class Main1 extends Student{
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add(new Student(1, "fawzan", 30, 12));
		a.add(new Student(2, "fawzan1", 32, 12));
		a.add(new Student(3, "fawzan2", 34, 12));
		
		a.add(new Employee(1, "name", 5555));
		a.add(new Employee(2, "name3", 5556));
		a.add(new Employee(3, "name2", 5557));
		
		for(Object v:a) {
			if(v instanceof Employee) {
				System.out.println(v);
		
			}
		}	
	}
}
