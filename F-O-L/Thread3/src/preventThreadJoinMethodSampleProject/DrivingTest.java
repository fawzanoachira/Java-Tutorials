package preventThreadJoinMethodSampleProject;

public class DrivingTest extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println("Driving test starts");
			Thread.sleep(5000);
			System.out.println("Driving test ends");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
