package anonymousClass;

public class Sample1 extends Thread{
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				Integer[] v = {1,2,3,4};
				for(Integer i:v) {
					System.out.println(i);
				}
			}
		};
		
		r.run();
		
		Thread s = new Thread(r);
		
		s.start();
	}
}
