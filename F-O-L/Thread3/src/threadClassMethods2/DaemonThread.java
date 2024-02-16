package threadClassMethods2;

public class DaemonThread extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("child thread");
	}
	
	
	public static void main(String[] args) {
//		System.out.println("main thread"); //if we comment this line the daemon thread will not do anything.
//		System.out.println(Thread.currentThread().isDaemon());
		DaemonThread d = new DaemonThread();
		d.setDaemon(true); //setting the thread to daemon.
		d.start();
	}
}
