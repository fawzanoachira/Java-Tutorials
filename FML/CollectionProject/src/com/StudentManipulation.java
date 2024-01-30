package com;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class StudentManipulation {
	public static void main(String[] args) {
		Map<Student, Integer> m = new TreeMap<Student, Integer>();//upcasting
		
		m.put(new Student(1, "sree", 61), 1);
		m.put(new Student(2, "ajay", 65), 2);
		m.put(new Student(5, "amal", 66), 3);
		m.put(new Student(4, "appu", 68), 4);
		m.put(new Student(3, "sachin", 63), 5);
		
		Set<Student> keySet = m.keySet();
		for(Student key:keySet) {
			System.out.println(key);
		}
		
		//if the objects are stored in values section we cannot directly sort it.
		//if we want to sort treemap we have to convert it another collection and sort it.
	}
}