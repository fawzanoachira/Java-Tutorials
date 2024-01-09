package polymorphism;

public class Polymorphism {
	
	public void test() {
		System.out.println("hellooo");
	}
	public void test(int a) {
		System.out.println("hellooo00000");
	}
	public void test(int a, int b) {
		System.out.println("helloooo");
	}
	
	public static void main(String[] args) {
		Polymorphism m = new Polymorphism();
		
		m.test();
		m.test(2);
		m.test(34, 450);
	}
}
