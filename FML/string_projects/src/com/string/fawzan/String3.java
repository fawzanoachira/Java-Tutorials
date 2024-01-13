package com.string.fawzan;

public class String3 {
	public static void main(String[] args) {
		String str = "hello";
		String str1 = "hello";
		String str4 = "apple";
		String str2 = new String("hello");
		String str3 = new String("hello");
		
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str==str1);
		System.out.println(str==str2);
		System.out.println(str2==str3);
		
		System.out.println(str.compareTo(str4));
		
	}
}
