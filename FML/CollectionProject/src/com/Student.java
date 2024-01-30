package com;

public class Student implements Comparable<Student>{
	Integer id;
	String name;
	Integer age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.id.compareTo(o.id);
	}
	
}
