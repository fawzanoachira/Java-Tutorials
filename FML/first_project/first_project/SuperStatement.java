package first_project;

class SuperTest{
	
	public SuperTest(int a, int b) {
		System.out.println(a+b);
	}
	
}

class SuperTest2 extends SuperTest{

	public SuperTest2(int a, int b) {
		super(a, b);
	}
	
}

public class SuperStatement extends SuperTest{
	
	public SuperStatement() {
		super(10,20);
	}
	
	public static void main(String[] args) {
		SuperTest2 t = new SuperTest2(10,20);
	}
}
