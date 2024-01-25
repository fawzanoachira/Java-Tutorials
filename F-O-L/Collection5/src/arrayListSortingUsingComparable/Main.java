package arrayListSortingUsingComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		Student s1 = new Student(11, "sree", "ksd", 40);
		Student s2 = new Student(12, "ajay", "wayanad", 30);
		Student s3 = new Student(18, "navin", "malappuram", 60);
		Student s4 = new Student(14, "sahal", "Thiruvananthapuram", 20);
		
		ArrayList<Student> a = new ArrayList<Student>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		
		Collections.sort(a);
		
		for(Student i:a) {
			System.out.println(i);
		}
		
	}
}
