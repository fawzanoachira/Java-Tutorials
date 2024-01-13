package exceptionPackage;

public class Main2 {
	
	public void checkAge(int age) /*throws ArithmeticException*/{
		System.out.println(10/age);
	}
	
	public static void main(String[] args) {
		Main2 m = new Main2();
		
		try {
			m.checkAge(0);
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled");
		}
		finally {
			System.out.println("i will execute even if there is exception in or not");
		}
	}
}
