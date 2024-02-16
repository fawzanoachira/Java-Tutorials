package threadInterruptMethod;

public class Test extends Thread{
	
	@Override
	public void run() {
		try {
			Thread.interrupted();
			System.out.println(Thread.currentThread().isInterrupted());
			for(int i = 0;i<=5;i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		} catch (Exception e) {
			System.out.println("thread interupted "+e);
		}
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		t.interrupt();
	}
}
