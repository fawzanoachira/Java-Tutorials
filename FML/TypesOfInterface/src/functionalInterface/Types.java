package functionalInterface;

public interface Types {
	public void test();
	
	public default void test1() {
		System.out.println("hiii from non static method in interface");
	}
	
	public static void test2() {
		System.out.println("hiii from static method in interface");
	}
}
