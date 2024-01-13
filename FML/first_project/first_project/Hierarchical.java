package first_project;

class H1{
	void test() {
		System.out.println("H1");
	}
}

class H2 extends H1{
	void test2() {
		System.out.println("H2");
	}
}

public class Hierarchical extends H1 {
	public static void main(String[] args) {
		Hierarchical m = new Hierarchical();
		m.test();
		
		System.out.println("-----------------");
		
		H2 o = new H2();
		
		o.test();
		o.test2();
	}
}
