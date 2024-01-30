package newSortingTreeMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentManipulation {
	public static void main(String[] args) {
		
		// we cannot sort map based on value therefore we are getting values from the map & adding it to the list.
		// as we can sort list using Collections.sort
		
		// add 5 Student Objects
		Student s = new Student(1, "ajay", 23);
		Student s1 = new Student(2, "mithun", 29);
		Student s2 = new Student(3, "nithin", 27);
		Student s3 = new Student(4, "akhil", 25);
		Student s4 = new Student(5, "sneha", 21);
		
		//added all the student objects to the map
		Map<Integer, Student> map = new LinkedHashMap<Integer, Student>(); //up casting
		map.put(1, s);
		map.put(2, s1);
		map.put(3, s2);
		map.put(4, s3);
		map.put(5, s4);
		
		// created a list in order to sort
		List<Student> list = new ArrayList<Student>();
		
		//converted map to set by using keyset method
		Set<Integer> keySet = map.keySet();
		
		//traverse map and adding it to list.
		for(Integer key:keySet) {
			Student student = map.get(key); //get the value(student object)
			list.add(student); //add the value to list
		}
		
		System.out.println("------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1: Sort Student by Id");
			System.out.println("2: Sort Student by Name");
			System.out.println("3: Sort Student by Age");
			System.out.println("4: Exit");
			System.out.print("Enter your Choice: ");
			int nextInt = sc.nextInt();
			System.out.println();
			switch (nextInt) {
			case 1: {
				Collections.sort(list, new SortById());
				for(Student stu:list) {
					System.out.println(stu);
				}
				System.out.println();
				break;
			}
			case 2: {
				Collections.sort(list, new SortByName());
				for(Student stu:list) {
					System.out.println(stu);
				}
				System.out.println();
				break;
			}
			case 3: {
				Collections.sort(list, new SortByAge());
				for(Student stu:list) {
					System.out.println(stu);
				}
				System.out.println();
				break;
			}
			case 4: {
				System.exit(0);
			}
			default:
				System.out.println("Enter a valid choice!!");
				System.out.println();
			}
		}
	}
}
