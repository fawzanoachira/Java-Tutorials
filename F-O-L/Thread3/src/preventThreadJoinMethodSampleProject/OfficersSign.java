package preventThreadJoinMethodSampleProject;

public class OfficersSign extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println("Officer has taken the file");
			Thread.sleep(2000);
			System.out.println("Officer signed successfully");
		} catch (Exception e) {
			
		}
	}

}
