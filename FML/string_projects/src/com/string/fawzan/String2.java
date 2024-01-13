package com.string.fawzan;

public class String2 {
	public static void main(String[] args) {
		String str = "fawzan";
		str.concat(" hello");
		System.out.println(str);
		
		str = str.concat(" hello");
		System.out.println(str);
		
		System.out.println("----------------------------------");
		
		StringBuilder s = new StringBuilder("hello");
		s.append(" hii");
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer("hi");
		s1.append(" hello");
		System.out.println(s1);
	}
}
