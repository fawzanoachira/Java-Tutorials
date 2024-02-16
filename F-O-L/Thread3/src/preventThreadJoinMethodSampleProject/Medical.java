package preventThreadJoinMethodSampleProject;

public class Medical extends Thread{

	@Override
	public void run() {
		try {
			System.out.println("Medical starts");
			Thread.sleep(3000);
			System.out.println("Medical Ends");
		} catch (Exception e) {
		}
	}
	
}
