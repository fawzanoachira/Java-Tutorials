package preventThreadExecutionJoinMethod;

public class Student extends Thread{
	@Override
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				//sleep method
				Thread.sleep(1000);
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.start();
		
		
		
//		try {
//			for(int i=1;i<=10;i++) {
//				Thread.sleep(1000);
//				System.out.println(i);
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}
