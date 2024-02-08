package threadClassof24th;

public class Main {
	public static void main(String[] args) {
		
		Task t1 = new Task();
		Task t2 = new Task();
		Thread1 th1 = new Thread1(t1);
		Thread2 th2 = new Thread2(t1);
		
		th1.start();
		th2.start();
		
		Thread1 th3 = new Thread1(t2);
		Thread2 th4 = new Thread2(t2);
		
		th3.start();
		th4.start();
	}
}
