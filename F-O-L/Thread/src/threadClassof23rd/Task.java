package threadClassof23rd;

public class Task {
//	public void race1() {
//		for(int i=1;i<=5;i++) {
//			System.out.println(i+"thread1 is executing");
//		}
//	}
//	public void race2() {
//		for(int i=5;i>=1;i--) {
//			System.out.println(i+"thread2 is executing");
//		}
//	}
	
	//synchronized method
//	synchronized public void race1() {
//		for(int i=1;i<=5;i++) {
//			System.out.println(i+"thread1 is executing");
//		}
//	}
//	synchronized public void race2() {
//		for(int i=5;i>=1;i--) {
//			System.out.println(i+"thread2 is executing");
//		}
//	}
	
	//synchronized block
	public void race1() {
		synchronized (this) {
			for(int i=1;i<=5;i++) {
				System.out.println(i+"thread1 is executing");
			}
		}
	}
	public void race2() {
		synchronized (this) {
			for(int i=5;i>=1;i--) {
				System.out.println(i+"thread2 is executing");
			}
		}
	}
}
