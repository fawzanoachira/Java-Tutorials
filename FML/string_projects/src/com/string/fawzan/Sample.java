package com.string.fawzan;

public class Sample {
	public static void main(String[] args) {
		String s = "fawzan"; //string constant pool
		String s1 = new String("Fawzan"); //string non constant pool
		System.out.println(s+" "+s1);
		
		System.out.println(s.length() +" "+ s1.length());
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.indexOf("z"));
		
		System.out.println(s.indexOf("a", 2));
		
		System.out.println(s.equals(s1));
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(s.substring(3));
		
		System.out.println(s1.substring(1, 4));
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.startsWith("faw"));
		
		System.out.println(s.startsWith("faw"));
		
		System.out.println(s1.endsWith("an"));
		
		System.out.println(s.contains("za"));
		
		System.out.println(s.contains("ff"));
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s.toString());
		
		
		
		
		
	}
}
