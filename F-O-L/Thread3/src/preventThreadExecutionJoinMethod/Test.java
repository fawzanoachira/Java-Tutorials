package preventThreadExecutionJoinMethod;

public class Test extends Thread{
	
	@Override
	public void run() {
		Thread.yield();
		for(int i=1;i<=5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}
