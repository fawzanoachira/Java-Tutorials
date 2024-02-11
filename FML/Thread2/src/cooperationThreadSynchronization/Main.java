package cooperationThreadSynchronization;

class TotalEarnings extends Thread{
	int total=0;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				total+=100;
			}
			this.notify();
		}
	}	
}

public class Main {
	public static void main(String[] args) throws InterruptedException {
		TotalEarnings totalEarnings = new TotalEarnings();
		totalEarnings.start();
		synchronized (totalEarnings) {
			totalEarnings.wait();
		}
		System.out.println("Total Earnings is: "+totalEarnings.total);
	}
}
