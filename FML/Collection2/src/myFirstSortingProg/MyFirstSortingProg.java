package myFirstSortingProg;

import java.util.TreeSet;

class Student implements Comparable{
	
//	int rollno;
//	String name;
//	int age;
	
	Integer rollno;
	String name;
	Integer age;
	
	public Student(Integer rollno, String name, Integer age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
//		if(this.rollno==s.rollno) {
//			return 0;
//		}
//		else if(this.rollno<s.rollno) {
//			return -1;
//		}
//		else {
//			return 1;
//		}				//if we want to sort based on roll no in ascending order.
		
		//if we want to compare with name which istring there is two way
			//1. length
			//2. alphabetical
		
		//Length comparison
//		if(this.name.length()==s.name.length()) {
//			return 0;
//		}
//		else if(this.name.length()<s.name.length()) {
//			return -1;
//		}
//		else {
//			return 1;
//		}
		
		//alphabetical
//		return this.name.compareTo(s.name);
		
		//wrapper class comparison
		return this.rollno.compareTo(s.rollno);
	}
}

public class MyFirstSortingProg {
	
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		
		t.add(new Student(8,"fawz",22));
		t.add(new Student(1,"dfdfdf",22));
		t.add(new Student(2,"sadsa",22));
		
		for(Object i:t) {
			System.out.println(i);
		}
	}
}
