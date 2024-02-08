package threadClassof23rd;

public class Main {
	public static void main(String[] args) {
		
		Task t1 = new Task();
		Thread1 th1 = new Thread1(t1);
		Thread2 th2 = new Thread2(t1);
		
		th1.start();
		th2.start();
	}
}
