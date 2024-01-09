package abstractionBalance;

public class Car extends Vehicle {

	@Override
	void start() {
		System.out.println("started");
	}

	@Override
	void stop() {
		System.out.println("stopped");
	}

	@Override
	void noOfWheels() {
		System.out.println("4");
	}

}
