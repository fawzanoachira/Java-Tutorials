package threadClassMethods;

//User Defined Thread
class Sample extends Thread{
	@Override
	public void run() {
//		String name = Thread.currentThread().getName();
//		System.out.println(name);
		Thread.currentThread().setName("C");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
	}
}


public class Main {
	public static void main(String[] args) {
//		String name = Thread.currentThread().getName();
//		System.out.println(name);
//		Thread currentThread = Thread.currentThread();
//		currentThread.setName("fawzan");
//		String name = Thread.currentThread().getName();
//		System.out.println(name);
		
		Sample sample = new Sample();
		sample.start();
		System.out.println(sample.isAlive());
	}
}
