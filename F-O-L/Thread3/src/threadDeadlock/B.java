package threadDeadlock;

public class B {
	public synchronized void boo(A a) {
		System.out.println("Thread 2 start execution of boo method");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Thread 2 trying to call a.last{}");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("inside a this is last method");
		
	}
}
