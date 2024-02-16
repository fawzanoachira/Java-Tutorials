package preventThreadExecutionJoinMethod;

public class Test1 extends Thread{
	
	static Thread mainthread;
	
	@Override
	public void run() {
		try {
			mainthread.join();
			for(int i=1;i<=5;i++) {
				Thread.sleep(1000);
				System.out.println(i+" child thread");
			}
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		mainthread = Thread.currentThread();
		Test1 t = new Test1();
		t.start();
//		t.join();
		try {
			for(int i=1;i<=5;i++) {
				Thread.sleep(1000);
				System.out.println(i+" main thread");
			}
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
