package com.string.fawzan;

public class Stringintern {
	public static void main(String[] args) {
		String str = new String("hello");
		String str2 = str.intern();
		
		System.out.println(str2);
		System.out.println(str==str2); //Different memory spaces
		
		String str3 = "hello";
		
		System.out.println(str2==str3);
	}
}
