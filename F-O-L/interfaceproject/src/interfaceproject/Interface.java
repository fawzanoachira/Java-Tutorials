package interfaceproject;

public class Interface implements Sample,Sample1 {
	
	@Override
	public void test() {
		System.out.println("interface");
	}
	
	public static void main(String[] args) {
		Interface m = new Interface();
		
		m.test();
	}
}
