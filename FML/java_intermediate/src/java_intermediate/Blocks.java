package java_intermediate;

public class Blocks {
	
	static {
		System.out.println("hello");
	}
	
	{
		System.out.println("hello in non static block");
	}
	
	public static void main(String[] args) {
		Blocks m = new Blocks();
	}
}
