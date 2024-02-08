package threadClassof23rd;

public class Thread2 extends Thread{
	
	Task t1;
	
	public Thread2(Task t1) {
		this.t1 = t1;
	}

	@Override
	public void run() {
		t1.race2();
	}
}
