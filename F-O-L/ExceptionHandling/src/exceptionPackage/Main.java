package exceptionPackage;

public class Main {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("arithmetic exception");
		}
		
		System.out.println("ended");
		
	}
}
