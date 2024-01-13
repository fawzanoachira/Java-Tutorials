package java_intermediate;

class overrided{
	void test() {
		System.out.println("hello");
	}
}

public class MethodOverriding extends overrided{
	@Override
	void test() {
		System.out.println("hiii");
	}
	
	public static void main(String[] args) {
		MethodOverriding m = new MethodOverriding();
		 m.test();
	}
}
