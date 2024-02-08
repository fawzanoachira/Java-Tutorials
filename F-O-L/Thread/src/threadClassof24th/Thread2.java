package threadClassof24th;

public class Thread2 extends Thread{
	
	Task t1;
	
	public Thread2(Task t1) {
		this.t1 = t1;
	}

	@Override
	public void run() {
		Task.race2();
	}
}
