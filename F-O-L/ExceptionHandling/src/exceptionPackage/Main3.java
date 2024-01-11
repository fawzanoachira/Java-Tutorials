package exceptionPackage;

public class Main3 {
	
	public void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException();
		}
		
		else {
			System.out.println("yes u can vote");
		}
	}
	
	public static void main(String[] args) {
		Main3 m = new Main3();
		
		try {
			m.checkAge(17);
		}
		catch(ArithmeticException e) {
			System.out.println("u r not eligible to vote");
		}
	}
}
