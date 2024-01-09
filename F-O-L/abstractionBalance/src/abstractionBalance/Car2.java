package abstractionBalance;

public class Car2 implements Vehicle2{
	@Override
	public void start() {
		System.out.println("started");
	}

	@Override
	public void stop() {
		System.out.println("stopped");
	}

	@Override
	public void noOfWheels() {
		System.out.println("4");
	}
}
