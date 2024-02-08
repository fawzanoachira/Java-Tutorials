package threadTutorial;

class ExtendingFromThreadClassFile extends Thread{
	@Override
	public void run() {
		System.out.println("Thread Started.......");
		for(int i = 0; i<=10 ; i++) {
			System.out.println(i);
		}
		System.out.println("thread going to end");
	}
}

public class ExtendingFromThreadClass{
	public static void main(String[] args) {
		ExtendingFromThreadClassFile e = new ExtendingFromThreadClassFile();
		System.out.println("thread going to start");
		e.start();
//		System.out.println("a");
//		System.out.println("a");
//		System.out.println("a");
//		System.out.println("a");
//		System.out.println("a");
//		System.out.println("a");
//		System.out.println("a");     when these stmts are given race condition occuring.
		System.out.println("printing stmnt which do not waited for previous step");
	}
}