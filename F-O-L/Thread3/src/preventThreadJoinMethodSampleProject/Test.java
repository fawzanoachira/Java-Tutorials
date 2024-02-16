package preventThreadJoinMethodSampleProject;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Medical m = new Medical();
		m.start();
		m.join();
		DrivingTest d = new DrivingTest();
		d.start();
		d.join();
		OfficersSign o = new OfficersSign();
		o.start();
	}
}
