package wrapper_class;

public class Sample {
	public static void main(String[] args) {
		int a = 10; //primitive type
		System.out.println(a);
//		
//		Integer a1 = new Integer(10); //Object type
//		System.out.println(a1);
		
		
		/*
		Integer i = Integer.valueOf(a); //Boxing
		System.out.println(i);
		
		Integer i1 = new Integer(10); 
		int v = i1.intValue(); //unboxing
		
		System.out.println(v); */ //these are before jdk 5
		
		//after jdk 5
		
		int i = 10;
		Integer a1 = i; //auto boxing
		System.out.println(a1+" "+i);
		
		int b = a1; // auto unboxing
		
		
	}
}
