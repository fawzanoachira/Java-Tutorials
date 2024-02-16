package threadPriorities;

public class ThreadPriorities extends Thread{
	
	@Override
	public void run() {
		System.out.println("child thread priority: "+Thread.currentThread().getPriority());
		System.out.println("child thread");
	}
	
	public static void main(String[] args) {
		int priority = Thread.currentThread().getPriority();
		System.out.println("main thread priroity: "+priority);
		
		Thread.currentThread().setPriority(MIN_PRIORITY);
		
		System.out.println("---------------------");
		
		System.out.println("main thread priroity: "+Thread.currentThread().getPriority());
		
		ThreadPriorities t = new ThreadPriorities();
		t.start();
	}
}
