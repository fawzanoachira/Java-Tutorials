package interface_projects;

public class Sample implements InterfaceJdk,Sample1 {
	
//	@Override
//	public void test() {
//		System.out.println("overrided non static method in interface");
//	}
	
	
	public static void main(String[] args) {
		Sample m = new Sample();
		
		m.test();
		InterfaceJdk.test1();
		Sample1.test1();
	}

	@Override
	public void test() {
		InterfaceJdk.super.test();
		Sample1.super.test();
	}
}
