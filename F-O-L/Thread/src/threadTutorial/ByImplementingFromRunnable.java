package threadTutorial;

class ByImplementingFromRunnableFile implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<=10 ; i++) {
			System.out.println(i);
		}
	}
}

public class ByImplementingFromRunnable{
	public static void main(String[] args) {
		System.out.println("program started");
		ByImplementingFromRunnableFile b = new ByImplementingFromRunnableFile();
		Thread t = new Thread(b);
		
		t.start();
		System.out.println("prgm ended");
	}
}