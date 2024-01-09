package derivedCasting;

interface Car{
	public void drive();
}

class Honda implements Car{

	@Override
	public void drive() {
		System.out.println("I am driving Honda");
	}
	
	public void applyBrake() {
		System.out.println("Applied Brake");
	}
	
}

class Toyota implements Car{

	@Override
	public void drive() {
		System.out.println("I am driving Toyota");
	}
	
	public void applyBrake() {
		System.out.println("Applied Brake");
	}
	
}

public class Vehicle {
	public static void main(String[] args) {
		Car s = new Toyota();
		s.drive(); // upcasting
		
		Car d = new Honda();
		d.drive(); // upcasting
		
		Honda h = (Honda)d; //downcasting
		h.applyBrake();
		h.drive();
		
	}
}
