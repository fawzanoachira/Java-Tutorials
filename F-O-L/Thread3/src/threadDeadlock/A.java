package threadDeadlock;

public class A {
	public synchronized void foo(B b) {
		System.out.println("Thread 1 start execution of foo method");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Thread 1 trying to call b.last{}");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("inside a this is last method");
	}
}
