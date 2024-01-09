package java_intermediate2;

public class Typecasting2 {
	
	public static void test(double b) {
		System.out.println(b);
	}
	
	public static void test(int b) {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		test(20.0);
		test(10);
		test('A');
	}
}
