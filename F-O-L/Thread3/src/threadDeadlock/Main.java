package threadDeadlock;

public class Main extends Thread{
	A a = new A();
	B b = new B();
	
	public Main() {
		Thread t = new Thread(this);
//		System.out.println(t.getName());
		t.start();
		a.foo(b);
	}
	
	@Override
	public void run() {
		b.boo(a);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
