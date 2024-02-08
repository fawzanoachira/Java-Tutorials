package threadClassof24th;

public class Task {
	synchronized static public void race1() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+" thread1 is executing");
		}
	}
	synchronized static public void race2() {
		for(int i=5;i>=1;i--) {
			System.out.println(i+" thread2 is executing");
		}
	}
}
