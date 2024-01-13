package first_project;

class Hy3{
	void test3() {
		System.out.println("Hy3");
	}
}

class Hy1{
	void test() {
		System.out.println("Hy1");
	}
}

class Hy2 extends Hy1{
	void test2() {
		System.out.println("Hy2");
	}
}

public class HybridInheritance extends Hy1 {
	public static void main(String[] args) {
		HybridInheritance m = new HybridInheritance();
		m.test();
		
		System.out.println("-----------------");
		
		Hy2 o = new Hy2();
		
		o.test();
		o.test2();
	}
}
