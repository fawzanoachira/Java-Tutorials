package java_intermediate;

public class Blocks {
	
//	static {
//		System.out.println("hello");
//	}
//	
//	{
//		System.out.println("hello in non static block");
//	}
	
	static int a,c;
	int b,d;
	
	static {
		a=10;
		System.out.println(a + " in static block");
		Blocks b1 = new Blocks(); //usually static blocks are used to initialize static variables.
		b1.b = 20;
		System.out.println(a +" in static block");
		System.out.println(b1.b + " in static block");
	}
	
	{
		a = 40;
		b = 50;
		System.out.println(a+" in non static block");
		System.out.println(b+" in non static block");
	}
	
	public static void main(String[] args) {
		Blocks m = new Blocks();
		System.out.println(m);
	}
}
