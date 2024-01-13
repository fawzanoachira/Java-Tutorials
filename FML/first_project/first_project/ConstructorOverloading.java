package first_project;

public class ConstructorOverloading {
	
	public ConstructorOverloading() {
		System.out.println("hiii");
	}
	
	public ConstructorOverloading(char a) {
		this();
		System.out.println(a);
	}
	
	public ConstructorOverloading(int a, int b) {
		this((char)a);
		System.out.println(a+b);
	}
	
	public ConstructorOverloading(int a, int b, int c) {
		this(a,b);
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused") //used to ignore warnings of unused data.
		ConstructorOverloading ob4 = new ConstructorOverloading(33, 40,40);
		
		char a = 65;
		System.out.println(a);
	}
	
//	public ConstructorOverloading() {
//		System.out.println("hiii");
//	}
//	
//	public ConstructorOverloading(int a) {
//		System.out.println(a);
//	}
//	
//	public ConstructorOverloading(int a, int b) {
//		System.out.println(a+b);
//	}
//	
//	public ConstructorOverloading(int a, int b, int c) {
//		System.out.println(a+b+c);
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		ConstructorOverloading ob1 = new ConstructorOverloading();
//		ConstructorOverloading ob2 = new ConstructorOverloading(20);
//		ConstructorOverloading ob3 = new ConstructorOverloading(20, 30);
//		ConstructorOverloading ob4 = new ConstructorOverloading(30, 40,40);
//	}
}
