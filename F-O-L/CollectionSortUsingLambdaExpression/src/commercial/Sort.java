package commercial;

import java.util.ArrayList;
import java.util.Collections;

class Student{
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class Sort {
	public static void main(String[] args) {
		Student s = new Student(5, "sree");
		Student s2 = new Student(1, "ajay");
		Student s3 = new Student(2, "akhil");
		Student s4 = new Student(4, "navin");
		Student s5 = new Student(3, "mithun");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Collections.sort(list, (a,b)->a.id-b.id);
		
		System.out.println(list);
	}
}
