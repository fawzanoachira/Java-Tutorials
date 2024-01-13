package com.string.fawzan;

public class Stringbuildercapacity {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		System.out.println(s.capacity());
		
		StringBuilder s1 = new StringBuilder("hello");
		System.out.println(s1.capacity()); //default capacity + given string length
		
		StringBuilder s2 = new StringBuilder(15);
		System.out.println(s2.capacity());
		s2.append("hellohellohelloh"); //capacity exceeded
		System.out.println(s2.capacity());
	}
}
