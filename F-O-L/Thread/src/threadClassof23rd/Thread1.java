package threadClassof23rd;

public class Thread1 extends Thread{
	
	Task t1;
	
	public Thread1(Task t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void run() {
		t1.race1();
	}
}
