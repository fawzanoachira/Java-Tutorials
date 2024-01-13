package first_project;

public class MethodOverloading {
	
	public void add() {
		System.out.println("hii");
	}
	
	public void add(int a) {
		System.out.println(a);
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(double a, double b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		MethodOverloading ob = new MethodOverloading();
		
		ob.add(20.0,20.0);
		ob.add();
		ob.add(20);
		ob.add(3, 4);
	}
}
